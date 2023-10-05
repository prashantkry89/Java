/*
! Final 
    can be used with variable, method,class
    if put final in back of a variable it can't be changed as it got fixed 
    if put final in back of a class it can't be inherited or derived 
    if put final in back of a method it can't be overridden  
*/

final class Parents { // can't be inherited or derived 
    public void show() {
        System.out.println("Show");
    }
}

class Child1{
    final public void show() {  // can't be overridden 
        System.out.println("Show in child 1 class");
    }
}

class Child2 extends Child1{
    public void display() {
        System.out.println("Show in child 2 class");
    }
}

public class A20Final {
    public static void main(String args[]) {
        final int n = 10;   // fixed variable it can't be changed
        System.out.println(n);

        Parents obj = new Parents();
        obj.show();
    }
}
