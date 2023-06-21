public class ConstructorTest {

    public static void main (String [] args) {

        A a = new A();

        A b = new B();

        B bb = (B) new A();

    }
    }


    class A{

    A(){

        System.out.println("A");
    }


        public void method1(Object o) {
        }
    }

    class B extends A{

    B(){
        //super();

        System.out.println("B");

    }


    }

    class C extends  B{


    C(){
        System.out.println("C");
    }


    }