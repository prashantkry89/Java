
class Student{
    int roll;
    String name;
    int marks;
}

public class A11ArrayObject {
    public static void main(String args[]){
        Student obj1=new Student();
        obj1.roll=10;
        obj1.name="Sam";
        obj1.marks=98;

        Student obj2=new Student();
        obj2.roll=11;
        obj2.name="Ram";
        obj2.marks=100;
        
        Student obj3=new Student();
        obj3.roll=12;
        obj3.name="Seeta";
        obj3.marks=99;

        // creating array of object 
        Student students[]=new Student[3];
        students[0]=obj1;
        students[1]=obj2;
        students[2]=obj3;
        for(int i=0;i<students.length;i++){
            System.out.println(students[i].roll + "." + students[i].name + " - " + students[i].marks);
        }
    }
}
