import java.util.Scanner;

public class Question10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }

    public static void print(int n){
        for (int i = n; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(" *");
            }

            System.out.println();
        }
    }
}
