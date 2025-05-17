public class Duplicateelementsarray
{
    public static void main(String[] args) {

        String [] arr ={"java", "C", "C++", "java", "Python"};
        boolean flag = false;

        for (int i=0; i<arr.length;i++)
        {
            for (int j=i+1; j< arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println("Duplicate elements found:" +(arr[i]) );
                    flag=true;
                }

            }
        }

        if(flag==false)
        {
            System.out.println("There is no duplicate elements ");
        }

    }
}
