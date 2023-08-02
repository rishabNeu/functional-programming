package ParallelStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelDatabase {

    List<Teacher> list = new ArrayList<>();

    public List<Teacher> getStudentList(){
        for(int i = 1; i < 100; i++){
            Teacher s = new Teacher("name" + i,i, Double.valueOf(new Random().nextInt(1000*100)) );
            list.add(s);
         }
        return list;
    }
    
}
