import java.math.BigInteger;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

 class FactorialSquareCalculatorTest extends RecursiveTask<BigInteger> {
     private BigInteger n;
     int fact = 1 ;

    FactorialSquareCalculatorTest(BigInteger n) {
        this.n = n;
    }

    @Override
    protected BigInteger compute() {
        if (n.compareTo(BigInteger.valueOf(1)) <= 0) {
            return n;
        }
        FactorialSquareCalculatorTest calculator = new FactorialSquareCalculatorTest(n.subtract(BigInteger.ONE));
        calculator.fork();


        return n.multiply(calculator.join());

    }
}

public class FactorialSquareCalculator{

    public static void main (String [] args){

        ForkJoinPool forkJoinPool = new ForkJoinPool();
        FactorialSquareCalculatorTest calculator = new FactorialSquareCalculatorTest(BigInteger.valueOf(5));
        forkJoinPool.invoke(calculator);
        System.out.println(calculator.join().intValue());

    }

}