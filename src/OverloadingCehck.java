public class OverloadingCehck {

    public static void main(String [] args){

        Atest a = new Atest();
        a.method1(null);
    }
}

class Atest {

//method error


    public void method1(Object o) {
        System.out.println("null" + o);
    }

    public void method1(String s) {
        System.out.println("..........." + s);
    }

}
