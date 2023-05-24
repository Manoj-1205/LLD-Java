package AtomicInteger;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        Count count=new Count(0);
        Adder adder = new Adder(count);
        Subractor subractor=new Subractor(count);

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.execute(adder);
        executorService.execute(subractor);

        executorService.awaitTermination(1000, TimeUnit.MILLISECONDS);
        System.out.println(count.getCount());

        executorService.shutdown();
    }
}
