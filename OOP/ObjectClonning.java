package com.OOP;

import java.util.Arrays;

class Human implements Cloneable{
    int age;
    String name;
    int arr[] = {1,2,3,4,54};

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        //direct it will do shallow copy
          Human twin = (Human)super.clone();
        //for deep copy
        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }
}
public class ObjectClonning {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human gaurav = new Human(19,"Gaurav");
//        Human twin =gaurav;
        //Clonning decreases compiler overhead instead of creating new object using new keyword. it is doing shallow copy
        //Shallow refers to the same object non-permitive data type like arr  if changes made in one object will affect other copy too not to primitive dt
        Human twin = (Human) gaurav.clone();
        System.out.println(twin.age + " "+ twin.name);
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0]= 87;
        //In deep copy both are different not related to each other
        System.out.println(Arrays.toString(gaurav.arr));
        System.out.println(Arrays.toString(twin.arr));


    }
}
