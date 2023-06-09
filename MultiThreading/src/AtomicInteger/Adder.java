package AtomicInteger;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.lang.reflect.Field;

@AllArgsConstructor
@Getter
@Setter
public class Adder implements Runnable {
    private Count count;

//    Field[]
    @Override
    public void run() {
        for(int i=1;i<=10000;i++){
            count.increment();
//            System.out.println("Increment "+count.getCount());
        }
    }
}
