package ParallelMergeSort;

import java.util.List;

public class SortList {
    public static void main(String[] args) {
        List<Integer> list = List.of(10,9,5,2,1,3,4,7,9,6,8);
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(list);
        System.out.println("Final List "+list);
    }
}
