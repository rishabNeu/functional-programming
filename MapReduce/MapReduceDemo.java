package MapReduce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Map_FlatMap.Customer;

public class MapReduceDemo {
    

    public static void main(String[] args) {
        

        List<Customer> custList = new ArrayList<>();

        custList.add( new Customer(1, "Rishab", "rishab@gmail.com", Arrays.asList("1234567890" , "8575402308")));
        custList.add( new Customer(2, "Vivek", "vivek@gmail.com", Arrays.asList("857656565" , "8571111111")));
        custList.add( new Customer(3, "Talele", "talele@gmail.com", Arrays.asList("1234117890" , "8575112308")));
        custList.add( new Customer(4, "Wali", "wali@gmail.com", Arrays.asList("12343337890" , "8575402399")));

        List<Integer> list = Arrays.asList(3,6,2,5,7,10,9);
        List<String> words = Arrays.asList("corejava" , "spring" , "mvcddddddjhvie");
        //using reduce method
        int sum = list.stream()
        .reduce( 0 , (a,b) -> a+b );
        System.out.println(sum);

        // above example using multiplication
        int mul = list.stream()
        .reduce( 1 , (a,b) -> a*b );
        System.out.println(mul);

        // words to find longest string length
        int maxLen = words.stream()
            .map((word) -> word.length())
            .reduce( 0 , (a, b) -> a > b ? a : b );
        System.out.println(maxLen);

        // to get longest string 
        String maxWord = words.stream()
                            .reduce((w1,w2) -> w1.length() > w2.length() ? w1 : w2).get();
                            
        System.out.println(maxWord);

    }    
}

