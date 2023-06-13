package ParallelMergeSort;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SortList {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> list = List.of(10,9,5,2,1,3,4,7,6,8);
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        MergeSort mergeSort = new MergeSort(list, executorService);
        Future<List<Integer>> finalList = executorService.submit(mergeSort);

        System.out.println("Final List "+finalList.get());
        System.out.println("Completed ? "+finalList.isDone());
        executorService.shutdown();
    }
}
