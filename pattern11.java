import java.util.*;

public class pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i <= n; i++) {
            // n-i spaces
            for (int r = 0; r < n - i; r++) {
                System.out.print(" ");
            }
            // n *'s
            for (int r = 0; r < n; r++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
