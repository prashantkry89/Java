import java.util.Scanner;
public class A7Functionmethod {
    public static void printJava(){
        System.out.println("Hello Java");
    }
    public static int sum(int x,int y){
        return x+y;
    }
    public static double reminder(float a ,float b){
        return a%b;
    }
    public static void main(String []args){
        printJava();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x and y ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("Sum is "+sum(x,y));
        System.out.println("Enter a and b ");
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        System.out.println("Reminder is "+reminder(a,b));
    }
}