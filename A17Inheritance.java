/*
! Anonymous Object - constructor is called just by new constructorName() in main
        It can't be used again as it don't have any name if do so means creating 2 obj
        class City{
            public City(){
                System.out.println("Anonymous Object Created");
            }
        }
        public class A17Inheritance {
            public static void main(String args[]){
                new City();
            }
        }

! Inheritance
    Having all property of base class in derived class  
        1. Single Inheritance 
        2. Multi Level Inheritance 
        3.  Inheritance 


    ❌ Multiple inheritance is not supported in java as of ambiguity problem 
            ambiguity problem means getting confusion from where derived class will
            take data either from base class 1 or base class 2 
        So Interface come here 🤷‍♀️
🎀
*/

// super class || Base class || grandParents
class Calculator { 
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int sub(int n1, int n2) {
        return n1 - n2;
    }
}

// Derived class but base class for 2nd Derived class || Parents
// Single level Inheritance
class AdvanceCalculator extends Calculator { // sub class & extends is inheritance
    public int product(int n1, int n2) {
        return n1 * n2;
    }

    public int division(int n1, int n2) {
        return n1 / n2;
    }
}

// 2nd Derived class from derived class || child
// Multilevel Inheritance 
class VeryAdvanceCalculator extends AdvanceCalculator {
    public int remainder(int n1, int n2) {
        return n1 % n2;
    }

    public double power(int n1, int n2) {
        return Math.pow(n1, n2);
    }
}

public class A17Inheritance {
    public static void main(String args[]) {
        VeryAdvanceCalculator obj = new VeryAdvanceCalculator();
        int s = obj.add(10, 20);
        int d = obj.sub(30, 20);
        int m = obj.product(30, 20);
        int div = obj.division(30, 20);
        int remainder = obj.remainder(30, 20);
        double power = obj.power(3, 2);
        System.out.println("Sum = " + s + "\nDiff = " + d + "\nMultiplication = " + m + "\nDivision = " + div + "\nRemainder = " + remainder + "\nPower = " + power);
    }
}
