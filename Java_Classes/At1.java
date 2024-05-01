package com.Java_Classes;
import java.util.Scanner;
public class At1{
    public static void main(String[] args) {
        /*
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String name=sc.nextLine();
        int i,n,r=0,j,consonant=0,vowels=0;
        n=name.length();
        for(i=0;i<n;i++)
        {
                if(name.charAt(i)>=65 && name.charAt(i)<=90 || name.charAt(i)>=97 && name.charAt(i)<=122){
                    if(name.charAt(i)=='a' || name.charAt(i)=='e' ||name.charAt(i)=='i' ||name.charAt(i)=='o'
                            ||name.charAt(i)=='u' ||name.charAt(i)=='A' ||name.charAt(i)=='E'
                            ||name.charAt(i)=='I' ||name.charAt(i)=='O' ||name.charAt(i)=='U' ){
                        vowels++;
                    }else{
                        consonant++;
                    }
                }

        }
        System.out.println("The number of Consonant is "+consonant);
        System.out.println("The number of Vowels is "+vowels);
    }
}   */  /*  Scanner sc=new Scanner(System.in);
       int n,m,sum;
        System.out.println("Enter the number 1");
        n=sc.nextInt();
        System.out.println("Enter the number 2");
        m=sc.nextInt();
        sum=m+n;
        System.out.println("The sum of two number is "+ sum);
  */
        /*Question 3
        int n, i;
        System.out.println("Enter the Year to check it is leap year or not ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (n % 4 == 0 || n % 1000 == 0) {
            System.out.println("It is a leap Year");
        } else {
            System.out.println("It is not an leap Year");
        }
    }
}  */
        //Question 4
        int n, i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers ");
        n = sc.nextInt();
        i = sc.nextInt();
        j = sc.nextInt();
        if (i >= j && i >= n) {
            System.out.println(i + " is the largest number");
        } else {
            if (j > n && j > i) {
                System.out.println(j + " is the largest number ");
            } else {
                System.out.println(n + " is the largest number");
            }
        }
    }
}
//        //Question 5
//        Scanner sc=new Scanner(System.in);
//        String name="Java Programming";
//        int i,n,r=0,j;
//        n=name.length();
//        for(i=0;i<n;i++)
//        {
//            r=0;
//        for(j=0;j<n;j++){
//            if(name.charAt(i)==name.charAt(j)){
//                r++;
//            }
//        }
//            System.out.println(name.charAt(i)+" is repeated "+r + " Times");
//        }
//        //question 8
//        Scanner sc=new Scanner(System.in);
//        int a[],n,c;
//        boolean flag=false;
//        System.out.println("Enter the no. of Element required for array ");
//        n=sc.nextInt();
//        a=new int[n];
//        System.out.println("Enter the elements");
//        for(int i=0;i<n;i++)
//        {
//            a[i]=sc.nextInt();
//        }
//        for(int i=0;i<n;i++)
//        {
//        for(int j=0;j<n;j++)
//        {
//            if(a[i]==a[j] && j!=i)
//            {
//               flag=true;
//                System.out.println("True");
//                break;
//            }
//        }
//        }
//        if(flag!= true)
//        {
//            System.out.println("False");
//        }


