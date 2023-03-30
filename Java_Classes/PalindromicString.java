package Java_Classes;
import java.util.Arrays;
import java.util.Scanner;

public class PalindromicString {
public static void main(String[] args){
    int i,j,l;
    String s1;
    boolean flag;
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the String ");
    s1=scan.next();
    l=s1.length();
    char org[] ,rev[];
    org=new char[l];
    rev=new char[l];
    for(i=0;i<l;i++){
        org [i]=s1.charAt(i);
    }
   i=i-1;
    j=0;
    while(i>=0){
        rev[i]=org[j];
        i--;
        j++;
    }
    flag = Arrays.equals(org,rev);
    if(flag){
        System.out.println("It is an Palindromic String");
    }else{
        System.out.println("It is not a palindromic String ");
    }
    }
}
