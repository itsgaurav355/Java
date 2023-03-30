package com.gaurav;
/*import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class test {
    public static void main(String args[]){
        try {
            FileOutputStream fout = new FileOutputStream("C://Coding//c language");
            fout.write(65);
            fout.close();
            System.out.println("success...");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

     }
     */
import java.io.*;
import java.io.IOException;
import java.io.PrintWriter;
//import java.io.FileOutputStream;

        public class test {

            public static void main(String args[]){

                try{
                            FileInputStream fin=new FileInputStream("/C://Coding//JAVA File//company//Gaurav.txt/");
                            int i=0;
                            while((i=fin.read())!=-1)
                            {
                                System.out.print((char)i);
                            }
                            fin.close();
                        }catch(Exception e){
                            System.out.println(e);
                        }


                try{

                    FileOutputStream fout=new FileOutputStream("/C://Coding//JAVA File//company//Gaurav.txt/");

                    fout.write('G');
                    fout.write('A');
                    fout.write('U');
                    fout.write('R');
                    fout.write('A');
                    fout.write('V');


                    //String s="Welcome to javaTpoint.";

                    //byte b[]=s.getBytes();//converting string into byte array

                    //fout.write(b);

                    fout.close();

                    System.out.println("success...");

                }catch (Exception e){
                    System.out.println(e);
                }
            }
        }

