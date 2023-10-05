
/*
    ! Type Conversion
    byte b=127 as its max value that can be stored
    int a =256
    b=a ❌  , but 
    a=b  ✔️   is possible integer has wide range so smaller value can be stored there 
    but
    a=13
    b=a  ✔️ as a is smaller than b & its in range but it had to be casting to store
        b=(byte)a
        also if a =258 then it will do % and store remainder

    ! Type promotion 
        when two same data type operation is done & it cross it range then we can 
        store it in data type of that range 
        byte x=10;
        byte y=120;
        int z=x*y;
        */
        
        

// ! casting means conversion of 1 data type to another 

public class A3Casting {
    public static void main(String[] args) {
        // 🍁 casting 

        double price = 100.00;
        double fPrice = price + 18.5;
        System.out.println(fPrice);

        
        int Price = 100 ;
        int FPrice = Price+(int)18.5;
        System.out.println(FPrice);

        // 🍁 constant -> put final keyword before variable_name
        final float PI=3.14F;
        // PI=55;   //? can't be modified 
        System.out.println(PI);

        // 🍁 byte 
        int a=258;
        byte b=(byte)a; // will store remainder
        System.out.println(b);


        // ! Type promotion                 
        byte x=10;
        byte y=120;
        int z=x*y;
        System.out.println(z);
    }
}
