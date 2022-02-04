import java.util.Scanner;
/*Input from console 3 arguments and then prints the sum, the average*/

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arg1 = scanner.nextInt();
        int arg2 = scanner.nextInt();
        int arg3 = scanner.nextInt();
        int sum = arg1 + arg2 + arg3;
        double average = sum / 3;
        System.out.println(sum);
        System.out.println(average);
    }
}
