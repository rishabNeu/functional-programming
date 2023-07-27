package Sorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import StreamApi.Database;
import StreamApi.Employee;

public class SortListDemo {

    public static void main(String[] args) {
       List<Employee> list =  new Database().getEmployees();
        
       // Traditional method
       //Collections.sort(list, new MyComparator());
        
       //Lambda Expression
       Collections.sort(list ,(o1,o2) -> (int) ((int) o1.getSalary() - o2.getSalary()) );
       System.out.println(list);

       //Stream sorting
       list.stream().sorted((o1,o2) -> (int) ((int) o2.getSalary() - o1.getSalary()))
       .forEach(emp -> System.out.println(emp.getSalary()));


    }
    
}

// class MyComparator implements Comparator<Employee>{

//     @Override
//     public int compare(Employee o1, Employee o2) {
//        return (int) ((int) o1.getSalary() - o2.getSalary());
//     }
    

// }
