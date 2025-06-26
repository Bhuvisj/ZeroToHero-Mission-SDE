package LearningJava.DSA.Recursion.Problems;

import java.util.*;

public class RC6_CombinationSumII {
    public static void main(String[] args) {
        List<List<Integer>> ans = new ArrayList<>();
        int[] arr = {1, 1, 1, 2, 2};
        Arrays.sort(arr);
        combiner(0, 4, ans, new ArrayList<>(), arr);
        System.out.println(ans);
    }

    static void combiner(int index, int sum, List<List<Integer>> ans, List<Integer> list, int[] arr){
        if (sum == 0){
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = index; i < arr.length; i++){
            if (arr[i] > sum) break;
            if (i > index && arr[i] == arr[i-1]) continue;

            list.add(arr[i]);
            combiner(i + 1, sum - arr[i], ans, list, arr);
            list.removeLast();
        }
    }
}
