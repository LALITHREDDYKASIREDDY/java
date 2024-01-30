package Threads;
//thread implementation using Thread class
class Thread1 extends Thread{
    @Override
    public void run(){
        System.out.println("Thread1 executing");
        for(int i=0;i<5;i++){
            System.out.println(i);
        }
    }
}

public class ThreadMain extends Thread {
    public static void main(String[] args) {
        System.out.println("main thread executing");
        Thread1 thread1=new Thread1();
        thread1.start();
        System.out.println("main thread executing");
    }
}


