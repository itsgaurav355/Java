package Java_Classes;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SplitStringIntoTokens {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s1;
        System.out.println("Enter a String : ");
        s1=scan.next();
        StringTokenizer stk=new StringTokenizer(s1,",");
        while(stk.hasMoreTokens()){//check there is token present or not return boolean
            String token =stk.nextToken();// nexttokens==> returns the token from the string
            System.out.println(token);

        }
    }
}
