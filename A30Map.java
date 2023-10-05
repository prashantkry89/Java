
/*
! Map
    It's an interface 
    ! hashtable -> use synchronized version 
    ! hashtable -> work with multiple thread  
*/

import java.util.*;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class A30Map {
    public static void main(String args[]){
        Map <String,Integer> students = new HashMap<>(); // creating map
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){  
            System.out.println("Enter Key " + i + ": ");
            String key = sc.nextLine();

            System.out.println("Enter Value " + i + ": ");
            int value = Integer.parseInt(sc.nextLine());

            students.put(key, value);   // Inserting data in map
        }

        // printing data of map
        System.out.println("Printing data of map");
        for(Entry<String, Integer> entry : students.entrySet()){
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
