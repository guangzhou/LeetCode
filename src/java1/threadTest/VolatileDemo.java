package java1.threadTest;

public class VolatileDemo {

//    public static volatile boolean flag = true;
    public static  boolean flag = true;

    public static void main(String[] args) throws Exception {
        new Thread(() -> {

            while (flag) {

//                System.out.println(1);
                System.currentTimeMillis();

            }
            System.out.println("end of thread");

        }).start();

        Thread.sleep(10);
        System.out.println("turn stop to true");
        System.out.println("turn stop to true");
        System.out.println("turn stop to true");
        flag = false;

    }


}