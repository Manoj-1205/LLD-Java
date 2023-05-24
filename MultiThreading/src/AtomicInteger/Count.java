package AtomicInteger;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter

public class Count {
    private Integer count;

    public void increment(){
        count+=1;
    }
    public void decrement(){
        count-=1;
    }
}
