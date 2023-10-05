// ! Stream API 

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class A32StreamAPI {
    public static void main(String[] args) {
        List <Integer> arr = Arrays.asList(20,15,40,3,30,5);

        // ! forEach() 
        // arr.forEach(x->System.out.print(x));

        // ! stream
        // Stream<Integer> s1= arr.stream(); // keep reference of all element 
        // Stream<Integer> s2 = s1.filter(y -> y%2 == 0);
        // Stream<Integer> s3 = s2.map(y -> y*2);
        // int res=  s3.reduce(0,(c,e)->c+e);
        // // s3.forEach(x->System.out.print(x + " "));

        // or
        int res = arr.stream()
                     .filter(x->x%2==0)
                     .map(x->x*2)
                     .reduce(0,(c,e)->c+e);
        
        System.out.println("Sum is " + res);
    }
}


/*
Filter -> work on predicate which return true or false.
Map -> work on functional interface & method called apply 
ParallelStream work on multiple thread
*/