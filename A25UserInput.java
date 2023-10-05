/*
!User Input 
    Taking input from user 
    Library to be imported on series
        IOException -> when input to be taken in ASCII format 
        BufferedReader extends InputStreamReader 
*/


import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
public class A25UserInput {
    public static void main(String args[]) throws IOException{
        System.out.println("Enter value...");

        // ! way 1
        // int x = System.in.read();   // ! value in X will in ASCII form of user input

        // ! way 2
        // InputStreamReader in =new InputStreamReader(System.in); // step 2
        // BufferedReader bf = new BufferedReader(in); // step 1
        // int x = Integer.parseInt(bf.readLine());
        // System.out.println("Value is " + x);
        // bf.close();


        // ! way 3
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        System.out.println("Y: " + y);
    }
}
