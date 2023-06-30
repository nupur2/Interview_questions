public class Pattern {
    public static void main(String[] args) {

        boolean value = true;

        int j = 5;
        for (int i = 5; i >= 0; i--) {

            System.out.print("*");

            if (i == 0 && j >= 0) {
                j = j - 1;
                i = j;
                System.out.println();
            }

        }
    }
}
