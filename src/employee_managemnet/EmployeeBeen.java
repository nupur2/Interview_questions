package employee_managemnet;

import java.util.List;

public class EmployeeBeen {
    private int id  = 1;
    private String name ;

    private int managerId;
    List<EmployeeBeen> subOrdinates;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    EmployeeBeen(String name){

        this.name = name ;
        this.id++;
        this.managerId = id ;
    }

    void addSubOrdinate(EmployeeBeen employeeBeen){

    }
    void getSubOrdinate(EmployeeBeen employeeBeen){

    }
}
