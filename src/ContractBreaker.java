
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class ContractBreaker {
    public static void main(String[] args) {

        Glass plastic = new Glass(Glass.Size.BIG,"Plastic");
        Glass glass = new Glass(Glass.Size.BIG,"glass");

        Set<Glass> set = new HashSet<Glass>();
        set.add(plastic);
        set.add(glass);

        System.out.println(set);

        Set<Glass> treeSet = new TreeSet<Glass>();
        treeSet.add(plastic);
        treeSet.add(glass);
        System.out.println(treeSet);

    }

}

 class Glass implements Comparable<Glass>{

    public enum Size{
        BIG(3),MEDIUM(2),SMALL(1);
        private int size;
        Size(int size)
        {
            this.size=size;
        }
        public int getSize()
        {
            return size;
        }
    };
    private String material;
    private Size size;

    public Glass(Size size,String material)
    {
        this.size=size;
        this.material=material;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((material == null) ? 0 : material.hashCode());
        result = prime * result + ((size == null) ? 0 : size.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Glass other = (Glass) obj;
        if (size != other.size)
            return false;
        return true;
    }

    @Override
    public int compareTo(Glass o) {
        if(this.size.getSize()  < o.size.getSize())
        {
            return 0;
        }
        else if(this.size.getSize() > o.size.getSize())
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Glass [material=" + material + ", size=" + size + "]";
    }
}

