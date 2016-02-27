import java.util.*;

public class BackEndManager {
//List of all classes read straight from file
   private ListOfClasses allClasses;
   //Lists classes by department ("CS", "MATH", etc.)
   private HashMap<String, ListOfClasses> classesByDepartment;
   //Lists classes by the CLE.
   //If Class does not belong to a CLE, then the CLE of the class will = 0
   private HashMap<Integer, ListOfClasses> classesByCLE;
   private ListOfClasses myClasses;
   private final int NUM_CLES = 8;
   
   
   public BackEndManager() {
      allClasses = new ListOfClasses(/**filename**/);
      
      myClasses = new ListOfClasses();
      
      for (int k = 0; k < NUM_CLES; k++) {
         classesByCLE.put(k, new ListOfClasses());
      }
      
      for (Course course:allClasses) {
         Integer cle = course.getCLE();
      
         if (!classesByCLE.containsKey(cle)) {
            classesByCLE.put(cle, new ListOfClasses());
         }
      
         
         if (course.getCLE() != 0) {
            //classesByCLE.put(cle,
         }
         //Implement get methods for class, etc.
      }
     
   }
   
   
   
   
   public void addClass() {
      //Adds a new class to myClasses   
   }
   
   public void removeClass() {
      //Removes a class from myClasses
   }
   
   public ListOfClasses getAllClasses() {
      return allClasses;
   }
   
   public ListOfClasses getClassByDept(String dept) {
      return classesByDepartment.get(dept);
   }
   
   public ListOfClasses getClassByCLE(Integer cle) {
      return classesByCLE.get(cle);
   }
  

}