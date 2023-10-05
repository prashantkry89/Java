/*
! Interface 
    🎀 Interface is not a class & by default every method in Interface is public 
    🎀 Interface is abstract in default. 
    🎀 Interface provides method not implementation used to design something
    🎀 As in class we need extends to make derived class same here need implements 
            then a class to implement methods of interface.
    🎀 It become abstract if we had not defined method of interface in Class of 
            interface implementation.
    🎀 Every variable in interface by default is final and static so initialization
            is must at same time.
    🎀 Instantiate class not Interface & implement method only not variable.
    🎀 Interface don't have its own memory in Heap its of object only so how it can
            have non final variable.

    🎀 can a class implements multiple interface ❓
            Yes class can implements multiple interface only method of that interface 
                had to be defined in that class 

🎀                              Types of Interface 
                                        ↓
                    Normal          Functional/SAM        Marker 
                                                    (Blank Interface 
                                                    without any method )
! Serialization is storing value of object in hard drive and removing it from heap
    the conversion of the state of an object into a byte stream; 
! Deserialization does the opposite It load value from hard drive back to heap 
    to make work & initially value is 0. Stated differently, serialization is the
    conversion of a Java object into a static stream (sequence) of bytes, which we 
    can then save to a database or transfer over a network.
    ! by default every obj is not allowed to do so it is done by using Marker.
*/

interface A {
    void show();

    void display();
}

interface B {
    void play();
}

class X implements A, B {
    public void show() {
        System.out.println("Implementing method show of interface");
    }

    public void display() {
        System.out.println("Implementing metahod display of interface");
    }

    public void play() {
        System.out.println("Implementing method multiple of interface");
    }
}

public class A24Interface {
    public static void main(String args[]) {
        A obj = new X();
        obj.show();
        obj.display();

        B obj1 = new X();
        obj1.play();
    }
}
