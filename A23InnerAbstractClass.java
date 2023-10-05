
/*
!Inner Class
    $innerClass belong to outer class
    for creation of object of inner class 
        outerClass.innerClass obj = outerClassObject.new innerCLass()

! Anonymous class 
    class without name only for purpose to be once 
*/
class A {
    int x = 100;

    public void main() {
        System.out.println("Outer class");
    }

    class B { // nonStatic inner class
        public void inner() {
            System.out.println("Inner class");
        }
    }

    static class C { // static class
        public void secondInner() {
            System.out.println("Second Inner class");
        }
    }
}

// ! abstract class
abstract class C{
    public abstract void abstractMethod();
    public abstract void abstractMethod2();
}

public class A23InnerAbstractClass {
    public static void main(String args[]) {
        // ! Anonymous class
        A obj = new A(){
            public void main(){
                System.out.println("Anonymous class");
            }
        };

        obj.main(); // it will access Anonymous class not main method of Class A

        // for accessing nonStatic inner class
        A.B obj1 = obj.new B();
        obj1.inner();
        // for accessing Static secondInner class
        A.C obj2 = new A.C();
        obj2.secondInner();

        // ! accessing abstract class as anonymous inner class
        C objC = new C() {
            public void abstractMethod(){
                System.out.println("Object of Abstract Anonymous Inner Class called here");
            }
            public void abstractMethod2(){
                System.out.println("Object of 2nd Abstract Anonymous Inner Class called here");
            }
        };
        objC.abstractMethod();
        objC.abstractMethod2();
        
    }
}
