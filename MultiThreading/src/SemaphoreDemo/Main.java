package SemaphoreDemo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Queue<FoodItem> queue = new LinkedList<>();
        int maxSize = 5;

        Semaphore producer = new Semaphore(maxSize);
        Semaphore consumer = new Semaphore(0);

        Producer p1 = new Producer(queue, maxSize, producer, consumer);
        Producer p2 = new Producer(queue, maxSize, producer, consumer);
        Producer p3 = new Producer(queue, maxSize, producer, consumer);
        Producer p4 = new Producer(queue, maxSize, producer, consumer);

        Consumer c1=new Consumer(queue, maxSize, producer, consumer);
        Consumer c2=new Consumer(queue, maxSize, producer, consumer);
        Consumer c3=new Consumer(queue, maxSize, producer, consumer);
        Consumer c4=new Consumer(queue, maxSize, producer, consumer);

        new Thread(p1).start();
        new Thread(p2).start();
        new Thread(p3).start();
        new Thread(p4).start();

        new Thread(c1).start();
        new Thread(c2).start();
        new Thread(c3).start();
        new Thread(c4).start();


    }
}
