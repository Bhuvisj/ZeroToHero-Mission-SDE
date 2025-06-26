package LearningJava.DSA.Recursion.Problems;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;

public class RC2_BasicProblemsII {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        helper(arr, 0);
        System.out.println(isPalindrome("1221", 0));
        System.out.println(fibonacci(5));
    }
    // Q1 :- Reverse an Array - type 1
    static void reverseArray(int[] arr, int i, int j){
        if (i >= j) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        swap(arr, i, j);
        reverseArray(arr, i+1, j-1);
    }
    // type 2 - we can do in one variable also
    static void helper(int[] arr, int i){
        if (i >= arr.length / 2){
            System.out.println(Arrays.toString(arr));
            return;
        }
        swap(arr, i, arr.length-1-i);
        helper(arr, i+1);
    }

    // Q2 :- check if string is palindrome or not - type 1 : My Approach
    static boolean isPalindrome(String s, int i){
        if (i >= s.length() / 2){
            return true;
        }
        return s.charAt(i) == s.charAt(s.length()-1-i) && isPalindrome(s, i+1);
    }

    // Q3 :- Fibonacci number
    static int fibonacci(int n){
        if (n <= 1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }




    // Q1 :- helper()
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
