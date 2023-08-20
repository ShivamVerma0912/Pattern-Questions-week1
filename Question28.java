import java.util.Scanner;

public class Question28 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
    public static void print(int n){
        for (int i = 1; i <= n; i++) {
            // Print spaces before numbers
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Print increasing numbers
            for (int j = i; j <= 2 * i - 1; j++) {
                System.out.print(j + " ");
            }

            // Print decreasing numbers
            for (int j = 2 * i - 2; j >= i; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
