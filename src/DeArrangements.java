public class DeArrangements {
    public static void main (String[] args)
    {
        int n = 5;
        System.out.println( "Count of Derangements is "
                +countDer(n));

    }

    private static int countDer(int n) {
        if(n == 1 ) return 0;
        if(n == 2) return 1;

        return (n-1)*(countDer(n-1)+countDer(n-2));

    }
}
