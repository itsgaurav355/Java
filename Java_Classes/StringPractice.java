package Java_Classes;

import java.util.Locale;

public class StringPractice {
    public static void main(String[] args){
        int i;
        String a="hello";
        String b="world";
        char temp;
        int length=a.length()+b.length();
        System.out.println("The length addition of both String is : "+length);
        if(a.compareTo(b)==0)
        {
            System.out.println("Both Are Equal");
        }
        else if(a.compareTo(b)>0)
        {
            System.out.println("String a is Greater than b");
        }
        else
        {
            System.out.println("String b is Greater than a");
        }/*
        for(i=0;i<1;i++) {
            if (a.charAt(0) == 'h') {

                System.out.print(a.replace('h', 'H'));
            }
        }
        for(i=0;i<1;i++)
        {
            if(b.charAt(0)=='w')
            {
                System.out.print(b.replace('w','W'));
            }
        }
        */
        //Also can do using String Concatination
        System.out.println(a.substring(0,1).toUpperCase()+a.substring(1)+" "+b.substring(0,1).toUpperCase()+b.substring(1));
    }
}
