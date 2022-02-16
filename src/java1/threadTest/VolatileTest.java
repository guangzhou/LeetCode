package java1.threadTest;

public class VolatileTest {

    boolean stop = false;
//	volatile boolean stop = false;

    public static void main(String[] args) throws Exception{
        VolatileTest v = new VolatileTest();
        Thread ta = new Thread(()->v.execute());
        ta.start();
        Thread.sleep(2000);
        Thread tb = new Thread(()->v.shutdown());
        tb.start();
    }

    public void execute(){
        while(!stop){
            String a = "a";
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(a);

        }
    }
    public void shutdown(){
        System.out.println("do stop");
        stop = true;
    }



}