package GenericsDemo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter

public class AddData<T1, T2> {
    private T1 id;
    private T2 name;
}
