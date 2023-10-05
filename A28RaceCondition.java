/*
!Race Condition
    When 2 thread execute on same class at a time 
*/

class Counter {
    int x;
    public synchronized int inc() { // synchronized make thread execute 1 by 1
        return x++;
    }
}

public class A28RaceCondition {
    public static void main(String args[]) throws InterruptedException{
        Counter c = new Counter();
        Runnable obj1 = () ->{
            for(int i=1;i<5000;i++){
                c.inc();
            }
        };
        Runnable obj2 = () ->{
            for(int i=1;i<5000;i++){
                c.inc();
            }
        };
        Thread t1 = new Thread(obj1);
        t1.start();
        Thread t2 = new Thread (obj2);
        t2.start();
        t1.join();  // Waits for this thread to terminate.
        t2.join();
        System.out.println(c.inc());
    }
}
