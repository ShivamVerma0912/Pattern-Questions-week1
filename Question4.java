import java.util.Scanner;

public class Question4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }

    public static void print(int n){
        for (int i = n; i >= 1; i--) {

            // inner loop to print spaces.
            for (int j = 1; j < i; j++) {
                System.out.print("   ");
            }

            // inner loop to print stars.
            for (int j = 0; j <= n - i; j++) {
                System.out.print("*  ");
            }

            // printing new line for each row
            System.out.println();
        }
    }
}
