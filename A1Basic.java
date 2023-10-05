
// 🍁 Class name & file name should be same 
/*
    ↪ all code must be written in java class only 
    ↪ in java string can't be modified once created  
    ↪ variable is where data's are stored 
    ↪
*/


public class A1Basic {
    public static void main(String[] args) {
        System.out.println("Hello Java");
        System.out.print("Hello Java");
        System.out.println("Java 1st program");

        // 🍁 Variable
        String x = "sam";
        String y = x;
        int z = 45;

        // 🍁 Data types
        /*
            ! 🍀 Primitive Data Types -> we had to put L,F so java will 
                ! know its float or long f
                byte -> 1 [-128,127]
                boolean  -> 1
                short -> 2
                char  -> 2
                int  -> 4
                float  -> 4
                long  -> 8
                double -> 8

            ! 🍀 Non-Primitive Data Types 
                String 
        */
        String name="I'm Primitive Data Types";
        String name1=new String("I'm Non Primitive Data Types");
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name1);
        System.out.println(name1.length());

        //! concatenate 
        System.out.println(name+" and "+name1);

        //! index -> variable_name.charAt()
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(5));
        
        //! replace -> variable_name.replace('','') -> don't modify original string 
        System.out.println(name.replace("i", "I"));

        //! substring alternative of slice in c++ 
        System.out.println(name.substring(2, 8));
        
        // ! literals  -> will remove _ and give normal no
        int num1=10_10_00_0;
        System.out.println(num1);
    }
}
