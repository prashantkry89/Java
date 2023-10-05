/*

! super
    🎀 In Java every constructor has method called super() in default 
    🎀 If we had 2 constructor A in class A and B in class B & A is extended by B 
            then after creating obj B of class B both A and B constructor will be called 
    🎀 But of we use parameterized constructor then & after passing args in obj B 
            It will call only parameterized constructor B not constructor B or A or 
            parameterized constructor A 
            Dry Run 
            When obj B(args) is created then parameterized constructor B is called
                & as super() is 1st statement in every constructor then it will call
                constructor A after finishing it, it will come back to constructor B
                and executes its code 
            But if still need to call parameterized constructor then in constructor B
                in method super(args) had to be passed then it will call parameterized
                constructor A
            Also if need to print default constructor B then parameterized 
                constructor A then after creating B obj() of constructor B then 
                calling constructor B & in method super(args) pass args it will call
                parameterized constructor A.

            But if need o/p of constructor B parameterized constructor B & 
                constructor A then use of 
                ! this 
                keyword come in form as it will executes constructor of same class


    🎀 1st class in Java in default extends Obj

*/

class A{    // A super class
    public A(){
        super();    // in default it is there as hidden but if in need we can use it
        System.out.println("In super class A");
    }
    public A(int x){
        System.out.println("In sub class A as parameterized constructor");
    } 
}

class B extends A{  // B is sub class
    public B(){
        System.out.println("In sub class B");
    }
    public B(int x){
        this(); // o/p of constructor B, A then parameterized constructor B
        System.out.println("In sub class B as parameterized constructor");
    }    
}

public class A16ThisSuper {
    public static void main(String args[]){        
        // B obj=new B(); // obj B will call constructor A, B,
        B obj=new B(2); // obj B will call parameterized constructor B only 
    }
}
