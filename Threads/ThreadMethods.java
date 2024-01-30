package Threads;
class Thread1 extends Thread{
    @Override
    public void run(){
        System.out.println("Thread1 executing");
    
        for(int i=0;i<5;i++){
            try{
                sleep(5000);
                System.out.println(i);
           }
           catch(Exception e){
   
           }
           
        }
    }
}
public class ThreadMethods {
    public static void main(String[] args) {
        System.out.println("main thread executing");
        Thread1 thread1=new Thread1();
        //start method
       thread1.start();
        //getting id
        System.out.println(thread1.getId());
        //getName method
        System.out.println(thread1.getName());
        //setting Thread name
        thread1.setName("laliththread");
        System.out.println("new thread name is "+thread1.getName());

        //getting piority
        System.out.println(thread1.getPriority());
        //setting priority
        thread1.setPriority(10);
        System.out.println("new priority"+thread1.getPriority());
        
        //checking therad is alive or not 
        System.out.println(thread1.isAlive());
    }
}
