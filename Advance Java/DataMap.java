import java.util.HashMap;
import java.util.Map;

public class DataMap
{
    public static void main(String[] args) {
        Map<Integer , String> student = new HashMap<>();
        student.put(22 , "Kirran");
        student.put(23 , "Kim");
        student.put(28 , "Jim");
        student.put(29 , "Harsh");
        student.put(92 , "Alex");

        System.out.println(student.keySet());
        for (Integer rollNo : student.keySet() )
        {
            System.out.println( rollNo + ":" + student.get(rollNo));
        }



    }
}
