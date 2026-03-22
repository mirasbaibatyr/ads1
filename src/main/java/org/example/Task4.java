package org.example;
import java.util.Scanner;
public class Task4 {
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int result = factorial(input);
        System.out.println(result);
        scan.close();
    }
}