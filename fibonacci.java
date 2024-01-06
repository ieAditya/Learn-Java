import java.util.Scanner;

public class fibonacci {

    public static void printFibonacci(int prev, int curr, int till) {
        int nextNum = prev + curr;
        if (nextNum > till)
            return;
        System.out.print(nextNum + " ");
        printFibonacci(curr, nextNum, till);

    }

    public static void printFibIterative(int till) {
        int prev1 = 0, prev2 = 1;
        while (prev1 + prev2 <= till) {
            int curr = prev1 + prev2;
            System.out.print(curr + " ");
            prev1 = prev2;
            prev2 = curr;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        // System.out.print("0 1 ");
        // printFibonacci(0, 1, n);
        printFibIterative(n);
    }

}
