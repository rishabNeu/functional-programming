package Map_FlatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomerDatabase {
    

    public static List<Customer> getCustomers(){
       
        List<Customer> list = new ArrayList<>();

        list.add( new Customer(1, "Rishab", "rishab@gmail.com", Arrays.asList("1234567890" , "8575402308")));
        list.add( new Customer(2, "Vivek", "vivek@gmail.com", Arrays.asList("857656565" , "8571111111")));
        list.add( new Customer(3, "Talele", "talele@gmail.com", Arrays.asList("1234117890" , "8575112308")));
        list.add( new Customer(4, "Wali", "wali@gmail.com", Arrays.asList("12343337890" , "8575402399")));

        return list;
    }
}
