import java.util.Scanner;

public class A4Operator {
    public static void main(String[] args) {

        // ! Operator
        int x = 10, y = 5;
        System.out.println("x -> " + x + " & y-> " + y);
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
        System.out.println("x % y = " + (x % y));

        // ! Maths
        System.out.println(Math.max(10, 5));
        System.out.println(Math.min(10, 5));
        System.out.println((int) (Math.random() * 100));

        // ! Input In Java
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data ");

        // ? Integer input
        int data = sc.nextInt();
        System.out.println("Data " + data);

        // ? String input
        System.out.println("Enter name ");
        String name = sc.next(); // it accept only token so o/p -> word
        System.out.println(name);

        String names = sc.nextLine();
        System.out.println(names);

        // ! Comparison Operator
        int a = 5, b = 6, c = 5;
        if (a == b) {
            System.out.println("a Equal b");
        } else if (a == c) {
            System.out.println("a Equal c");
        } else {
            System.out.println("Its not Equal");
        }

        // ! Logical Operator
        // ? && and || or
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        if (age >= 18 && age <= 60) {
            System.out.println("can vote");
        } else if (age < 18 || age >= 90) {
            System.out.println("can't vote you are 18 or 90+");
        } else {
            System.out.println("Its not valid age ");
        }

        // ! Switch Case
        System.out.println("Enter Day Code");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Its Monday");
                break;
            case 2:
                System.out.println("Its Tuesday");
                break;
            case 3:
                System.out.println("Its Wednesday");
                break;
            case 4:
                System.out.println("Its Thursday");
                break;
            case 5:
                System.out.println("Its Friday");
                break;
            case 6:
                System.out.println("Its Saturday");
                break;
            case 7:
                System.out.println("Its Sunday");
                break;
            default:
                System.out.println("Enter valid day code");
        }
    }
}