package accessnyc.response;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class EligibleProgram implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String code;
   private java.lang.String level;
   private java.lang.String rulePart;
   private java.lang.String notes;

   public EligibleProgram()
   {
   }

   public java.lang.String getCode()
   {
      return this.code;
   }

   public void setCode(java.lang.String code)
   {
      this.code = code;
   }

   public java.lang.String getLevel()
   {
      return this.level;
   }

   public void setLevel(java.lang.String level)
   {
      this.level = level;
   }

   public java.lang.String getRulePart()
   {
      return this.rulePart;
   }

   public void setRulePart(java.lang.String rulePart)
   {
      this.rulePart = rulePart;
   }

   public java.lang.String getNotes()
   {
      return this.notes;
   }

   public void setNotes(java.lang.String notes)
   {
      this.notes = notes;
   }

   public EligibleProgram(java.lang.String code, java.lang.String level,
         java.lang.String rulePart, java.lang.String notes)
   {
      this.code = code;
      this.level = level;
      this.rulePart = rulePart;
      this.notes = notes;
   }

}