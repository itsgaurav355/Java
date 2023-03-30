package Java_Classes;
import java.util.Scanner;
public class Exception_Handling {
    public static void main(String[] args) {
        int a[]=new int [5];
       int i;
       Scanner sc=new Scanner(System.in);
       for(i=0;i<a.length;i++)
       {
           System.out.println("Enter an Element ");
           a[i]=sc.nextInt();
       }
        System.out.println("The elements are: ");
       try{
           for(i=0;i<10;i++)
           {
               System.out.println(a[i]);
           }
       }catch(Exception e)
       {
           System.out.println("Error is Here: "+ e);
       }
    }
}
