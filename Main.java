import java.util.function.Consumer;

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

    }

    


}