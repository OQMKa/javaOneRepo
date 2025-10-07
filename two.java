import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class two {

    public static void main(String[] args) throws ExecutionException, InterruptedException{
        ExecutorService executor2 = Executors.newSingleThreadExecutor();
        Future<?> future = executor2.submit(()->System.out.println("task to perform"));
        future.get();
        // executor2.shutdown();  --> if we keep it uncommented HERE; it will shut down the execution in between.
        Future<String> submit = executor2.submit(()->System.out.println("task to do"),"success");
        executor2.shutdown();
    }
}