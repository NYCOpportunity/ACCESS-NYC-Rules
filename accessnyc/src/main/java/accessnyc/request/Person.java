package accessnyc.request;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Person implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.Integer age;

   private java.util.List<accessnyc.request.Income> incomes;

   private java.lang.Boolean headOfHousehold;

   private java.lang.Boolean livingOwnerOnDeed;

   private java.lang.String headOfHouseholdRelation;

   private java.util.List<accessnyc.request.Expense> expenses;

   private java.lang.Boolean benefitsMedicaid;

   private java.lang.Boolean blind;

   private java.lang.Boolean disabled;

   private java.lang.Boolean livingRentalOnLease;

   private java.lang.Boolean pregnant;

   private java.lang.Boolean student;

   private java.lang.Boolean unemployed;

   private java.lang.Boolean unemployedWorkedLast18Months;

   private java.lang.Boolean veteran;

   public Person()
   {
   }

   public java.lang.Integer getAge()
   {
      return this.age;
   }

   public void setAge(java.lang.Integer age)
   {
      this.age = age;
   }

   public java.util.List<accessnyc.request.Income> getIncomes()
   {
      return this.incomes;
   }

   public void setIncomes(java.util.List<accessnyc.request.Income> incomes)
   {
      this.incomes = incomes;
   }

   public java.lang.Boolean getHeadOfHousehold()
   {
      return this.headOfHousehold;
   }

   public void setHeadOfHousehold(java.lang.Boolean headOfHousehold)
   {
      this.headOfHousehold = headOfHousehold;
   }

   public java.lang.Boolean getLivingOwnerOnDeed()
   {
      return this.livingOwnerOnDeed;
   }

   public void setLivingOwnerOnDeed(java.lang.Boolean livingOwnerOnDeed)
   {
      this.livingOwnerOnDeed = livingOwnerOnDeed;
   }

   public java.lang.String getHeadOfHouseholdRelation()
   {
      return this.headOfHouseholdRelation;
   }

   public void setHeadOfHouseholdRelation(java.lang.String headOfHouseholdRelation)
   {
      this.headOfHouseholdRelation = headOfHouseholdRelation;
   }

   public java.util.List<accessnyc.request.Expense> getExpenses()
   {
      return this.expenses;
   }

   public void setExpenses(java.util.List<accessnyc.request.Expense> expenses)
   {
      this.expenses = expenses;
   }

   public java.lang.Boolean getBenefitsMedicaid()
   {
      return this.benefitsMedicaid;
   }

   public void setBenefitsMedicaid(java.lang.Boolean benefitsMedicaid)
   {
      this.benefitsMedicaid = benefitsMedicaid;
   }

   public java.lang.Boolean getBlind()
   {
      return this.blind;
   }

   public void setBlind(java.lang.Boolean blind)
   {
      this.blind = blind;
   }

   public java.lang.Boolean getDisabled()
   {
      return this.disabled;
   }

   public void setDisabled(java.lang.Boolean disabled)
   {
      this.disabled = disabled;
   }

   public java.lang.Boolean getLivingRentalOnLease()
   {
      return this.livingRentalOnLease;
   }

   public void setLivingRentalOnLease(java.lang.Boolean livingRentalOnLease)
   {
      this.livingRentalOnLease = livingRentalOnLease;
   }

   public java.lang.Boolean getPregnant()
   {
      return this.pregnant;
   }

   public void setPregnant(java.lang.Boolean pregnant)
   {
      this.pregnant = pregnant;
   }

   public java.lang.Boolean getStudent()
   {
      return this.student;
   }

   public void setStudent(java.lang.Boolean student)
   {
      this.student = student;
   }

   public java.lang.Boolean getUnemployed()
   {
      return this.unemployed;
   }

   public void setUnemployed(java.lang.Boolean unemployed)
   {
      this.unemployed = unemployed;
   }

   public java.lang.Boolean getUnemployedWorkedLast18Months()
   {
      return this.unemployedWorkedLast18Months;
   }

   public void setUnemployedWorkedLast18Months(
         java.lang.Boolean unemployedWorkedLast18Months)
   {
      this.unemployedWorkedLast18Months = unemployedWorkedLast18Months;
   }

   public java.lang.Boolean getVeteran()
   {
      return this.veteran;
   }

   public void setVeteran(java.lang.Boolean veteran)
   {
      this.veteran = veteran;
   }

   public Person(java.lang.Integer age,
         java.util.List<accessnyc.request.Income> incomes,
         java.lang.Boolean headOfHousehold, java.lang.Boolean livingOwnerOnDeed,
         java.lang.String headOfHouseholdRelation,
         java.util.List<accessnyc.request.Expense> expenses,
         java.lang.Boolean benefitsMedicaid, java.lang.Boolean blind,
         java.lang.Boolean disabled, java.lang.Boolean livingRentalOnLease,
         java.lang.Boolean pregnant, java.lang.Boolean student,
         java.lang.Boolean unemployed,
         java.lang.Boolean unemployedWorkedLast18Months,
         java.lang.Boolean veteran)
   {
      this.age = age;
      this.incomes = incomes;
      this.headOfHousehold = headOfHousehold;
      this.livingOwnerOnDeed = livingOwnerOnDeed;
      this.headOfHouseholdRelation = headOfHouseholdRelation;
      this.expenses = expenses;
      this.benefitsMedicaid = benefitsMedicaid;
      this.blind = blind;
      this.disabled = disabled;
      this.livingRentalOnLease = livingRentalOnLease;
      this.pregnant = pregnant;
      this.student = student;
      this.unemployed = unemployed;
      this.unemployedWorkedLast18Months = unemployedWorkedLast18Months;
      this.veteran = veteran;
   }

}