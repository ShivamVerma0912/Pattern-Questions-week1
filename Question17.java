import java.util.Scanner;

public class Question17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }

    public static void print(int n){
        // Upper part of the pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*\t");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }

        // Lower part of the pattern
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*\t");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }

    }
}
