package StreamApi;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {
    // new Database().getEmployees().stream();
    public static List<Employee> evaluateTax(){
        
         //using lambda expression to code 
        return new Database().getEmployees()
        .stream()
        .filter(emp -> emp.getSalary() > 5000)
        .collect(Collectors.toList());
        
    }

    public static void main(String[] args) {
        System.out.println(evaluateTax());
    }
   
    
}
