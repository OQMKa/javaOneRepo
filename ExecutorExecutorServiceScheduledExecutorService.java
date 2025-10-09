import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


//(Executor, ExecutorService, and ScheduledExecutorService) 
// are part of Java’s concurrency framework used to run tasks in 
// separate threads without manually managing threads.
public class ExecutorExecutorServiceScheduledExecutorService{
    public static void main(String[] args) {

        // 1. Executor Interface of Concurrency Framework.

        Executor exe = Executors.newFixedThreadPool(2);
        exe.execute(()->System.out.println("1. Executor Interface with only one method - execute()"));
        

        //  // You can’t shut down Executor (no shutdown() method)
        // 🧠 Key Point:
        // 1.Simple, no control over task lifecycle.
        // 2. You can’t shut it down or get results.

        
        
        //2. ExecutorService 

        // Common methods:
        // submit(Runnable) or submit(Callable)
        // shutdown() / shutdownNow()
        // invokeAll(), invokeAny()
        // Future.get() to get results
        // Extends Executor, adds methods to manage lifecycle, submit tasks, and get results.

        ExecutorService exe2 = Executors.newSingleThreadExecutor();
        exe2.submit(()->System.out.println("2. ExecutorService Interface; it has many mehtods like - submit(), shutdown(), shutdownNow(), invokeAll(),etc,."));
        exe2.submit(()-> System.out.println("submit() - Runnable"));
        Future<Integer> ab = exe2.submit(()->{ 
            return 42;
        });
        try {
            System.out.println("printing result of ExeecutorService with Future<T> - get() method."+ab.get());
        } catch (InterruptedException | ExecutionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        exe2.shutdown();

        // 🧠 Key Point:
        // More powerful and flexible.
        // Can get results, control shutdown, and use thread pools.


        // 3. ScheduledExecutorService
        ScheduledExecutorService exe3 = Executors.newScheduledThreadPool(2);
        exe3.schedule(()->System.out.println("3. SceduledExecutor Interface = scheduledExecutorService - scheduler() method"), 3,TimeUnit.SECONDS);
        exe3.shutdown();
    }
        
}
