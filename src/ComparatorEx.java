import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorEx {

    public static void main (String [] args){

       /* Comparator<Employee> emp = (e1,e2) -> {
            return e1.getName().compareTo(e2.getName());
        };*/


        Employee e1 = new Employee(12, "nupur");
        Employee e3 = new Employee(11, "neha");
        Employee e2 = new Employee(435,"amit");
        List<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);

        List<Employee> list2 = list.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getId)).collect(Collectors.toList());

        List<Employee> list3 = list.stream().sorted(Comparator.comparing(Employee::getId).reversed()).toList();
        System.out.println(list2);

        System.out.println("sssssssssssssssssssssssssss");
        System.out.println(list3);

    }



}
