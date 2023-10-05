/*
! Object class 
    🎀 Every class in java extends obj class whenever try to print obj it call in default
         toString() method which in ObjectClass return 
             getClass().getName + "@" + Integer.toHexString(hashCode())
    🎀 HashCode generate string of fixed size of all data of program using hash 
         algorithm 
 
    🎀 But if toString() method is created then it will give o/p a/q to user by searching 
         in super class 
 
*/

class Laptop {
    String model;
    int price;

    public String toString() {
        return model + " " + price;
    }

    public boolean equals(Laptop that) {
        return this.model.equals(that.model) && this.price == that.price;
    }
}

// ! upCasting
class A {
    public void show() {
        System.out.println("In show");
    }
}

class B extends A { // here B has access to A but A has no idea of B, so downCasting come
    public void display() {
        System.out.println("In display");
    }
}

public class A21ObjClassUpDOwnCasting {
    public static void main(String args[]) {
        Laptop obj = new Laptop();
        obj.model = "Samsung";
        obj.price = 200000;
        // o/p ↓ className @ hex decimal value if toString() is not created
        System.out.println(obj.toString());

        Laptop obj1 = new Laptop();
        obj1.model = "Samsung";
        obj1.price = 200000;
        // o/p ↓ false if equals() is not created & come from ObjectClass
        System.out.println(obj1.equals(obj));

        // ! upCasting
        // obj of B but refer to A & as B is sub class and A is super class type 
            // casted from sub class B 
        A objA = (A) new B(); 
        objA.show();
        // objA.display()  ❌ can't be called as reference is of A 

        // ! downCasting
        // as above objB is referred in class A it can be typeCasted to B 
        B objB = (B) objA;  // downCasting to B  
        objB.display();
    }
}
