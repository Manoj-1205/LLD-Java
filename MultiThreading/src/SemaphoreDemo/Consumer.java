package SemaphoreDemo;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

import java.util.Queue;
import java.util.concurrent.Semaphore;

@AllArgsConstructor
public class Consumer implements Runnable{

    private Queue<FoodItem> queue;
    private int maxSize;
    private Semaphore producer;
    private Semaphore consumer;


    @SneakyThrows
    @Override
    public void run() {
        while(true){
            consumer.acquire();
            queue.remove();
            System.out.println("Consumed. Remaining items left "+queue.size()   );
            producer.release();

        }
    }
}
