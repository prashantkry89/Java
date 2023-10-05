/*
! Annotation 
    Its like supplement to compiler or runtime,(supplying extra info to compiler or 
        runtime ) also called metadata 

    @Deprecated, 
    @Override   // will show errors overriding 

! Functional Interface 
    It have only 1 method 

! Lambda Expression 
    Makes code shorter and faster in execution only works with functional interface
    -> {
        code
    }

*/
// ! Annotation start
class A {
    public void show() {
        System.out.println("In A show");
    }
}

class B extends A {
    @Override // will show errors overriding
    public void show() {
        System.out.println("In B show");
    }
}
// ! Annotation end

// ! Functional Interface start
// ! below interface is called SAM -> Single Abstract Interface or Functional
// Interface
@FunctionalInterface // It specifies it must have only 1 method
interface X {
    void display(int i);
}

// Interface with return
@FunctionalInterface
interface P {
    int add(int j, int k);
}

public class A25Annotation {
    // ! Annotation
    public static void main(String args[]) {
        B obj = new B();
        obj.show();

        // ! Functional Interface start
        X obj1 = new X() {
            public void display(int i) {
                System.out.println("In Interface class value is " + i);
            }
        };
        obj1.display(10);

        // ! Lambda expression
        X obj2 = (i) -> System.out.println("Interface class using Lambda expression arguments is " + i);
        obj2.display(100);

        // Lambda expression accepting return value {return is not needed}
        P obj3 = (j, k) -> j + k;
        System.out.println("Sum = " + obj3.add(500, 300));
    }
}
