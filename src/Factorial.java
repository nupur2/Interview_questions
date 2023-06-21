public class Factorial {
    public static void main(String[] args){


        System.out.println("factorial of given number" +  factorial(10));
    }

    private static int factorial(int n) {
        int fact =1 ;
      for(int i =2 ;i<=n ;i++){
          fact = fact * i ;
      }
        return fact;
    }

}
