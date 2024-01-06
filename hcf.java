import java.util.Scanner;

public class hcf {

    public static int getHCF(int num1, int num2) {
        // int ans = 1;
        // int factor = 2;
        // while (num1 != 1 && num2 != 1 && num1 >= factor && num2 >= factor) {
        // if (num1 % factor == 0 && num2 % factor == 0) {
        // num1 /= factor;
        // num2 /= factor;
        // ans *= factor;
        // } else
        // factor++;
        // }
        // return ans;
        int result = Math.min(num1, num2);
        while (result > 0) {
            if (num1 % result == 0 && num2 % result == 0)
                return result;
            result--;
        }
        return result;
    }

    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        sc.close();
        int gcd = getHCF(num1, num2);
        System.out.println(gcd);
    }
}
