package ����.������������ģ��;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ������������ģ��
 */
public class Main {

    private static final int MAX = 10;

    private static int count = 0;

    public Lock lock = new ReentrantLock();

    public Condition c1 = lock.newCondition();
    public Condition c2 = lock.newCondition();

    class Producer implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                lock.lock();
                try {
                    while (count == MAX) {
                        c1.await();
                    }
                    count++;
                    System.out.println(Thread.currentThread().getName() + "������������Ŀǰ���У�" + count);
                    c2.signal();
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        }
    }

    class Consumer implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                lock.lock();
                try {
                    while (count == 0) {
                        c2.await();
                    }
                    count--;
                    System.out.println(Thread.currentThread().getName() + "���������ѣ�Ŀǰ���У�" + count);
                    c1.signal();
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        new Thread(main.new Producer()).start();
        new Thread(main.new Producer()).start();
        new Thread(main.new Producer()).start();
        new Thread(main.new Producer()).start();
        new Thread(main.new Producer()).start();
        new Thread(main.new Consumer()).start();
        new Thread(main.new Consumer()).start();
        new Thread(main.new Consumer()).start();
        new Thread(main.new Consumer()).start();
        new Thread(main.new Consumer()).start();
    }
}
