import java.util.*;
import java.math.*;
public class Calculator {
    static void sum(){
        Scanner sc = new Scanner(System.in);
        double x,y;
        System.out.println("Enter two numbers for addition: ");
        x=sc.nextDouble();
        y=sc.nextDouble();
        System.out.println("The sum of the above two numbers is "+(x+y));
    }
    static void sub(){
        Scanner sc = new Scanner(System.in);
        double x,y;
        System.out.println("Enter two numbers for subtraction: ");
        x=sc.nextDouble();
        y=sc.nextDouble();
        System.out.println("The subtraction of two numbers: "+ (x-y));
    }
    static void product(){
        Scanner sc = new Scanner(System.in);
        double x,y;
        System.out.println("Enter two numbers for product: ");
        x=sc.nextDouble();
        y=sc.nextDouble();
        System.out.println("The Product of two numbers: "+(x*y));
    }
    static void division(){
        Scanner sc = new Scanner(System.in);
        double x,y;
        System.out.println("Enter two numbers for division: ");
        x=sc.nextDouble();
        y=sc.nextDouble();
        System.out.println("The division of two numbers: "+(x/y));
    }
    static void sqrt(){
        Scanner sc = new Scanner(System.in);
        double x;
        System.out.println("Enter the number for square root: ");
        x=sc.nextDouble();
        System.out.println("The square root of the number is: "+Math.sqrt(x));
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i=1;
        System.out.println("This is a Basic Calculator!");
        while(i!=0){
            System.out.println("Enter \n1. Addition \n2. Substraction \n3. Multiplication \n4. Division \n5. Square root");
            int ch=sc.nextInt();
            switch(ch){
                case 1:
                sum();
                break;
                case 2:
                sub();
                break;
                case 3:
                product();
                break;
                case 4:
                division();
                break;
                case 5:
                sqrt();
                break;
                default:
                System.out.println("Invalid input!!");
            }
            System.out.println("If you want to use the calculator again press 1 otherwise 0");
            int i1=sc.nextInt();
            if(i1==1)
            i=1;
            else
            i=0;
        }
    }
    
}
