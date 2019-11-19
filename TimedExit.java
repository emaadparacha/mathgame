import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimedExit {
   Timer timer = new Timer();
   TimerTask exitApp = 
      new TimerTask() {
         public void run() {
            
            System.exit(0);
         }
      };
   
   public TimedExit(int sec) {
      timer.schedule(exitApp, new Date(System.currentTimeMillis()+sec*1000));
   }
      
      
   	
     
   
}