package Threads;
//thread implementation using runnable interface
class Thread2 implements Runnable{
    public void run(){
        System.out.println("Thread2 executing");
        for(int i=0;i<5;i++){
            System.out.println(i);
        }
}
}
public class Threadrun {
    public static void main(String[] args) {
        Thread thread=new Thread(new Thread2());
           thread.start();
    }
}
