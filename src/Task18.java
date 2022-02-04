import java.util.Scanner;
/*Given an integer 3digit number, determine and print the sum of all 3 digits.Input number from console*/

public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = n / 100 + (n % 100) / 10 + n % 10;
        System.out.println(sum);
    }
}
