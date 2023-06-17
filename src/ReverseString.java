import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {


    public static void main (String [] args){
        String text = "radar";
        System.out.println("Original string - " + text);
        System.out.println("Reversed string - " + reverse(text));

        System.out.println("Oh yes " + isPalindromeUsingIntStream("radarr"));

       IntStream.range(0, text.length()/2)
               .noneMatch((i) -> text.charAt(i) != text.charAt(text.length()-i -1));
    }


    public static String reverse(String input) {
        char[] characters = input.toCharArray();

        String reversed = input.chars()
                .mapToObj(c -> (char)c)
                .reduce("", (s,c) -> c+s, (s,c) -> c+s);

        System.out.println("updated " + reversed.equals(input));


       IntStream.range(0, characters.length)
                .mapToObj(i -> characters[(characters.length - 1) - i])
                        .forEach(System.out::print);



        int arr[] = {
               12,45,87,90,10
       };
        IntStream.range(0,arr.length).mapToObj(i -> arr[(arr.length-1)-i]).forEach(System.out::println);
         return new String(characters);
    }

    public static boolean isPalindromeUsingIntStream(String text) {
        String temp  = text.replaceAll("\\s+", "").toLowerCase();
        return IntStream.range(0, temp.length() / 2)
                .noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1));
    }
}
