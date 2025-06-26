package LearningJava.DSA.Recursion.Problems;

import java.util.*;

public class RC8_SubsetSumI {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2};

        ArrayList<Integer> ans = new ArrayList<>();
        subset(0, 0, arr, ans);
        Collections.sort(ans);
        System.out.println(ans);

        System.out.println(isSubsetSum(0, 0, new int[]{3, 34, 4, 12, 5, 2}, 30));

    }
    static void subset(int index, int sum, int[] arr, ArrayList<Integer> ans){
        if (index == arr.length){
            ans.add(sum);
            return;
        }

        sum += arr[index];
        subset(index + 1, sum, arr, ans);

        sum -= arr[index];
        subset(index + 1, sum, arr, ans);
    }
    static boolean isSubsetSum(int index, int total, int[] arr, int sum){
        if (index == arr.length){
            return total == sum;
        }

        total += arr[index];
        if (isSubsetSum(index + 1, total, arr, sum)){
            return true;
        }

        total -= arr[index];
        if (isSubsetSum(index + 1, total, arr, sum)){
            return true;
        }

        return false;
    }
}
