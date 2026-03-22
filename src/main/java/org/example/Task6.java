package org.example;

import java.util.Scanner;
public class Task6 {
    public static int p(int a, int n) {
        if (n == 0) {
            return 1;
        } else {
            return a * p(a, n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int n = scan.nextInt();
        int result = p(a, n);
        System.out.println(result);
        scan.close();
    }
}