package Threads;
class Example{
    
    //synchronised method
    synchronized void display(){
       
        Thread thread=Thread.currentThread();
        for(int i=0;i<5;i++){
            System.out.println(thread.getName()+" "+i);
        }
    }
    // synchronised block
    void display1(){
        synchronized(this){
        Thread thread=Thread.currentThread();
        for(int i=0;i<5;i++){
            System.out.println(thread.getName()+" "+i);

        }
        }
    }
     //synchronised static method
     synchronized static void display2(){
       
        Thread thread=Thread.currentThread();
        for(int i=0;i<5;i++){
            System.out.println(thread.getName()+" "+i);
        }
    }
}
class Thread1 extends Thread{
    Example e;
    public Thread1(Example e){   
        this.e=e;
    }
    @Override
    public void run(){
        e.display();
        
    }
}
public class Sync {
    public static void main(String[] args) {
        Example e=new Example();     
    Thread1 th1=new Thread1(e);
     Thread1 th2=new Thread1(e);
     Thread1 th3=new Thread1(e);
     th1.start();
     th2.start();
     th3.start();
     
    }
    

}
