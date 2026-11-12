
import java.util.Scanner;

public class FibonacciIterative {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        long a = 0, b = 1;
        int stepCount = 0;

        System.out.print("Fibonacci Series: ");

        for (int i = 0; i < n; i++) {

            System.out.print(a + " ");

            long c = a + b;

            stepCount++;

            a = b;
            b = c;
        }

        System.out.println("\nStep Count: " + stepCount);

        sc.close();
    }
}
