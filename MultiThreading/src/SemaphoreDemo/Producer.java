package SemaphoreDemo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;

import javax.sound.sampled.Port;
import java.util.Queue;
import java.util.concurrent.Semaphore;

@Getter
@Setter
@AllArgsConstructor
public class Producer implements Runnable{

    private Queue<FoodItem> queue;
    private int maxSize;
    Semaphore producer;
    Semaphore consumer;

    @SneakyThrows
    @Override
    public void run() {
        while(true){
            producer.acquire();
            queue.add(new FoodItem());
            System.out.println("Produced. Remaining items left "+queue.size());
            consumer.release();

        }
    }
}
