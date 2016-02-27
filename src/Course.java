
import java.util.*;
public class Course 
{
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
      className = course;
      department = classdepartment;
   
   }
   
}