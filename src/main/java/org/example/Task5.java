package org.example;
import java.util.Scanner;
public class Task5 {
    public static int fi(int n) {
        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        else {
            return fi(n - 1) + fi(n - 2);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int result = fi(input);
        System.out.println(result);
        scanner.close();
    }
}
