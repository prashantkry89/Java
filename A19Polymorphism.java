/*
! Polymorphism 
    same object or reference will have different behavior
                        Polymorphism
                              ↓
            Compile Time                Run Time
             overloading               overriding

    ! Compile Time (late binding)
        What things will be executed at compile time 
    ! Run Time (early binding)
        Which method will be executed at run time 

    ! when creating obj base class name can be used to create obj of child class & it
        will be of type base class 
    ! Dynamic method dispatch

*/

class Parent{
    public void show(){
        System.out.println("In parent class");
    }
}

class Child1 extends Parent{
    public void show(){
        System.out.println("In child 1 class");
    }
}

class Child2 extends Parent{
    public void show(){
        System.out.println("In child 2 class");
    }
}

public class A19Polymorphism {
    public static void main(String args[]){
        // ! run time polymorphism below as obj will act different in different case
            // at run time also called ❗Dynamic method dispatch it only work when child inherit parent
        Parent obj=new Parent();  // obj is of type parent
        obj.show();

        // allotting new obj in old reference also it will remove obj Parents permanently 
        obj = new Child1();  // obj child of type parent 
        obj.show();

        obj = new Child2();  
        obj.show();
    }
}
