import java.util.*;

public class inputInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String name = sc.next(); // only one word
        String name = sc.nextLine(); // entire line
        // nextInt(), nextFloat(), nextDouble, nextBoolean
        sc.close();
        System.out.println("Your name is " + name);
    }
}
