package Java_Classes;

import java.util.Scanner;

class Co_relation {
    float a[][];
    float n, sumOfX, sumOfY, xy = 0, sumOfX2, sumOfY2;
    float r, numerator, denominator, avgX, avgY;
    void input(int n) {
        try {
            this.n = n;
            a = new float[n][2];
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter value of x and y respectively");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 2; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < n; i++) {
                sumOfX += a[i][0];
                sumOfY += a[i][1];
                sumOfX2 += a[i][0] * a[i][0];
                sumOfY2 += a[i][1] * a[i][1];
            }
            avgX = sumOfX / n;
            avgY = sumOfY / n;
            getTable();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    void getTable()
    {
        try
        {
            System.out.println("The entered value is : \nx\ty\txy\tx2\ty2");
            for (int i = 0; i < n; i++) {

                    System.out.print(a[i][0] + "\t"+a[i][1]+"\t"+a[i][0]*a[i][1]+"\t"+a[i][0]*a[i][0]+"\t"+a[i][1]*a[i][1]);

                System.out.println();
            }
            result();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    float getNumerator()
    {
        try {
            for (int i = 0; i < n; i++) {
                xy = xy + a[i][0] * a[i][1];
            }
            numerator = xy - (n * avgX * avgY);
            System.out.println(numerator);

        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return numerator;
    }
    float getDenominator()
    {
        float temp1= (float) Math.sqrt(sumOfX2-(n*avgX*avgX));
        float temp2= (float) Math.sqrt(sumOfY2-(n*avgY*avgY));
        denominator=(temp1)*(temp2);
        System.out.println(denominator);
        return denominator;
    }
    void result()
    {
        System.out.println("Sum of X "+sumOfX);
        System.out.println("Sum of X2 "+sumOfX2);
        System.out.println("Sum of Y "+sumOfY);
        System.out.println("Sum of Y2 "+sumOfY2);
        System.out.println("Avg of X "+avgX);
        System.out.println("avg of Y "+avgY);
        r=getNumerator()/getDenominator();
        System.out.println("Co-efficient of relation of the entered value is : "+ r);
    }
}
public class COC_Maths {
    public static void main(String[] args) {
        Co_relation c1=new Co_relation();
        System.out.println("Enter the no. of Values ");
        Scanner sc =new Scanner (System.in);
        int n=sc.nextInt();
        c1.input(n);
    }
}
