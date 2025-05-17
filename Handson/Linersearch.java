public class Linersearch
{
    public static void main(String[] args)
    {
        int a[] = {10,29,51,39,50};
        int sele =97;
        boolean flag =false;
        for (int i=0; i<a.length;i++)
        {
            if(sele==a[i])
            {
                System.out.println("Element found" + " "+  i);
                flag=true;
                break;
            }
        }
        if(flag==false)
        {
            System.out.println("element not found");
        }


    }
}
