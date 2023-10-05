/*
! Enum
    It's way to represent status like a status code in web development 
    enum Status{    -> status is a class here 
        all called object here these can be accessed in main class  
    }
    if else and switch both work with enum
    enum can't be extended with another class but it can extend to enum class 
*/

// ! creating enum class 
enum Status {
    coder, programmer, JavaDeveloper;
}

// ! treat own class as enum
enum Laptop {
    macBook(2000), samsung, dell(1500), surface(1200);

    // creating constructor of price as it is constructor
    private int price;

    private Laptop() {  // default constructor for price which is not mentioned
        price = 1800;
    }

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() { // getter
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class A24Enum {
    public static void main(String args[]) {
        Status s = Status.programmer;
        System.out.println(s);
        System.out.println(s.ordinal()); // ordinal show index noS

        Status[] ss = Status.values(); // to get all obj of enum
        for (Status arr : ss) {
            System.out.println(arr);
        }

        // ! getting base class
        System.out.println("Base class of Enum is " + s.getClass().getSuperclass());

        // ! getting value of own class enum
        // getting 1 value
        Laptop lap = Laptop.macBook;
        System.out.println("Laptop is " + lap + " & price is " + lap.getPrice());

        // getting all value
        for (Laptop laptops : Laptop.values()) {
            System.out.println("Laptop is " + laptops + " & price is " + laptops.getPrice());
        }
    }
}
