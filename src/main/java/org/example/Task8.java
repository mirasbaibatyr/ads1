package org.example;

import java.util.Scanner;
public class Task8 {
    public static boolean cd(String s) {
        if (s.isEmpty()) {
            return true;
        }
        char firstChar = s.charAt(0);
        if (!Character.isDigit(firstChar)) {
            return false;
        }
        return cd(s.substring(1));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        if (cd(input)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scan.close();
    }
}