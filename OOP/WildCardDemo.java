package com.OOP;

import java.util.*;
//WildCards Are used to specify the type of Generic required for Object
public class WildCardDemo <T extends Number>{
    //for ArrayList
    private Object data[];
        private static int DEFAULT_SIZE =10;
        private int size = 0;
        public void getList(List <? extends Number> list){
            //this is wildCards for strict type checking of only Numbers
        }
        public WildCardDemo() {
            this.data = new Object[DEFAULT_SIZE];
        }
        public void add(int num){
            if (isFull()){
                resize();
            }
            data[size++] = num;
        }
        private void resize(){
            Object [] temp = new Object[data.length *2];
            //copy the current items in the new array
            for (int i = 0; i < data.length; i++) {
                temp[i]=data[i];
            }
            data = temp;
        }

        @Override
        public String toString() {
            return "CustomArrayList{" +
                    "data=" + Arrays.toString(data) +
                    ", size=" + size +
                    '}';
        }

        private boolean isFull() {
            return size == data.length;
        }
        public T remove(){
            T removed = (T)data[--size];
            return removed;
        }
        public T get(int index){
            return (T)data[index];

        }
        public int size(){
            return  size;
        }

        public void set(int index,T value){
            data[index] = value;
        }
        public static void main(String[] args) {
            com.OOP.CustomGeneric<Integer> list = new com.OOP.CustomGeneric<>();
            list.add(78);
            list.add(5);
            list.add(9);
            System.out.println(list);
        }
    }


