package accessnyc.rules.income;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class IncomePersonSESItemMonthly implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private accessnyc.request.Person person;
   private java.lang.Float convertedAmount;
   private java.lang.String type;

   public IncomePersonSESItemMonthly()
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

   public java.lang.Float getConvertedAmount()
   {
      return this.convertedAmount;
   }

   public void setConvertedAmount(java.lang.Float convertedAmount)
   {
      this.convertedAmount = convertedAmount;
   }

   public java.lang.String getType()
   {
      return this.type;
   }

   public void setType(java.lang.String type)
   {
      this.type = type;
   }

   public IncomePersonSESItemMonthly(accessnyc.request.Person person,
         java.lang.Float convertedAmount, java.lang.String type)
   {
      this.person = person;
      this.convertedAmount = convertedAmount;
      this.type = type;
   }

}