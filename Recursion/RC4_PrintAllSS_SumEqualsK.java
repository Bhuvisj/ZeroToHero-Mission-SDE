package LearningJava.DSA.Recursion.Problems;

import java.util.ArrayList;

public class RC4_PrintAllSS_SumEqualsK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        subSeq(0, new ArrayList<>(), arr, 0, 3);
        System.out.println(countSubsequence(arr, 0, 0, 3));
    }

    // print all subsequence whose sum equals k
    static void subSeq(int index, ArrayList<Integer> list, int[] arr, int sum, int k){
        if (index == arr.length){
            if (sum == k){
                System.out.println(list);
            }
            return;
        }
        list.add(arr[index]);
        sum += arr[index];
        subSeq(index + 1, list, arr, sum, k);

        list.removeLast();
        sum -= arr[index];
        subSeq(index + 1, list, arr, sum, k);
    }

    // print any one subsequence whose sum equals k
    static boolean subSeq2(int index, ArrayList<Integer> list, int[] arr, int sum, int k){
        if (index == arr.length){
            if (sum == k){
                System.out.println(list);
                return true;
            }
            return false;
        }

        list.add(arr[index]);
        sum += arr[index];
        if (subSeq2(index + 1, list, arr, sum, k)){
            return true;
        }

        list.removeLast();
        sum -= arr[index];
        if (subSeq2(index + 1, list, arr, sum, k)) return true;
        return false;
    }

    // count all subsequences
    static int countSubsequence(int[] arr, int index, int sum, int k){
        if (index == arr.length){
            if (sum == k){
                return 1;
            }
            return 0;
        }
        sum += arr[index];
        int left = countSubsequence(arr, index + 1, sum, k);

        sum -= arr[index];
        int right =  countSubsequence(arr, index + 1, sum, k);

        return left + right;
    }
}
