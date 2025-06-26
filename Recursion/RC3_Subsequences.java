package LearningJava.DSA.Recursion.Problems;

import java.util.ArrayList;

public class RC3_Subsequences {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2};
        subber(0, new ArrayList<>(), arr);

    }
    static void subber(int index, ArrayList<Integer> list, int[] arr){
        if (index == arr.length){
            System.out.println(list);
            return;
        }
        list.add(arr[index]);
        subber(index+1, list, arr);
        list.removeLast();
        subber(index + 1, list, arr);
    }
}
