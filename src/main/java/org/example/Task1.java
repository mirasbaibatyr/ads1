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
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dj(n);
    }
}
