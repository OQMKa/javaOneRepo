import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SchedulerExecutorServiceMethods {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(3);
        
        scheduler.schedule(()->System.out.println("task1..3"),1,TimeUnit.SECONDS);
        
            scheduler.schedule(()->
                System.out.println("Initializing shutdown..."),
                2,
                TimeUnit.SECONDS
            );
        
        scheduler.schedule(()->System.out.println("shut down!"),
            3,
            TimeUnit.SECONDS);

        
        
    }
}
