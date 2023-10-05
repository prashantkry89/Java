import java.util.*;
// ! In no
// public class A31Sorting {
//     public static void main(String args[]) {
//         // Comparing using last digit ofa number
//         Comparator<Integer> com = new Comparator<Integer>() {
//             public int compare(Integer i, Integer j) {
//                 if (i % 10 > j % 10)
//                     return 1;
//                 else
//                     return -1;
//             }
//         };
//         List<Integer> arr = new ArrayList<>();
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter array Element ");
//         for (int i = 1; i <= 5; i++) {
//             int x = sc.nextInt();
//             arr.add(x);
//         }
//         // sorting all element in ascending order & to get sorting a/q to 2nd digit 
//             // use com
//         Collections.sort(arr, com);
//         System.out.println(arr);
//     }
// }





// ! In String 

class Student{
    int age;
    String name;

    public Student(int age,String name){
        this.name=name;
        this.age=age;
    }

    public String toString(){
        return "Student [age = " + age + ", name = " + name + "]";
    }
}
public class A31Sorting{
    public static void main(String args[]){
        // comparing in string 
        Comparator<Student> com = (i,j) -> i.age > j.age ? 1 : -1;
        
        List <Student> data = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        for(int i=0;i<x;i++){
            data.add(new Student(sc.nextInt(), sc.nextLine()));
        }
        Collections.sort(data,com);
        for(Student datas : data){
            System.out.println(datas);
        }
    }
}