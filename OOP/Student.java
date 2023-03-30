package com.OOP;

import com.gaurav.Arrays;

public  class Student implements Comparable<Student>{
    int rollno;
    float marks;

    public Student(int rollno, float marks){
        this.rollno=rollno;
        this.marks=marks;

    }
     @Override
     public int compareTo(Student o) {
         int diff= (int)(this.marks - o.marks);
         if(diff>0){
             System.out.println("Jay has more marks");
             return 1;
         }else if(diff<0){
             System.out.println("Jas has less Marks");
             return -1;
         }else{
             System.out.println("Both got same marks");
             return 0;
         }
     }
     public static void main(String[] args) {
        Student gaurav =new Student(12,87.98f);
        Student jay = new Student(55,90.5f);
         System.out.println(jay.compareTo(gaurav));

    }


}
