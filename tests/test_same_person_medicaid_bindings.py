import os
import re
import unittest
from pathlib import Path


RULES_ROOT = Path(os.environ.get("RULES_ROOT", Path(__file__).resolve().parents[1]))


def rule_block(path, name):
    text = (RULES_ROOT / path).read_text()
    match = re.search(rf'rule "{re.escape(name)}".*?\nend', text, re.DOTALL)
    if match is None:
        raise AssertionError(f"Could not find rule {name!r} in {path}")
    return match.group(0)


def person_patterns(block):
    return re.findall(r"Person\((.*?)\)", block, re.DOTALL)


class TestSamePersonMedicaidBindings(unittest.TestCase):
    def test_nfp_binds_pregnancy_and_medicaid_to_same_person(self):
        patterns = person_patterns(
            rule_block(
                "accessnyc/rules/S2R029.drl",
                "S2R029 pregnant, medicaid or disability medicaid",
            )
        )

        self.assertEqual(len(patterns), 1)
        self.assertIn("pregnant == true", patterns[0])
        self.assertIn("benefitsMedicaid == true", patterns[0])
        self.assertIn("benefitsMedicaidDisability == true", patterns[0])

    def test_home_care_binds_age_or_disability_and_medicaid_to_same_person(self):
        patterns = person_patterns(
            rule_block(
                "accessnyc/rules/S2R037.drl",
                "s2_r037 disabled/blind, 65+, medicaid or disability medicaid",
            )
        )

        self.assertEqual(len(patterns), 1)
        self.assertIn("disabled == true", patterns[0])
        self.assertIn("blind == true", patterns[0])
        self.assertIn("age >= 65", patterns[0])
        self.assertIn("benefitsMedicaid == true", patterns[0])
        self.assertIn("benefitsMedicaidDisability == true", patterns[0])


if __name__ == "__main__":
    unittest.main()
