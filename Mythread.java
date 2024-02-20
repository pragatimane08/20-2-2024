public class Mythread {
    public static void main(String[] args) {
        Thread thread1 = new multi1("Thread 1");
        Thread thread2 = new multi1("Thread 2");
        thread1.start();
        thread2.start();
    }
}
class multi1 extends Thread{
    private String name;
    public multi1(String name){
        this.name = name;
    }

    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(name+": "+i);
        }
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.err.println(e);
        }
    }
}
