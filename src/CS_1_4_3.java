import java.util.Scanner;

public class CS_1_4_3 {

        static Scanner scanner;
        public static void permutation(int n) {
            if (n == 1) {
                System.out.println("1");
            } else if (n <= 3) {
                System.out.println("НЕТ РЕШЕНИЯ");
            } else {
                for (int i = 2; i <= n; i += 2) {
                    System.out.print(i + " ");
                }
                for (int i = 1; i <= n; i += 2) {
                    System.out.print(i + " ");
                }
            }
        }
        public static void main(String[] args) {
            scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            permutation(n);
        }
}
