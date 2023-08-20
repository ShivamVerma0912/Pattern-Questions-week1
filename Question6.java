import java.util.Scanner;

public class Question6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }

    public static void print(int n){
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= (i-1) * 2; j++) {
                System.out.print("  ");
            }

            // Print asterisks
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
