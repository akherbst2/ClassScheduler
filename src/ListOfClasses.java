import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ListOfClasses extends ArrayList<Course>
{
   public ListOfClasses(String fileName)
   {
      super();
      Scanner scanner = null;
      try 
      {
         scanner = new Scanner (new File(fileName));
      } 
      catch (FileNotFoundException e) 
      {
         e.printStackTrace();
      }
      scanner.nextLine();
      while (scanner.hasNextLine())
      {
         String line = scanner.nextLine();
         String[] info = line.split(",");
         String department = info[0];
         String title = info[2];
         if (this.contains(info[2]))
         {
            continue;
         }
         Course course = new Course(department, title);
         this.add(course);
      }
   }
   
}