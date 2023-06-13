package ParallelMergeSort;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class MergeSort implements Callable<List<Integer>> {
    List<Integer> list=new ArrayList<>();
    ExecutorService executorService;
    MergeSort(List<Integer> list, ExecutorService executorService){
        this.list = list;
        this.executorService = executorService;
    }
    //1 2 3 4 5 6 7 8 9 10
    public List<Integer> call() throws ExecutionException, InterruptedException {
        if(list.size() <= 1 ) return list;
        int mid = list.size()/2;
        List<Integer> left = list.subList(0, mid);
        List<Integer> right = list.subList(mid, list.size());
//        System.out.println("Left "+left);
//        System.out.println("Right "+right);
        MergeSort leftSort = new MergeSort(left, executorService);
        MergeSort rightSort = new MergeSort(right, executorService);

        Future<List<Integer>> l1 = executorService.submit(leftSort);
        Future<List<Integer>> l2 = executorService.submit(rightSort);
//        System.out.println("FUT "+l1.);
//        System.out.println("FUT "+l2.get());

        return merge(l1, l2);


    }

    public List<Integer> merge(Future<List<Integer>> f1, Future<List<Integer>> f2 ) throws ExecutionException, InterruptedException {
//        System.out.println("inside merge function");
        List<Integer> l1 = f1.get();
        List<Integer> l2 = f2.get();
        int n=l1.size();
        int m=l2.size();
        int p1=0, p2=0;
        List<Integer> list=new ArrayList<>();
        while(p1<n && p2<m){
            if(l1.get(p1) < l2.get(p2)){
                list.add(l1.get(p1));
                p1++;
            }
            else{
                list.add(l2.get(p2));
                p2++;
            }
        }
        while(p1<n){
            list.add(l1.get(p1));
            p1++;
        }
        while(p2<m){
            list.add(l2.get(p2));
            p2++;
        }
//        System.out.println("Sorted List "+list);
        return list;
    }

}
