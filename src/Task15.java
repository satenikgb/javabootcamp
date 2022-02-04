import java.util.Scanner;
/*Write java program to determines if the given number is odd, print result(use == operator, use boolean primitive type*/

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(a % 2 == 1);

    }
}
