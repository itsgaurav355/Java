package Java_Classes;
import java.util.Scanner;
class UnderAge extends Exception
{
    public String getMessage()
    {
        return "UnderAge DL cant given";
    }
}
class OverAge extends Exception
{
    public String getMessage()
    {
        return "OverAge DL cant Given";
    }
}
class Dl
{
    int age;
    Scanner sc=new Scanner(System.in);
    void input()
    {
        System.out.println("Enter the Age");
        age=sc.nextInt();
    }
    void dispatchDl()
    {
        try
        {
            if(age<18)
            {
                throw new UnderAge();
            }
            else if(age>60)
            {
                throw new OverAge();
            }
            else
            {
                System.out.println("Dl is dispatched Successfully");
            }
        }catch(UnderAge e)
        {
            System.out.println(e.getMessage());
        }
        catch(OverAge e)
        {
            System.out.println(e.getMessage());
        }
    }
}
public class CustomException {
public static void main(String[] args){
    Dl d1=new Dl();
    d1.input();
    d1.dispatchDl();
}
}
