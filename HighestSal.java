import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class HighestSal
{
    public static void main(String[] args) {
        List<Integer> hnums = Arrays.asList(1,22,5,7,99);

        Optional<Integer> snums = hnums.stream()
                .distinct() // remove duplicate
                .sorted(Comparator.reverseOrder())// print desce
                .skip(1).findFirst();

        if(snums.isPresent())
        {
            System.out.println("Elemenmts found" + snums.get());
        }
        else {
            System.out.println("not found");
        }
    }

}
