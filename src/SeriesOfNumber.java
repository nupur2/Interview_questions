import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SeriesOfNumber {

    public static void main (String [] args){
        NumbersGenerator numbersGenerator = new NumbersGenerator(3, 10);

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        try {
            executorService.submit(new SequenceGeneratorTask(numbersGenerator, 1));
            executorService.submit(new SequenceGeneratorTask(numbersGenerator, 2));
            executorService.submit(new SequenceGeneratorTask(numbersGenerator, 0));
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(executorService != null)
                executorService.shutdown();
        }

    }
}

class SequenceGeneratorTask implements Runnable{
    private NumbersGenerator numbersGenerator;
    private int result;

    SequenceGeneratorTask(NumbersGenerator numbersGenerator, int result){
        this.numbersGenerator = numbersGenerator ;
        this.result = result;

    }
    @Override
    public void run() {
        numbersGenerator.printNumbers(result);
    }
}

class NumbersGenerator {

    private int number = 1;
    private int numberOfThreads;
    private int totalNumbersInSequence;
    public NumbersGenerator(int numberOfThreads, int totalNumbersInSequence) {
        super();
        this.numberOfThreads = numberOfThreads;
        this.totalNumbersInSequence = totalNumbersInSequence;
    }

    public void printNumbers(int result) {
        synchronized (this) {
            while (number < totalNumbersInSequence-1) {
                while (number % numberOfThreads != result) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println(Thread.currentThread().getName()+" "+number++);
                notifyAll();
            }
        }
    }
}