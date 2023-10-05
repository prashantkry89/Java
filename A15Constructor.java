
/*
! Constructor
    🎀 When object is created & get stored in heap memory, It have value 0 in int &
            null in string so if need of value to initialized at time of obj 
            creation then use of Constructor come 
    🎀 Constructor is same as method & but it won't return any data like int float 
            String
    🎀 It's name must be same as class name 
    
    🎀 Every time obj is created constructor is Called 
    🎀 When constructor is used then value can be set directly in constructor 
            instead of main fn & obj will get it as constructor is called when obj 
            is created 
    🎀 When constructor is not provided then java create virtually its own default constructor 
    🎀 

*/

class College{
    private String name;    // instance variable 
    private int student;
    private int teacher;

    public College(){   // creation of default constructor
        System.out.println("Inside Constructor");
        name="LPU";
        student=50000;
        teacher=40;
    }

    public College(String name,int student , int teacher){ // creation of parameterized constructor
        System.out.println("Inside Constructor");
        this.name=name;
        this.student=student;
        this.teacher=teacher;
    }

    public void setName(String name){   // setter
        this.name=name;
    }

    public String getName(){    // getter 
        return name;
    }

    public int getStudent(){
        return student;
    }

    public int getTeacher(){
        return teacher;
    }

    public void setTeacher(int teacher){
        this.teacher=teacher;
    }

    public void setStudent(int student){
        this.student=student;
    }

}
public class A15Constructor {
    public static void main(String args[]){
        College obj=new College();  // obj creation & calling constructor 
        System.out.println("Name - " + obj.getName() +", Student - "+ obj.getStudent() +", Teacher - "+ obj.getTeacher());
        
        College obj1=new College("Lovely professional University",40000,60);
        System.out.println("Name - " + obj1.getName() +", Student - "+ obj1.getStudent() +", Teacher - "+ obj1.getTeacher());

    }
}
