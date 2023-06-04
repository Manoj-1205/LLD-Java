import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class Pair<TYPE1, TYPE2> {
    TYPE1 left;
    TYPE2 right;

    Pair(TYPE1 left, TYPE2 right){
        this.left = left;
        this.right = right;
        if(left == null)
            throw new LeftValueNullException("Null value not allowed. Left value is null");
        else if(right == null)
            throw new RightValueNullException();    
    }

    public Pair<TYPE2, TYPE1> swapValues(Pair<TYPE1, TYPE2> pair){
        return new Pair(pair.getRight(), pair.getLeft());
    }
}
