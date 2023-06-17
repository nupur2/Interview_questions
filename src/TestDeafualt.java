public interface TestDeafualt {
    public  default void test(){
        System.out.println("I am default method");
    }

    public int squareRoot(int x);
}
