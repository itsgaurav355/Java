package Java_Classes;
import java.util.Scanner;
        class Employee1{
            double da,bs,hra,cca=240.0,pf,pt=100.0;
            double gs,ns;
            Employee1(int n,String name,int b){
                System.out.println(n+"\t"+name + " Details are : ");
                calSalary(b);
            }
            double calDa(int b){
                this.da=0.7*b;
                return da;
            }

            double calHra(int b){
                hra=0.3*b;
                return hra;
            }
            double calPf(int b){
                pf =0.1*b;
                return pf;
            }
            void calSalary(int b){
                gs=b+calDa(b)+calHra(b)+cca;
                System.out.println("Your Gross Salary is : " + gs);
                ns=gs-calPf(b)-pt;
                System.out.println("Your Net Salary is : " + ns);
            }
        }
        class Experiment1a{
            public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
                String name ;
                int salary,no;
                System.out.println("Enter Your Emp No");
                no=sc.nextInt();
                System.out.println("Enter Your Name ");
                name=sc.next();
                System.out.println("Enter Your Basic salary ");
                salary =sc.nextInt();
                Employee1 e1=new Employee1(no,name,salary);
            }
        }

       /* int choice;
        String name ;
        char [] check;
        int i,r,j,temp,l;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Factorial\n2 For Reversing a No.\n3 for Test Armstrong\n4 for Test Palindrome()\n5 for Test Prime()\n6 for Fibonacci Series()");
        choice = sc.nextInt();
        switch(choice){
            case 1:
                r=1;
                System.out.println("Enter No for Factorial :");
                j=sc.nextInt();
                for(i=j;i>0;i--){
                    r=r*i;
                }
                System.out.println("The Factorial "+j+" Value is :"+r);
                break;
            case 2:
                System.out.println("Enter the No.");
                r=0;
                j=sc.nextInt();
              for(i=1;j>0;i++){
                  temp=j%10;
                  r=r*10+temp;
                  j=j/10;
              }
                System.out.println("The Reverse No. is "+ r);
                break;
            case 3:
                int s;
                System.out.println("Enter the No.To check Armstrong");
                j=sc.nextInt();
                temp=j;
                r=0;
                for(i=0;temp>0;i++){
                    s=temp%10;
                    r=r+s*s*s;
                    temp=temp/10;
                }
                if(r==j){
                    System.out.println("It is an Armstrong No. ");
                }else{
                    System.out.println("It is not an Armstrong No.");
                }
                break;
            case 4:
                String s1;
                boolean flag;
                Scanner scan=new Scanner(System.in);
                System.out.println("Enter the String ");
                s1=scan.next();
                l=s1.length();
                char org[] ,rev[];
                org=new char[l];
                rev=new char[l];
                for(i=0;i<l;i++){
                    org [i]=s1.charAt(i);
                }
                i=i-1;
                j=0;
                while(i>=0){
                    rev[i]=org[j];
                    i--;
                    j++;
                }
                flag = Arrays.equals(org,rev);
                if(flag){
                    System.out.println("It is an Palindromic String");
                }else{
                    System.out.println("It is not a palindromic String ");
                }
                break;
            case 5:
                 flag=true;
                System.out.println("Enter the No. to chcek its prime or not ");
                j=sc.nextInt();
                for(i=1;i<j;i++){
                    if(j%i==0 && i==1){
                        flag =true;
                    }else if(j%i==0){
                       // System.out.println("It is not a prime no. ");
                        flag=false;
                        break;
                    }else{
                        flag=true;

                }

                }
                if(flag){
                    System.out.println("It is an prime No");
                }else{
                    System.out.println("it is an not Prime No.");
                }
                break;
            case 6:
                int a=0,b=1,n,sum=a+b;
                System.out.println("Enter the no. till which fibonacci series Required");
                n=sc.nextInt();
                for(i=0;i<n;i++){
                    if(i==0){
                                System.out.print(a+"  ");
                            }
                    else if (i==1)
                    {
                                System.out.print(b+"  ");
                            }
                    else
                            {
                                temp=b;
                                b=sum;
                                a=temp;
                                sum=a+b;
                                System.out.print(sum+"  ");
                            }
                                }
                break;
            default :
                System.out.println("Invalid Choice");
        }

        */





