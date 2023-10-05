/*
! Method 
    to make fn to perform an action to do something 
    ! Method overloading
        when we have same method name & same or different no of parameter of 
            different type then method overloading is created to do different task.
        MAIN matter point is here method name and its parameter no and its type

*/
import java.util.*;
class CreatingMethod{
    public void Music(){
        System.out.println("Playing Music");
    }
    public String Pen(int money){
        if(money==10)
            return ("Pen Bought");
        else  return ("Pen can't be Bought as money is not Rs 10");
    }
    // ! creating method overloading 
    int num=2000;   // a random value to check obj working 
    public int add(int x,int y){
        return x+y;
    }
    public double add(int x,double y){
        return x+y;
    }
    public int add(int x,int y,int z){
        return x+y+z;
    }
}

public class A10Method{
    public static void main(String ars[]){
        CreatingMethod obj=new CreatingMethod();
        obj.Music();
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter money for buying pen ");
        int n= inp.nextInt();
        String str=obj.Pen(n);
        System.out.println(str);

        //! calling method overloading 
        int data=10;
        System.out.println(obj.add(100, 200, 300));
        System.out.println(obj.add(200,3000.10));
        int returned =obj.add(400, 500);
        System.out.println(returned);

        // ! checking random value working procedure with obj 
        CreatingMethod obj1=new CreatingMethod();
        CreatingMethod obj2=new CreatingMethod();
        System.out.println(obj1.num);
        obj1.num=300;   // here value in obj1 will change not in obj2 or original  
        System.out.println(obj1.num);
        System.out.println(obj2.num);
    }
}