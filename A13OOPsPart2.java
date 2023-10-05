
/*
! OOPs 
    Static -> to make a variable common to many obj 
        should be called with class name & it belong to class not obj 
        also static block is called 1st even before constructor 
        ? why static block called 1st and only 1 time 
        when class is created then it happens only once then object is initialized 
            so static called once and at 1st then constructor as no of obj 

        🎀 In JVM special area is there which is called class Loader
        If we don't have object &d still want to call class then we will use 
            Class.forName("className")
                to all class 
        Static variable can be used in static method but non static variable can't
            be used inside static method because static work with class & when we call
            it with class then it get confused as of multiple obj on which obj it had 
            to be implemented for this we had to pass obj in class as arguments & also
            accept it as parameter in calling static method

    ! in main fn why static is there ?
        Their static is used as it is main fn and from there only execution will start
        and if static is removed then main will become non static method and then if we
        want to call main then we had to use any other obj and it will lead to deadlock 
        because execution had to be started from main only so static is used in main
*/
class Mobile {
    // below is called instance variable 
    String brand;
    int price;
    static String type;

    // creating constructor 
    public Mobile(){
        brand=" ";
        price=3000;
        System.out.println("In constructor");
    }
    // creating static block 
    static{
        type="Phone";
        System.out.println("In static block");
    }

    // creating method 
    public void print(){
        System.out.println(brand + " " + price + " " + type);
    }
    
    // creating static method 
    public static void show(Mobile obj1){
        System.out.println("Its in static method ");
        System.out.println(obj1.brand + " " + obj1.price + " " + type);
    }

}

public class A13OOPsPart2 {
    // public static void main(String args[]) throws ClassNotFoundException { // use when obj is not there 
    public static void main(String args[]){  // use when obj is there 

        // ! calling class without obj 
        // Class.forName("Mobile");

        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price=1000;
        Mobile.type="Smartphone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price=3000;
        Mobile.type="foldable";

        Mobile obj3 = new Mobile();
        obj3.brand = "Honor";
        obj3.price=4000;
        Mobile.type="phone";

        Mobile.type="Smart Phone";
        obj1.print();
        obj2.print();
        obj3.print();

        // calling static method 
        Mobile.show(obj1);
    }
}
