public class DataInherit 
{
    public static void main (String[] args)
    {
        ScientificCalc obj = new ScientificCalc();
        int result = obj.add(10,30);
        int result1 =obj.sub(3, 2);
        int result2 =obj.multi(3, 2);
        int result3 =obj.div(3, 2);
        int result4 = obj.power(2,3);
        System.out.println("Add" + ":" + result + "\n" + "Sub" + ":" + result1 + "\n" + "Multi" + ":" + result2 + "\n" + "Div" + ":" + result3 +"\n" + "Power" + ":" + result4);
    }
}
