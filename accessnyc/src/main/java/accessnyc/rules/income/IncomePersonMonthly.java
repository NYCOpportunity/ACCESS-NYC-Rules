package accessnyc.rules.income;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class IncomePersonMonthly implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private accessnyc.request.Person person;
   private java.lang.Float amount;

   public IncomePersonMonthly()
   {
   }

   public accessnyc.request.Person getPerson()
   {
      return this.person;
   }

   public void setPerson(accessnyc.request.Person person)
   {
      this.person = person;
   }

   public java.lang.Float getAmount()
   {
      return this.amount;
   }

   public void setAmount(java.lang.Float amount)
   {
      this.amount = amount;
   }

   public IncomePersonMonthly(accessnyc.request.Person person,
         java.lang.Float amount)
   {
      this.person = person;
      this.amount = amount;
   }

}