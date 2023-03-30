package Java_Classes;
import java.util.Scanner;
//Lec 37
public class DuckNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("Enter a Number to check Whether it is ducking no. or not");
        str= sc.nextLine();
        if(str.charAt(0)=='0')
        {
            System.out.println("The number is not a Ducking Number");
        }
        else
        {
            if(str.contains("0"))
            {
                System.out.println("It is a Ducking number");
            }
            else
            {
                System.out.println("It is not a Ducking number");
            }
        }
    }
}
