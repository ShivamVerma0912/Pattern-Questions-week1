import java.util.Scanner;

public class Question19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }

    public static void print(int n){
        int i, j;

        // This is upper half of pattern
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= (2 * n); j++) {

                // Left part of pattern
                if (i > (n - j + 1))
                    System.out.print("\t");
                else
                    System.out.print("*\t");

                // Right part of pattern
                if ((i + n) > j)
                    System.out.print("\t");
                else
                    System.out.print("*\t");
            }

            System.out.println();
        }

        // This is lower half of pattern
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= (2 * n); j++) {

                // Right Part of pattern
                if (i < j)
                    System.out.print("\t");
                else
                    System.out.print("*\t");

                // Left Part of pattern
                if (i <= ((2 * n) - j))
                    System.out.print("\t");
                else
                    System.out.print("*\t");
            }

            System.out.println();
        }
    }
}
