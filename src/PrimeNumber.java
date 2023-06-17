import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class PrimeNumber {
    public static void main(String[] args) {

        int n = 10 ;
       for(int i=0 ;i< n ;i++){

           if(i%2==0){
               System.out.println(i);
           }
       }

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 20);
        System.out.println(numbers.stream()
                .filter(PrimeNumber::isPrime)
                .collect(toList()));
    }
    private static boolean isPrime(int n){
        if(n%2==0){
            return true ;
        }
        return false ;
    }
}
