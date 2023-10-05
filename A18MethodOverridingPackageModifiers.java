/*
! Method Overriding 
    When new method over ride then functionality of old in inheritance then Method
        Overriding is created 
        iun this in base and derived class both have same method name 
! Package 
    Its a library of module & class 
! Access Modifier 
    1. Public -> can be accessed any where 
    2. Private -> can be accessed in same class, sub-class, package, different 
            package sub-class only  
    3. Protected -> can be accessed in same class only 
*/

class OldMethod{
    public int add(int n,int m){
        return n+m;
    }
}
class MethodOverriding extends OldMethod{ 
    public int add(int n,int m){ // method id overridden 
        return n-m;
    }
}
public class A18MethodOverridingPackageModifiers {
    public static void main(String args[]){
        MethodOverriding obj=new MethodOverriding();
        int x=obj.add(10, 5);
        System.out.println(x);
    }
}
