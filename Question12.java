import java.util.Scanner;

public class Question12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }

    public static void print(int n){
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                if(j%2 == 0){
                    System.out.print("  ");
                }
                else{
                    System.out.print(" *");
                }

            }

            System.out.println();
        }
    }
}
