package org.example;
import java.util.Scanner;
public class Task1 {

    public static void dj(int number) {
        if (number < 10) {
            System.out.println(number);
        } else {
            dj(number / 10);
            System.out.println(number % 10);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        dj(n);
    }
}
