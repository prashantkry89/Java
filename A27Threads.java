
/*
! Java Threads
Threads allows a program to operate more efficiently by doing multiple things at same time.
Threads can be used to perform complicated tasks in background without interrupting main program.
Make 2 program function work at same time then thread comes in.

! Creating a Thread
There are two ways to create a thread.
It can be created by extending the Thread class and overriding its run() method: 

! Schedular -> responsible for multiple threads execution at a time.
! object.getPriority() -> responsible for multiple thread execution at a time of obj.
! object.setPriority(Thread.MAX_PRIORITY); -> will give priority to obj with given name.
! Thread must work with Immutable
! Thread must work 1 at a time
*/

/*          Main Code 
class A extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("Hello I'm thread");
            try{
                Thread.sleep(10);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class B implements Runnable{
    public void run(){
        for(int i=1;i<10;i++){
            System.out.println("Hi I'm thread");
            try{
                Thread.sleep(10);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class A27Threads {
    public static void main(String args[]){
        A objA = new A();
        objA.start();

        Runnable objB = new B();
        Thread t1 = new Thread(objB);
        t1.start();
    }
}
*/

// Executing above code using Lambda expression 
public class A27Threads{
    public static void main(String args[]){
        Runnable obj1 = () -> {
            for(int i=0;i<=5;i++){
                System.out.println("Thread");
                try{
                    Thread.sleep(3);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
        Runnable obj2 = () ->{
            for(int i=1;i<=5;i++){
                System.out.println("Lambda Expression");
                try{
                    Thread.sleep(3);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}