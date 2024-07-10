// public class Demo {
//     public static void main(String[] args) 
//     {
//         int n=4;
//         int n1=4;
//         int result = n+n1;
//         System.out.println(result);
//     }
// }

//byte to int - casting
// public class Demo
// {
//     public static void main(String[]args)
//     {
//        // byte b = 120;
//         int n=12;
//         byte b=(byte)n;
//         System.out.println(n);  
//    }
// }

// byte-byte

// public class Demo
// {
//     public static void main(String[]args)
//     {
//       byte b1=5,b2=6;

//       byte b3=(byte)(b1+b2);

//       System.out.println(b3);
//     }


// }



// public class Demo
// {
//     public static void main (String [] args)
//     {
//         int num = 7;
//        // num = num + 2; //increnment ny 2
//       // num += 2; // perform any operation 
//        //int result = num++; // in this case it first fetch the value and then increment 
//        int result = ++num;
//         System.out.println(result);
//     }

// }


//Logical operators


// public class Demo
// {
//     public static void main (String [] args)
//     {
//         int x = 5;
//         int y = 6;

//         int a = 8;
//         int b = 4;

//         boolean result = x<y || a<b;
//         System.out.println (result);
//     }
// }


//Conditional operator if-else
// public class Demo
// {
//     public static void main (String [] args)
//     {
//         int x = 2;

//         if (x>10 || x<=20)
//         {
//             System.out.println("hello");
//         }
//         else
//         {
//              System.out.println("Bye");
//         }
//     }
// }



//If else if


// public class Demo
// {
//     public static void main (String[] args)
//     {
//         int x = 8;
//         int y = 9;
//         int z = 11;

//         if (x>y && x>z)
//         {
//             System.out.println("true");
//         }
//         else if (y>x && y>z)
//         {
//             System.out.println(z);
//         }
//         else
//         {
//           System.out.println("false");
//         }
//     }
// }




//ternary operator:

// public class Demo
// {
//     public static void main (String[] args)
//     {
//         int n=12;
//         int result;
//         result = n %2==0 ? 10: 15 ;
//         if (result ==10)
//         {
//            System.out.println("Even Number");
//         }
//         else
//         {
//           System.out.println("Odd Number");
//         }
        
//     }
// }

//switch statement

public class Demo
{
   public static void main (String[] args)
   {
     int n = 9;
     switch(n)
     {
        case 1 :
            System.out.println("Jan");
            break;

         case 2 :
            System.out.println("Feb");
            break;

         case 3:
            System.out.println("Jan");
            break; 

         default :
         System.out.println("Eneter v valid number");


     }
   } 
}