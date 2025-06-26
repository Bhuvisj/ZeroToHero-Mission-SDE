package LearningJava.DSA.Recursion.Problems;
import java.util.*;
public class RC11_Permutations {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
//        boolean[] map = new boolean[arr.length];
//        List<List<Integer>> ans = new ArrayList<>();
//        permute(ans, new ArrayList<>(), map, arr);
//        System.out.println(ans);
        List<List<Integer>> ans = new ArrayList<>();
        optimalPermute(0, ans, new ArrayList<>(), arr);
        System.out.println(ans);

    }
    // brute : Tc - O(n! * n) | Sc - O(n)
    static void optimalPermute(int index, List<List<Integer>> ans, List<Integer> list, int[] arr){
        if (index == arr.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i = index; i < arr.length; i++){
            swap(i, index, arr);
            list.add(arr[index]);
            optimalPermute(index + 1, ans, list, arr);
            list.removeLast();
            swap(i, index, arr);
        }
    }
    static void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // brute : Tc - O(n! * n) | Sc - O(n) + O(n)
    static void permute(List<List<Integer>> ans, List<Integer> list, boolean[] map, int[] arr){
        if (list.size() == arr.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < map.length; i++){
            if (!map[i]) {
                list.add(arr[i]);
                map[i] = true;
                permute(ans, list, map, arr);
                list.removeLast();
                map[i] = false;
            }
        }
    }
}
