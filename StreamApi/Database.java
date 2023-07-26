package StreamApi;

import java.util.ArrayList;
import java.util.List;

public class Database {

    public Database(){
        
    }
    
    public List<Employee> getEmployees(){
        List<Employee> list = new ArrayList<>();

        list.add(new Employee(1, "Rishab", "IT", 6000));
        list.add(new Employee(2, "Vivek", "ENTC", 2000));
        list.add(new Employee(3, "Wali", "COMP", 5500));
        list.add(new Employee(4, "Talele", "CIVIL", 3000));

        return list;
    }
}
