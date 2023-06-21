import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AwaitTerminated {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(() -> System.out.println("Single task executed"));

        if (!executorService.isTerminated()) {
            awaitThreadPool(executorService);
           /* executorService.shutdown();
            if (executorService.awaitTermination(1, TimeUnit.MILLISECONDS))
                System.out.println("Executor service termination successful.");
            else System.out.println("Executor service termination unsuccessful.");
*/
        }


    }

    public static void awaitThreadPool(ExecutorService threadPool) {

        threadPool.shutdown();

        try {
            if (threadPool.awaitTermination(1, TimeUnit.MILLISECONDS)) {
                System.out.println("Executor service termination successful.");
                threadPool.shutdown();

            }else{
                System.out.println("Executor service termination unsuccessful.");
            }
        } catch (InterruptedException e) {
            System.out.println("Executor service termination unsuccessful. in catch");
            threadPool.shutdown();
            Thread.currentThread().interrupt();
        }
    }
}
