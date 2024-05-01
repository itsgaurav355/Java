package com.Java_Classes;


import java.util.Scanner;

public class HashingInJava {

    public static class Hashmap
    {
        static int arr[];
        void initi(int n)
        {
            arr =new int[n];
            int i;
            for(i=0;i<n;i++)
            {
                arr[i]=-1;
            }
            System.out.println("Table Initialised Successfully");
        }
        void insert(int n)
        {
            Scanner sc=new Scanner(System.in);
            int value;
            System.out.println("Enter the value ");
            value=sc.nextInt();
            int key=value%n;
            if(arr[key]==-1){
                arr[key] =value;
                System.out.println("The value is inserted in hash table at index " +key);
            }else{
                for(int i=0;i<n;i++)
                {
                    if(arr[i]==-1){
                        arr[i]=value;
                        System.out.println(value + " is inserted at index "+ i);
                        break;
                    }else
                    {
                        System.out.println("The index "+i+" is occupied Already");
                    }
                }
            }
        }
        void print(int n)
        {
            int i;
            for(i=0;i<n;i++)
            {
                System.out.print(arr[i]+ "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, c;
        boolean flag = true;
       Hashmap hashmap = new Hashmap();
        System.out.println("Enter the No of Element Required");
        n = sc.nextInt();
        while (flag) {
            System.out.println("1 For initialise The table\n2 for inserting the element\n3 for Printing the element\n4 for Quit");
            c = sc.nextInt();
            switch (c) {
                case 1:
                    hashmap.initi(n);
                    break;
                case 2:
                    hashmap.insert(n);
                    break;
                case 3:
                    hashmap.print(n);
                    break;
                case 4:
                    flag=false;
                default:
                    System.out.println("invalid Input");
            }

        }

    }
}
