import java.util.Scanner;

public class Question16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }

    public static void print(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("\t");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("\t");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }

    }
}
