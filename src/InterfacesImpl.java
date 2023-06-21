public class InterfacesImpl {


    public static void main(String[] args) {
        InterfaceA objA = new InterfaceC();
        InterfaceB objB = new InterfaceC();
        // InterfaceC objC = new InterfacesImpl();

        //all the method calls below are going to same concrete implementation
        objA.doSomething();
        objB.doSomething();
        // objC.doSomething();
    }

}

interface InterfaceA {

    public void doSomething();
}

interface InterfaceB {

    public void doSomething();
}

class InterfaceC implements InterfaceA, InterfaceB {

    @Override
    public void doSomething() {
        System.out.println(" implementation of concrete class");
    }

}