public class PrintThreadsSequentiallyMainLock {
    public static void main(String[] args) {
        PrintSequenceRunnable runnable1=new PrintSequenceRunnable(1);
        PrintSequenceRunnable runnable2=new PrintSequenceRunnable(2);
        PrintSequenceRunnable runnable3=new PrintSequenceRunnable(0);

        Thread t1=new Thread(runnable1,"T1");
        Thread t2=new Thread(runnable2,"T2");
        Thread t3=new Thread(runnable3,"T3");
        t1.start();
        t2.start();
        t3.start();
    }
}

class PrintSequenceRunnable implements Runnable {

    int printNumbersUpTo = 10;
    static int num = 1;
    int reminder;
    static Object lock = new Object();

    PrintSequenceRunnable(int reminder){

        this.reminder = reminder;
    }

    @Override
    public void run() {
        while (num < printNumbersUpTo){

            synchronized (lock){

                while (num%3 != reminder){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                       e.printStackTrace();
                    }
                    if (num % 3 == reminder &&
                            num <= printNumbersUpTo) {
                        System.out.print(Thread.currentThread().getName()
                                + "-" + num + "\t");
                    }
                    num++;
                    lock.notifyAll();
                }
            }
        }

    }
}