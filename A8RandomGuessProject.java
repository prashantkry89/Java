
// User will guess input and then if guessed is above of no generated then 
// it will say no is smaller if no is guessed smaller then it will print
// no is greater    -> No will be generated randomly 
import java.util.Scanner;

public class A8RandomGuessProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MyNum = (int) (Math.random() * 100);
        int no = 0;
        // System.out.print(MyNum);
        do {
            System.out.print("Guess the No (1-100) ");
            no = sc.nextInt();
            if (no == MyNum) {
                System.out.println("Congratulation You won the game");
                break;
            } else if (MyNum > no) {
                System.out.println("Entered no is smaller guess again");
            } else {
                System.out.println("Entered no is larger guess again");
            }
        } while (no >= 0);
        System.out.println("No to be guessed was "+MyNum);
    }
}
