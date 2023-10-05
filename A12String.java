import java.util.*;
/* 
! String 
    must to use " " but in character use ' '
    every string created in java is constant 
        s1=Bittu
        s2=Bittu    
            here s1 and s2 are 2 reference & 1 obj (s1==s2) -> true 
    Mutable String -> can be changed 
    Immutable String -> can't be changed 
        work with StringBuffer -> can be modified any time 
            ! StringBuffer -> size is 16 & string can be deleted inserted modified
            ! StringBuilder-> create string at same address no need change reference    
                    every time for creating string 
 
    ! substring 
        substring(begging index , end index)
        if end not given it will consider it till last 

*/
public class A12String {
    public static void main(String args[]){
        String name=new String("Bittu");    // way to create string obj 
        System.out.println(name.charAt(1)); // get value at index 
        String fName=name + " Kr";
        System.out.println(fName);

        // ! Immutable String   -> StringBuffer
        StringBuffer sb = new StringBuffer("Ram");
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        // insert delete modify setLength stringBuffer
        sb.insert(1, " Yadav "); 
        System.out.println(sb);
        sb.deleteCharAt(2);
        System.out.println(sb);
        sb.append(" Kr");
        System.out.println(sb);
        sb.setLength(10);
        System.out.println(sb);

        // ! compareTo  here == will fail as of obj creation will be done by it 
        String s1="Sweety";
        String s2="Sweety";
        if(s1.compareTo(s2)==0) System.out.println("String equal");
        else System.out.println("String not equal");


        // ! substring alternative of slice 
        String sen="Hello Sweety How are you ";
        System.out.println(sen.substring(2, 10));


        // ! String builder
        // creating string Builder 
        StringBuilder stB = new StringBuilder("Tony");
        System.out.println(stB);
        // getting letter 
        System.out.println(stB.charAt(2));
        // changing value 
        stB.setCharAt(2, 'Y');
        System.out.println(stB);
        // insert text in string 
        stB.insert(0,'S');
        System.out.println(stB);
        // delete text in string 
        stB.delete(0,1);
        System.out.println(stB);
        // append character in string at last 
        stB.append('s');
        System.out.println(stB);
    }
}



