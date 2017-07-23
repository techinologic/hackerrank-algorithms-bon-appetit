import java.util.Scanner;

public class Solution {

    static int bonAppetit(int n, int k, int b, int[] ar) {
        // Complete this function
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i != k) {
                sum += ar[i];
            }
        }

        if ((sum / 2) == b) {
            System.out.println("Bon Appetit");
            System.exit(0);
        }
        return b - (sum / 2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int b = in.nextInt();
        int result = bonAppetit(n, k, b, ar);
        System.out.println(result);
    }
}
