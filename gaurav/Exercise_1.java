package com.gaurav;
import java.util.Scanner;
public class Exercise_1 {
   /*Question 1
    public static void Average(){
      Scanner sc= new Scanner(System.in);
      double a=sc.nextDouble();
      double b=sc.nextDouble();
       double c=sc.nextDouble();

        double avg= (a+b+c)/3;
        System.out.println(avg);
    }

    */
    /*Question 2
    public static int Sum(int a){

        int sum=0;
        for(int i=1;i<=a;i++){
            if(i%2==1){
                sum =sum +i;
            }
        }
        System.out.println(sum);
        return sum;
    }

     */
 /*  Question 3
  public static void Greaterno(int a,int b){
        if(a>b){
            System.out.println(a +" is grater than "+b);
        }else if(b>a){
            System.out.println(b+" is Greater than "+a);
        }
    }

  */
    /*Question 4
    public static void Circumference(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of Radius");
        int radius =sc.nextInt();
        System.out.println(2* Math.PI*radius);
    }

     */
    //Question 10
    public static int FSeries(int n){
        int sum=0;
        sum= n+(n-1);
        System.out.println(sum);
        return sum;
    }
    public static void main(String[] args) {
      //  Average();
       // Sum(7)
        // Greaterno(8,10);
        // Circumference();
        FSeries(8);
    }
}
