import java.util.Scanner;

public class Question20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }

    public static void print(int n){
        // Upper part of the hollow diamond
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            System.out.print("* ");
            for (int j = 1; j <= 2 * i - 3; j++) {
                System.out.print("  ");
            }
            if (i > 1) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower part of the hollow diamond
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            System.out.print("* ");
            for (int j = 1; j <= 2 * i - 3; j++) {
                System.out.print("  ");
            }
            if (i > 1) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
