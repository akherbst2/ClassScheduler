public class Time extends Object implements Comparable {
   
   //1 if a start time, -1 if an end time
   int key;
   int time;
      
   public Time(int t, int k) {
   //start = 1, end = -1
      key = k;
      //(100,000 * weekday + 60*hr + min)
      time = t;
   }
      
   @Override
   public int compareTo(Object other) {
      Time otherTime = (Time) other;
      return (this.time == otherTime.time) ? (this.key-otherTime.key) : (this.time - otherTime.time);
   }
      
   @Override
      public int hashCode () {
      return time;
      
   }
}