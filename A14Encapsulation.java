/*
! Encapsulation
    It's a method by which data can be hided to outside class
        directly and can be accessed in directly using methods
        for hiding data we use private , & can be accessed outside class using public 
        & making get method
    this -> holds current obj it also remove confusion of instance & local variable 
        & allow facility to put same variable name 
*/

class Human{
    private int age=20;
    private String name="Bittu ";

    public int getAge(){    // to get data from private called getter
        return age;
    }

    public void setName(String name){ // creating method to set name called setter
        this.name=name;
    }

    public String getName(){    // to get data from private called getter
        return name;
    }

    public void setAge (int a){ // creating method to set age called setter
        age=a;
    }
}

public class A14Encapsulation {
    public static void main(String args[]){
        Human obj=new Human();
        obj.setAge(20);;
        obj.setName("Sweety");
        System.out.println(obj.getName() +" age is "+ obj.getAge());
    }
}
