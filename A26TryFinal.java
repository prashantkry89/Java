/*
!Try With Final
    try{
        when to try any code 
    }finally{
        it will execute sure 
    }
 */

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class A26TryFinal {
    public static void main(String args[]) throws IOException{
        try(BufferedReader bf=new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("In try block");
        }
        // finally{
        //     System.out.println("Finally Executed");
        // }
    }
}