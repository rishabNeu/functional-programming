package ParallelStream;

import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamDemo{
    public static void main(String[] args) {
        
        long start = 0;
        long end = 0;

        start=System.currentTimeMillis();
        IntStream.range(1, 100).forEach(a -> System.out.println(a));
        end = System.currentTimeMillis();
        long ans = end - start;
        System.out.println("Normal stream took time : " + ans);

        System.out.println("------------------------------------------------------------------------------------------------------------------");
        start = System.currentTimeMillis();
        IntStream.range(1, 100).parallel().forEach(a -> System.out.println(a));
        end = System.currentTimeMillis();
        ans = end - start;
        System.out.println("Parallel stream took time : " + ans);

        System.out.println("------------------------------------------------------------------------------------------------------------------");
        
            
         IntStream.range(1, 10).forEach( a -> System.out.println("The thread is : " + Thread.currentThread().getName() + " : " + a ));
        
             IntStream.range(1, 10)
            .parallel()
            .forEach( a -> System.out.println("The thread is : " + Thread.currentThread().getName() + " : " + a ));
        
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        ParallelDatabase p = new ParallelDatabase();
        List<Teacher> teachers = p.getStudentList();
        start = System.currentTimeMillis();
        Double averageStreamSalary=  teachers.stream()
                        .map( (t) -> t.getSalary())
                        .mapToDouble(i->i)
                        .average().getAsDouble();
        end = System.currentTimeMillis();
        long a = end - start;
        System.out.println("Normal Steam time : " + a );
        
        System.out.println("------------------------------------------------------------------------------------------------------------------");


                start = System.currentTimeMillis();
         Double averageParallelStreamSalary=  teachers.parallelStream()
                        .map( (t) -> t.getSalary())
                        .mapToDouble(i->i)
                        .average().getAsDouble();

                end = System.currentTimeMillis();
                a = end - start;
                     System.out.println("Parallel Steam time : " + a );





    }   
}