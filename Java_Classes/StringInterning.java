package Java_Classes;
import java.util.Scanner;
//1.Interning--> The process of the copy the string from Non-constant string pool to Constant String pool is called Interning
public class StringInterning {
    public static void main(String[] args) {
        String s1=new String("rama");
        String s2;
        s2=s1.intern();//for 1.
        //for proof
        String s3="rama";
        if(s2==s3){
            System.out.println("Both are pointing to the same Object ");
        }else{
            System.out.println("Not pointing to the same Object");
        }

    }
}
