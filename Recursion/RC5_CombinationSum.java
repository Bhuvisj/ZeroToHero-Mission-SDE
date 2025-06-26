package LearningJava.DSA.Recursion.Problems;

import java.util.*;

public class RC5_CombinationSum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 7};
        List<List<Integer>> ans = new ArrayList<>();
        combinator(0, 7, new ArrayList<>(), arr, ans);
//        combinator2(0, 7, ans, new ArrayList<>(), arr);
        System.out.println(ans);
    }
    static void combinator(int index, int sum, ArrayList<Integer> list, int[] arr, List<List<Integer>> ans){
        if (index == arr.length || sum < 0){
            if (sum == 0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        sum -= arr[index];
        list.add(arr[index]);
        combinator(index, sum, list, arr, ans);

        sum += arr[index];
        list.removeLast();
        combinator(index + 1, sum, list, arr, ans);
    }
    static void combinator2(int index, int sum, List<List<Integer>> ans, List<Integer> list, int[] arr){
        // base condition
        if (index == arr.length || sum < 0){
            if (sum == 0){
                ans.add(new ArrayList(list));
            }
            return;
        }

        if (arr[index] <= sum){
            list.add(arr[index]);
            combinator2(index, sum - arr[index], ans, list, arr);
            list.removeLast();
        }
        combinator2(index + 1, sum, ans, list, arr);
    }
}
