package LearningJava.DSA.Recursion.Problems;

import java.util.*;

public class RC9_SubsetSumII {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        subsets(0, ans, new ArrayList<>(), arr);
        System.out.println(ans);
    }
    static void subsets(int index, List<List<Integer>> ans, List<Integer> list, int[] arr){
        ans.add(new ArrayList<>(list));
        for (int i = index; i < arr.length; i++){
            if (i > index && arr[i] == arr[i-1]) continue;
            list.add(arr[i]);
            subsets(i+1, ans, list, arr);
            list.removeLast();
        }
    }
}
