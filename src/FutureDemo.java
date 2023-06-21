import java.util.concurrent.*;

public class FutureDemo {

    public String invoke() {

        String str = null;

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Future<String> future = executorService.submit(() -> {
            // Task
            Thread.sleep(10000l);
            return "Hellow world";
        });

        future.cancel(false);

        try {
            future.get(20, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e1) {
            e1.printStackTrace();
        }

        if (future.isDone() && !future.isCancelled()) {
            try {
                str = future.get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        return str;

    }
}
