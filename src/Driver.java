public class Driver {

   public static void main(String[] args) {
      BackEndManager backend = new BackEndManager();
      ListOfClasses allClasses = backend.getAllClasses();
      
      for(int k = 0; k < 10; k++) {
         System.out.println(allClasses.get(k));
      }
   
   }

}