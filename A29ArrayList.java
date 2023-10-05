/*
! ArrayList -> used as array with data types.
! collection don't support indexing while List support.
! Set will not give value in sorted order.
! TreeSet used to get sorted value.
*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import java.util.Iterator; // Import java.util.Iterator

public class A29ArrayList {
    public static void main(String args[]) {
        // Collection <Integer> num = new ArrayList<Integer>(); // or
        // List <Integer> num = new ArrayList<Integer>();
        // Set <Integer> num = new HashSet<Integer>();
        // Set <Integer> num = new TreeSet<Integer>();

        // for(int x:num){
        // System.out.println(x);
        // }

        // ! print using iterator
        Collection<Integer> num = new TreeSet<Integer>();
        for (int i = 1; i <= 5; i++) {
            num.add(i);
        }
        Iterator<Integer> values = num.iterator();
        while (values.hasNext()) {
            System.out.println(values.next());
        }
    }
}
