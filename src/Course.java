
import java.util.*;
/**
 * Only adds the course if it is not a repeat in the file
 * 
 * 
 * 
*/
public class Course 
{
   //List of available time blocks for this particular class
   private ArrayList<TimeBlock> timeBlocks;
   private Integer cle;
   private String className;
   private String department;
//    
   public Course()
   {
      throw new IllegalArgumentException
         ("You must enter parameters for the class");
   }
   
   public Course(String classDepartment, String course)
   {
      cle = 0;
      className = course;
      department = classDepartment;
      timeBlocks = new ArrayList<TimeBlock>();
   }
   
   public Course(String department, String className, Integer cle) {
      this.department = department;
      this.className = className;
      this.cle = cle;   
      timeBlocks = new ArrayList<TimeBlock>();
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