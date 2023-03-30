package Java_Classes;
import java.util.Scanner;
/*Throwing Exception Manually
public class ThrowDemo2 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scan =new Scanner(System.in);
       try{
           System.out.println("Enter a value ");
           a=scan.nextInt();
           System.out.println("Enter b value");
           b=scan.nextInt();
           if(a>b)
           {
               c=a-b;
               System.out.println("c Value is : "+c);
           }else
           {
//               Exception e=new Exception();
//               throw e;
               //OR
               throw new Exception();
           }
       }
       catch(Exception e)
        {
            System.out.println("Error caught in main because a>b and "+e);
        }

    }
}
*/
//Building Custom Exceptions
class ALessThanBException extends Exception{
//    ALessThanBException()
//    {
       // System.out.println("a is less than b");
  //  }
    //custom exception creation
    public String getMessage()
    {
        return "a is less than b";
    }
}
public class ThrowDemo2 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scan =new Scanner(System.in);
        try{
            System.out.println("Enter a value ");
            a=scan.nextInt();
            System.out.println("Enter b value");
            b=scan.nextInt();
            if(a>b)
            {
                c=a-b;
                System.out.println("c Value is : "+c);
            }else
            {
                throw new ALessThanBException();
            }
        }
        catch(Exception e)
        {
            System.out.println( e.getMessage());
        }
        System.out.println("Exiting main Normally");

    }
}
