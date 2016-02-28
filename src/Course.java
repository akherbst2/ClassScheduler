
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
   
   private double gpa;   
   private String className;
   private String professor;
   private String department;
   Integer courseNum;
   private Integer cle;
//    
   public Course()
   {
      throw new IllegalArgumentException
         ("You must enter parameters for the class");
   }
   
   @Override
   public String toString() {
      StringBuilder bldr = new StringBuilder();
      bldr.append(department);
      bldr.append(", ");
      bldr.append(courseNum);
      bldr.append(", ");
      bldr.append(gpa);
      return bldr.toString();
   }
   
   public Course(String classDepartment, String course)
   {
      cle = 0;
      className = course;
      department = classDepartment;
      timeBlocks = new ArrayList<TimeBlock>();
   }
   
   public Course(String className, String Professor, String department, Integer courseNum, Integer cle) {
      this.department = department;
      this.className = className;
      this.cle = cle;   
      this.courseNum = courseNum;
      timeBlocks = new ArrayList<TimeBlock>();
   }
   
   public Integer getCLE() {
      return cle;
   }
   
   public void setGPA(double gpa) {
      this.gpa = gpa;
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
   
   public String getProfessor() {
      return professor;
   }
   
}