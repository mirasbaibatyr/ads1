package org.example;

import java.util.Scanner;
public class task9 {
    public static int cc(String s) {
        if (s.isEmpty()) {
            return 0;
        } else {
            return 1 + cc(s.substring(1));
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int totalLength = cc(input);
        System.out.println(totalLength);

        scanner.close();
    }
}
