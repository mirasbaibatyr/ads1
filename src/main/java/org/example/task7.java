package org.example;

import java.util.Scanner;

public class task7 {
    public static void rp(Scanner scanner, int count) {
        if (count == 0) {
            return;
        }
        int currentNumber = scanner.nextInt();
        rp(scanner, count - 1);
        System.out.print(currentNumber + " ");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        rp(scanner, n);
        System.out.println();
        scanner.close();
    }
}
