import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ClassOne{
    public static void main(String[] a){
        
        ExecutorService executor = Executors.newFixedThreadPool(3);

       // System.out.println("and from now on i will prioritize myself first always.");
       for (int i =1;i<=10;i++){
        int finalI = i;
        System.out.println(fact(i));
        executor.submit(()->{
            int result = fact(finalI);
            System.out.println(result);
        });
    }
    long endTime  = System.currentTimeMillis();
    System.out.println("endtime : " + endTime);
    }
    
    public static int fact(int n){
        if (n == 0) return 1;
        // Thread.sleep(1000);
        return n*fact(n-1);

    }
}