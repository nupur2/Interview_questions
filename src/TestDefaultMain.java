public class TestDefaultMain {

    public static void main(String[] args){

        testDeafultMethod test= new testDeafultMethod();
        System.out.println("I am simple method" + test.squareRoot(5));
    }


}

class testDeafultMethod implements TestDeafualt{
    @Override
    public int squareRoot(int x) {
        return (x*x);
    }

}
