import java.util.function.Consumer;
import java.util.function.Predicate;

import Calculator.Calculator;

class Main{
    public static void main(String[] args) {

        Calculator calc = () -> {
            System.out.println("Hello from calc");
        };
    calc.switchOn();

        //Implementing Consumer Interface method 
        // lambda Expression
        Consumer<Integer> consumer = (t) -> {
            System.out.println("hello from accept consumer : "+ t);
        };

        consumer.accept(10);


         //Implementing Predicate Interface method 
        // lambda Expression
        Predicate<Integer> predicate = (t) -> {
            if(t%2==0){
                return true;
            }else{
                return false;
            }
        };

        System.out.println(predicate.test(5));
         
        
    }

    


}