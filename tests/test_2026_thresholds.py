import os
import re
import unittest
from decimal import Decimal
from pathlib import Path


RULES_ROOT = Path(os.environ.get("RULES_ROOT", Path(__file__).resolve().parents[1]))


def read_rule(path):
    return (RULES_ROOT / path).read_text()


def parse_household_yearly_bounds(text):
    return {
        int(members): (Decimal(lower), Decimal(upper))
        for members, lower, upper in re.findall(
            r"Household\(members == (\d+)\) and "
            r"IncomeHouseholdTotalYearly\(amount > ([0-9.]+), amount <= ([0-9.]+)\)",
            text,
        )
    }


def parse_household_yearly_lower_bounds(text):
    return {
        int(members): Decimal(lower)
        for members, lower in re.findall(
            r"Household\(members == (\d+)\) and "
            r"IncomeHouseholdTotalYearly\(amount > ([0-9.]+)\)",
            text,
        )
    }


class TestHealthProgramThresholds2026(unittest.TestCase):
    def test_essential_plan_uses_2026_medicaid_and_essential_plan_bounds(self):
        thresholds = parse_household_yearly_bounds(read_rule("accessnyc/rules/S2R058.drl"))

        self.assertEqual(
            thresholds,
            {
                1: (Decimal("22025"), Decimal("39900")),
                2: (Decimal("29864"), Decimal("54100")),
                3: (Decimal("37702"), Decimal("68300")),
                4: (Decimal("45540"), Decimal("82500")),
                5: (Decimal("53379"), Decimal("96700")),
                6: (Decimal("61217"), Decimal("110900")),
                7: (Decimal("69056"), Decimal("125100")),
                8: (Decimal("76894"), Decimal("139300")),
            },
        )

    def test_child_health_plus_uses_2026_medicaid_handoff_bounds(self):
        text = read_rule("accessnyc/rules/S2R057.drl")
        under_one_text, age_one_to_eighteen_text = text.split('rule "s2_r057 age 1-18"')

        self.assertEqual(
            parse_household_yearly_lower_bounds(under_one_text),
            {
                1: Decimal("35591"),
                2: Decimal("48258"),
                3: Decimal("60924"),
                4: Decimal("73590"),
                5: Decimal("86257"),
                6: Decimal("98923"),
                7: Decimal("111590"),
                8: Decimal("124256"),
            },
        )
        self.assertEqual(
            parse_household_yearly_lower_bounds(age_one_to_eighteen_text),
            {
                1: Decimal("24579"),
                2: Decimal("33326"),
                3: Decimal("42073"),
                4: Decimal("50820"),
                5: Decimal("59568"),
                6: Decimal("68315"),
                7: Decimal("77062"),
                8: Decimal("85809"),
            },
        )

    def test_nfp_uses_2026_pregnant_medicaid_bounds(self):
        thresholds = {
            int(members): Decimal(upper)
            for members, upper in re.findall(
                r"MembersPlusPregnant\(value == (\d+)\) and "
                r"IncomeHouseholdTotalYearly\(amount <= ([0-9.]+)\)",
                read_rule("accessnyc/rules/S2R029.drl"),
            )
        }

        self.assertEqual(
            thresholds,
            {
                1: Decimal("35591"),
                2: Decimal("48258"),
                3: Decimal("60924"),
                4: Decimal("73590"),
                5: Decimal("86257"),
                6: Decimal("98923"),
                7: Decimal("111590"),
                8: Decimal("124256"),
                9: Decimal("136923"),
            },
        )

    def test_child_care_voucher_family_size_two_keeps_decimal_limit(self):
        threshold = re.search(
            r"ChildCareVoucherHouseholdMembers\(value == 2\).*?"
            r"IncomeChildCareVoucherTotalMonthly\(amount <= ([0-9.]+)\)",
            read_rule("accessnyc/rules/S2R040.drl"),
            re.DOTALL,
        )

        self.assertIsNotNone(threshold)
        self.assertEqual(Decimal(threshold.group(1)), Decimal("6435.50"))


if __name__ == "__main__":
    unittest.main()
