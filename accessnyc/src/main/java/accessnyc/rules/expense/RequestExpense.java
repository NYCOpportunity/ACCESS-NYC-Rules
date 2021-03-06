package accessnyc.rules.expense;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class RequestExpense implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private accessnyc.request.Person person;
   private java.lang.Float amount;
   private java.lang.String type;
   private java.lang.String frequency;

   public RequestExpense()
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

   public java.lang.String getType()
   {
      return this.type;
   }

   public void setType(java.lang.String type)
   {
      this.type = type;
   }

   public java.lang.String getFrequency()
   {
      return this.frequency;
   }

   public void setFrequency(java.lang.String frequency)
   {
      this.frequency = frequency;
   }

   public RequestExpense(accessnyc.request.Person person,
         java.lang.Float amount, java.lang.String type,
         java.lang.String frequency)
   {
      this.person = person;
      this.amount = amount;
      this.type = type;
      this.frequency = frequency;
   }

}