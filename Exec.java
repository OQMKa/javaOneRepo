import java.time.zone.ZoneOffsetTransitionRule.TimeDefinition;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Exec {
    public static void main(String[] args) {
        // ScheduledExecutorService exe4 = Executors.newSingleThreadScheduledExecutor();
        // exe4.submit(()->{System.out.println("executor(@FunctionalInterface[with execute()-only one abstract method.]) - executors(class)");});
        

        ExecutorService exe5 = Executors.newSingleThreadExecutor();
        Future<Integer> ft = exe5.submit(()->{
            return 23;});
        try {
            System.out.println("using submit -> of callble interface!"+ft.get());
        } catch (InterruptedException | ExecutionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        exe5.shutdown();
    }
}
