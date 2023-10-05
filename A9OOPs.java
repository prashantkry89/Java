
/*
! OOPs -> Object Oriented Programming 
    It have property & behavior 
    Need 
        class -> act as schema how things going to be done  
        object 
            className referenceVariable = new className()

    ! creating class 
    class Calculate{
        public int add(){
            System.out.println("Its inside class");
            return 0;
        }
    }

    public class A9OOPs {
        public static void main(String arg[]) {         
            Calculate calc = new Calculate();   // ! creating object
            calc.add(); // ! calling fn of Calculate class 
        }
    }
*/


// ! creating class 
class Calculate{
    public int add(int x, int y){
        // System.out.println("Its inside class");
        return x+y;
    }
}

public class A9OOPs {
    public static void main(String arg[]) {         
        Calculate calc = new Calculate();   // creating object
        int x=10,y=20;
        int sum=calc.add(x,y); // calling fn of Calculate class 
        System.out.println("Sum = "+sum);
    }
}
 