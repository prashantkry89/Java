/* 
!Abstraction 
    Need to declare method & defining in another class method need of abstraction come
    Object of abstract class can't be created 
    It is must to have abstract class to create abstract method but,
    It's not compulsory to have abstract method in abstract class
    Also abstract class can have normal method as well as abstract method
    Once abstract method is declared in abstract class then its must to define that
        method in derived child class 
    If derived class can't full fill all condition of main abstract class then it 
        also become abstract class & another derived class had to be created to full
        fill remaining class 
    One class can extends only one abstract class not multiple. 
*/

abstract class Car {
    public abstract void drive(); // method declared

    public abstract void flyCar(); // method declared

    public void PlayMusic() {
        System.out.println("Music Playing");
    }
}

// defining in another class method for driving car
abstract class BMW extends Car {
    public void drive() { // method over ride
        System.out.println("Driving car");
    }
}

class AdvanceBMW extends BMW {  // known as concrete class
    public void flyCar() { // method over ride
        System.out.println("Flying car");
    }
}

public class A22Abstract {
    public static void main(String args[]) {
        Car obj = new AdvanceBMW();
        obj.drive(); // calling drive of BMW not Car
        obj.PlayMusic();
        obj.flyCar();
    }
}
