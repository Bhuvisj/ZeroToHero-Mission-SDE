package LearningJava.DSA.Recursion.Problems;

import java.util.ArrayList;
import java.util.List;

public class RC7_Combinations {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
//        List<List<Integer>> ans = new ArrayList<>();
//        recursion(0, 2, ans, new ArrayList<>(), arr, 2);
//        System.out.println(ans);

        List<List<Integer>> ans2 = new ArrayList<>();
        another(1, 4, 2, 2, ans2, new ArrayList<>());
        System.out.println(ans2);
    }
    static void recursion(int index, int sum, List<List<Integer>> ans, List<Integer> list, int[] arr, int k){
        if (list.size() == k && sum == 0){
            ans.add(new ArrayList<>(list));
            return;
        }
        if (index == arr.length){
            if (list.size() == k && sum == 0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        list.add(arr[index]);
        recursion(index + 1, sum - 1, ans, list, arr, k);
        list.removeLast();
        recursion(index + 1, sum, ans, list, arr, k);
    }

    static void another(int index, int n, int moves, int k, List<List<Integer>> ans, List<Integer> list){
        if (list.size() == k && moves == 0){
            ans.add(new ArrayList<>(list));
            return;
        }
        if (n < index){
            if (list.size() == k && moves == 0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }

        list.add(index);
        another(index + 1, n, moves - 1, k, ans, list);

        list.removeLast();
        another(index + 1, n, moves, k, ans, list);
    }
}
