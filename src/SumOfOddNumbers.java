import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumOfOddNumbers {

    public static void main(String [] args){
        int sum = IntStream.of(13,16,97,25,77,10).filter((num) -> num %2 ==0) .sum() ;
        System.out.println(sum);

        List<Integer> numbers
                = Arrays.asList(2, 3, 4, 5, 2);

        // collect method returns a set
        List<Integer> squareSet
                = numbers.stream()
                 .map(x -> x * x)
                .collect(Collectors.toList());
        System.out.println(squareSet);


        int even = IntStream.of(13,16,97,25,77,10).boxed()
                .filter(x -> x % 2 == 0)
                .reduce(0, Integer::sum);

        System.out.println(even);

        IntStream.of(13,16,97,25,77,10).boxed()
                .filter(x -> x % 2 == 0)
                .forEach(System.out::println);

        List<String> words = Arrays.asList("GFG", "Geeks", "for",
                "GeeksQuiz", "GeeksforGeeks");

        Optional<String> longestString = words.stream()
                .reduce((word1, word2)
                        -> word1.length() > word2.length()
                        ? word1 : word2);

        // Displaying the longest String
        longestString.ifPresent(System.out::println);

        //IntStream.range(2, 8)

        List<Integer> unsorted = Arrays.asList(11, 2, 5, 3, 2, 55, 32, 34);

        List<Integer> sorted = unsorted.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sorted);

        List<String> names = Arrays.asList("James", "Mary", "Ken", "Joe");

        List<String> reversed =  names.stream().sorted(Comparator.reverseOrder()).toList();


    }
}
