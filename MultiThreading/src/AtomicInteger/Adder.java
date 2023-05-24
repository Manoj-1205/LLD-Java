package AtomicInteger;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Adder implements Runnable {
    private Count count;

    @Override
    public void run() {
        for(int i=1;i<=10000;i++){
            count.increment();
//            System.out.println("Increment "+count.getCount());
        }
    }
}