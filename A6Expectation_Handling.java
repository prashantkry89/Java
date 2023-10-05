/*
! Errors 
                                Types of Errors 
                    ↓                   ↓                   ↓
            Run time error      Compile time error      Logical Error
    Run time error 
        Error come while executing code, due to file not found or / by 0
        But can be handled by using try & catch 
        It stop execution at error line itself
    Compile time error      
        System.out.Println(); -> P  will create compile time error 

    Logical Error
        2+2 = 4 but got 5 due to logical error
    
    Error can't be handled by user. 
    Exception is parent class of all child catch -> can be handled by user 
    ArithmeticException -> Runtime exception is parent class for it 
                                    Object Class
                                          ↓
                                      Throwable
                    ↓                                               ↓
                  Error                                         Exception
            ↓       ↓        ↓                                ↓         ↓        ↓
      Thread Death  ↓    I/O error                  Runtime Exception   ↓    SQL Exception
                    ↓ →→→→→→→→→→→→↓                        ↓            ↓
        Virtual Machine Error   | Out of memory error      ↓         I/O Exception
                                                           ↓ 
                                                UnChecked Exception         Checked Exception                          
                                            ---------------------------  --------------------           
                                            |-> Arithmetic Exception         |->        
                                            |-> ArrayIndexOutOfBound         |->        
                                            |-> Null Pointer                 |-> 

        ! Throw -> used to throw exception in try block & catch will catch exception
            object had to be created => new exceptionName 

        ! errName.printStackTrace();  // printing all stack of work behind scene
*/

import java.util.*;
class MyException extends Exception{ // creating own exception 
    public MyException (String str){
        super(str);
    }
}
public class A6Expectation_Handling {
    public static void main(String[] args) {
        // ! Try and Catch exception handling
        int y = 80, z=0;
        int []arr=new int[5];
        String s=null;
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        try {
            z = y / x;
            // System.out.println(arr[1]);
            // System.out.println(arr[3]);
            // System.out.println(s.length());
            // if(x==0) throw new ArithmeticException("Exception thrown");
            if(z==0) throw new MyException("Own Exception thrown"); // own exception 
        }catch(MyException err){
            System.out.println("Error from own Exception is "+err);
            err.printStackTrace();  // printing all stack of work behind scene
        }catch (ArithmeticException error) {
            z=y/4;  // handle if division is done by 0
            System.out.println("error" + error);
        } catch (ArrayIndexOutOfBoundsException er){
            System.out.println("Error as array out of range "+er);
        } catch(Exception e){   // Parents class for all catch 
            System.out.println("Something went wrong " + e);
        }
        System.out.println("Value is "+z);
    }
}