package Java_Classes;
import java.util.Scanner;


public class MutableStrings {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        StringBuilder s= new StringBuilder();
        System.out.println(s.capacity());//Intiate capacity ==>16
        System.out.println(s.length());//length ==>0

        s.append("Sachin ");
        System.out.println(s.capacity());
        System.out.println(s.length());

        s.append(" is a Great Batsman");
        System.out.println(s.capacity());
        System.out.println(s.length());

        s.append(" He is From India");
        System.out.println(s.capacity());
        System.out.println(s.length());
    }
}
