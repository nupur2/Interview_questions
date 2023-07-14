import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchProgram {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        CountDownLatch latch = new CountDownLatch(2);

        for (int i = 0; i < 2; i++) {
            executorService.submit(() -> {
                        try {
                           latch.countDown();
                            System.out.println("submittin the task");
                        } catch (Exception e) {
                            Thread.currentThread().interrupt();
                        }

                    }
            );

        }

        //latch.await();

    }

}
