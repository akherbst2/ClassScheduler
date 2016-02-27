import java.util.Collections;
import java.lang.IllegalStateException;
import java.util.ArrayList;

public class TimeBlock extends ArrayList<Time> {
   //Is an ArrayList of start and end times

   public TimeBlock () {
   }
   
   public void addTime(int start, int end) {
      //throws error if trying to add two times that overlap
      try {
         if (end < start) {
            throw new IllegalStateException();
         }
         this.add(new Time(start, 1));
         this.add(new Time(end, -1));   
      
      }
      catch(IllegalStateException e) {
         System.out.print("This is not a valid time block.  Start = " + start + ", End = " + end);
         e.printStackTrace();
      }
   }
   
   public boolean overlaps(TimeBlock other) {
      //sorts my times and oter times together
      ArrayList<Time> allTimes = new ArrayList<Time>();
      
      //Collections.copy(this);
      allTimes.addAll(this);
      allTimes.addAll(other);
      Collections.sort(allTimes);
      int sum = 0;
      //goes through linearly
      //when it comes across a sum > 1, return true
      //after loop, reutrn false
      
      for(Time t:allTimes) {
         sum += t.key;
         if (sum > 1) {
            return true;
         }
      }   
      return false;
   }
   
}
