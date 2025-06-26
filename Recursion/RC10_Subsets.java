package LearningJava.DSA.Recursion.Problems;

import java.util.ArrayList;
import java.util.List;

public class RC10_Subsets {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> ans = new ArrayList<>();
        subsets(0, arr, ans, new ArrayList<>());
        System.out.println(ans);

    }
    static void subsets(int index, int[] arr, List<List<Integer>> ans, List<Integer> list){
        if (index == arr.length){
            ans.add(new ArrayList<>(list));
            return;
        }

        list.add(arr[index]);
        subsets(index + 1, arr, ans, list);

        list.removeLast();
        subsets(index + 1, arr, ans, list);
    }
}
