// import org.apache.poi.ss.usermodel.Cell;
// import org.apache.poi.ss.usermodel.Row;
// import org.apache.poi.ss.usermodel.Sheet;
// import org.apache.poi.ss.usermodel.Workbook;
// import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.*;

public class BackEndManager {
//List of all classes read straight from file
   private ListOfClasses allClasses;
   //Lists classes by department ("CS", "MATH", etc.)
   private HashMap<String, ListOfClasses> classesByDepartment;
   //Lists classes by the CLE.
   //If Class does not belong to a CLE, then the CLE of the class will = 0
   private HashMap<Integer, ListOfClasses> classesByCLE;
   private HashMap<String, ListOfClasses> classesByMajorRequirement;
   
   private ListOfClasses myClasses;
   private final int NUM_CLES = 8;
   
   
   public BackEndManager() {
      allClasses = new ListOfClasses();
      myClasses = new ListOfClasses();
      classesByCLE = new HashMap<Integer, ListOfClasses>();
      readGPAFromFile("grade_distribution.csv");
      
      
      
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
   
   //Sets all the GPAs of each class in AllClasses
   public ListOfClasses readGPAFromFile(String filename) {
      ListOfClasses output = new ListOfClasses();
      int n = 0;
      double sum = 0;
      String prevProf = "";
      String prevDept = "";
      Integer prevCourse = 0;
      try {
         Scanner sc = new Scanner(new File(filename));
         sc.nextLine();
         sc.nextLine();
         sc.nextLine();
         sc.nextLine();
         sc.nextLine();
         while(sc.hasNextLine()) {
            String data = sc.nextLine();
            String[] line = data.split(",");
            //System.out.println(data);
            //If they are the same course as previous line
            
            sum += Double.parseDouble(line[7]);
            n++;
            if (!((line[0].equals(prevDept))&&(Integer.parseInt(line[1]) == prevCourse)&&(line[3].equals(prevProf)))) {
            // Course(String className, String Professor, String department, Integer courseNum, Integer cle)
               Course crs = new Course(line[2], line[3], line[0], Integer.parseInt(line[1]), 0);
               crs.setGPA(sum/n);
               allClasses.add(crs);
               
               n = 0;
               sum = 0;
               prevProf = line[3];
               prevDept = line[0];
               prevCourse = Integer.parseInt(line[1]);
            } 
         }
         //if (line[1].equals
      }
      catch (FileNotFoundException e) {
         e.printStackTrace();
      }
      return output;
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