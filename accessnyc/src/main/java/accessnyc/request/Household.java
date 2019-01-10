package accessnyc.request;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Household implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String city;
   private java.lang.Integer members;

   private java.lang.Boolean livingRenting;

   private java.lang.String livingRentalType;

   private java.lang.Float cashOnHand;

   private java.lang.Boolean livingOwner;

   private java.lang.Boolean livingHotel;

   public Household()
   {
   }

   public java.lang.String getCity()
   {
      return this.city;
   }

   public void setCity(java.lang.String city)
   {
      this.city = city;
   }

   public java.lang.Integer getMembers()
   {
      return this.members;
   }

   public void setMembers(java.lang.Integer members)
   {
      this.members = members;
   }

   public java.lang.Boolean getLivingRenting()
   {
      return this.livingRenting;
   }

   public void setLivingRenting(java.lang.Boolean livingRenting)
   {
      this.livingRenting = livingRenting;
   }

   public java.lang.String getLivingRentalType()
   {
      return this.livingRentalType;
   }

   public void setLivingRentalType(java.lang.String livingRentalType)
   {
      this.livingRentalType = livingRentalType;
   }

   public java.lang.Float getCashOnHand()
   {
      return this.cashOnHand;
   }

   public void setCashOnHand(java.lang.Float cashOnHand)
   {
      this.cashOnHand = cashOnHand;
   }

   public java.lang.Boolean getLivingOwner()
   {
      return this.livingOwner;
   }

   public void setLivingOwner(java.lang.Boolean livingOwner)
   {
      this.livingOwner = livingOwner;
   }

   public java.lang.Boolean getLivingHotel()
   {
      return this.livingHotel;
   }

   public void setLivingHotel(java.lang.Boolean livingHotel)
   {
      this.livingHotel = livingHotel;
   }

   public Household(java.lang.String city, java.lang.Integer members,
         java.lang.Boolean livingRenting, java.lang.String livingRentalType,
         java.lang.Float cashOnHand, java.lang.Boolean livingOwner,
         java.lang.Boolean livingHotel)
   {
      this.city = city;
      this.members = members;
      this.livingRenting = livingRenting;
      this.livingRentalType = livingRentalType;
      this.cashOnHand = cashOnHand;
      this.livingOwner = livingOwner;
      this.livingHotel = livingHotel;
   }

}