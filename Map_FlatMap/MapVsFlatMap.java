package Map_FlatMap;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {
    public static void main(String[] args) {
        
        List<Customer> list = CustomerDatabase.getCustomers();
        System.out.println("**************************************");
        
        //map()
        List<String> names = list.stream().map(emp -> emp.getName())
        .collect(Collectors.toList());
        System.out.println("List just transformed :" );

        names.stream().forEach(name -> System.out.println(name));

        System.out.println("**************************************");
        //flatMap()
        List<String> nos = list.stream().flatMap(emp -> emp.getPhone().stream())
        .collect(Collectors.toList());
        System.out.println("List transformed and Flattened :" );
        nos.stream().forEach(no -> System.out.println(no));

    }
}
