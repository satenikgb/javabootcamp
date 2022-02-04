import java.util.Scanner;
/* given int numbers, input a and b from console, determine and print reminder from a to b*/

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int reminder=a%b;
        System.out.println(reminder);
    }
}
