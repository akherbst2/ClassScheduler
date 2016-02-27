
import java.util.*;
/**
 * Only adds the course if it is not a repeat in the file
 * 
 * 
 * 
*/
public class Course 
{
   //
   private Integer cle;
   private String className;
   private String department;
//    
   public Course()
   {
      throw new IllegalArgumentException
         ("You must enter parameters for the class");
   }
   
   public Course(String classdepartment, String course)
   {
      cle = 0;
      className = course;
      department = classdepartment;
   
   }
   
   public Integer getCLE() {
      return cle;
   }
   
   public void setCLE(Integer i) {
      cle = i;
   }
   
   public String getName() {
      return className;
   }
   
   public String getDepartment() {
      return department;
   }
   
}