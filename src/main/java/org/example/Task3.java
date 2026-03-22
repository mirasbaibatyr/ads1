package org.example;

import java.util.Scanner;

public class Task3 {
    public static boolean p(int n, int divisor) {
        if (n < 2) {
            return false;
        }
        if (divisor == n) {
            return true;
        }
        if (n % divisor == 0) {
            return false;
        }
        return p(n, divisor + 1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        boolean result = p(input, 2);
        if (result == true) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }
        scan.close();
    }
}