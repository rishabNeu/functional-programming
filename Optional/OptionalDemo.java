package Optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import Map_FlatMap.Customer;
import Map_FlatMap.CustomerDatabase;

public class OptionalDemo {
        
        //Here we will use Streams with Optional class
        public Customer getCustomer(String email){
            CustomerDatabase cDb = new CustomerDatabase();
            List<Customer>  list = cDb.getCustomers();
            
            return list.stream().filter(cust -> cust.getEmail().equals(email))
            .findAny().orElse(new Customer(8,"Dummy", "dumy@gmail.com" , Arrays.asList("6666666666"))); 
            
        }


        public static void main(String[] args) {
            
            Customer cust = new Customer(6, "Shreya", null,Arrays.asList( "8675412346"));
           //System.out.println(c.getEmail());
           
           // this will throw an exception.
        //    Optional<String> emailOptional = Optional.of(cust.getEmail());
        //    System.out.println(emailOptional);
        
           // one way to handle null value it will return empty
           Optional<String> emailOptional = Optional.ofNullable(cust.getEmail());
           System.out.println(emailOptional);

           //this get() is used to get the value of email directly but here it will
           //throw an error since email is null so we should apply a check then get() the value if there is something 
           //System.out.println(emailOptional.get());


           // here we apply the check & commenting the above portion
           if(emailOptional.isPresent()){
            System.out.println(emailOptional.get());
           }else{
            System.out.println("Pls provide some email value as it is null");
           }

           //Calling the stream function
           OptionalDemo op =  new OptionalDemo();
           // this will print the default value.
           System.out.println(op.getCustomer("pqr"));

           // this will return the matched value.
           System.out.println(op.getCustomer("rishab@gmail.com"));
        }
    
}
