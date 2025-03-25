import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class DataSet
{

    public static void main(String[] args) {


        //       // Set<Integer> nums = new HashSet<Integer>();
//
//        Set<Integer> nums= new TreeSet<>(); // if  u want sorted elementss we can use treeset
//
//
//        nums.add(23);
//        nums.add(25);
//        nums.add(3);
//        nums.add(88);
//        // for iterating we can use iterator
//
//        Iterator <Integer> numvalues=nums.iterator();
//        while (numvalues.hasNext())
//        {
//           int r= numvalues.next();
//            System.out.println(r);
//        }
//
//        for(int n : nums)
//        {
//            System.out.println(n);
//        }


        Set <Integer> nums =  new TreeSet<>();
        nums.add(7);
        nums.add(9);
        nums.add(8);
        nums.add(0);

        Iterator <Integer> numvalues= nums.iterator();
        while (numvalues.hasNext())
        {
            int a= numvalues.next();
            System.out.println(a);
        }



    }
}
