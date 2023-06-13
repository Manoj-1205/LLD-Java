package ParallelMergeSort;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    //1 2 3 4 5 6 7 8 9 10
    public void mergeSort(List<Integer> list){
        if(list.size() <= 1 ) return;
        int mid = list.size()/2;
        List<Integer> list1 = list.subList(0, mid);
        List<Integer> list2 = list.subList(mid, list.size());

        mergeSort(list1);
        mergeSort(list2);

//        System.out.println(list1);
//        System.out.println(list2);

        merge(list1, list2, list);


    }

    public void merge(List<Integer> l1, List<Integer> l2, List<Integer> finalList){
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
    }

}
