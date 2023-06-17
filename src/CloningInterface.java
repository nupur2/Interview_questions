import java.util.Vector;

public class CloningInterface{

    public static void main(String[] args)  {
    System.out.println(new CloningInterface().clone());

    }

    @Override
    protected Object clone()  {
        return new CloningInterface();
    }
}
