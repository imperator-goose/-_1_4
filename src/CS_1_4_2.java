import java.util.Scanner;

public class CS_1_4_2 {
    static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        for (int k = 1; k <= n; k++) {
            long result = calculate(k);
            System.out.print(result + " ");
        }
    }
    public static long calculate(int k) {
        if (k == 1) {
        return 0;
        } else {
        return  k * k * ((long) k * k - 1) / 2 - 4L * (k - 1) * (k - 2);
        }
    }
}
