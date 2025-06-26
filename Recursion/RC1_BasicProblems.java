package LearningJava.DSA.Recursion.Problems;

public class RC1_BasicProblems {
    public static void main(String[] args) {
//        printNameNTimes(5, 1, "Bhuvi");
//        print1toN(1, 10);
//        printNto1(4);
//        printBTNto1(1,5);
//        System.out.println(sumFirstN(0, 5, 0));
//        System.out.println(sumFirstNII(3, 0));
//        System.out.println(sumFirstN_func2(3, 0));
//        System.out.println(sumFirstN_func3(3));

        System.out.println(factorial(5));
    }

    static void printNameNTimes(int n, int i, String name){
        if (i > n) return;
        System.out.println(i + ". " +name);
        printNameNTimes(n, i+1, name);
    }

    static void print1toN(int i, int n){
        if (i > n) return;
        System.out.println(i);
        print1toN(i+1, n);
    }

    static void printNto1(int n){
        if (n == 0) return;
        System.out.println(n);
        printNto1(n-1);
    }

    // Backtracking
    // 1. print linearly 1 to N (by Backtracking)
    static void printBT1toN(int n){
        if (n == 0) return;
        printBT1toN(n-1);
        System.out.println(n);
    }
    // 2. print linearly N to 1 (by Backtracking)
    static void printBTNto1(int i, int n){
        if (i > n) return;
        printBTNto1(i+1, n);
        System.out.println(i);
    }


    /// Sum of First N numbers
    // 1. Parameterised way
    static void sumOfFirstN_param(int n, int sum){
        if (n < 1){
            System.out.println(sum);
            return;
        }
        sumOfFirstN_param(n-1, sum + n);
    }
    // 2. Functional way : variation / type - 1
    static int sumFirstN_func1(int i, int n, int sum){
        if (i > n) return sum;
        return sumFirstN_func1(i+1, n, sum+i);
    }
    // 2.2. variation / type - 2
    static int sumFirstN_func2(int n, int sum){
        if (n < 0) return sum;
        return sumFirstN_func2(n-1, sum + n);
    }
    // 2.3. variation / type - 3 : Tuf
    static int sumFirstN_func3(int n){
        if (n == 0) return 0;
        return n + sumFirstN_func3(n-1);
    }

    static int factorial(int n){
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
}
