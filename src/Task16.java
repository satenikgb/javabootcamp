import java.util.Scanner;
/*Given an integer 3-digit number, deremine and print the second digit,input number from console*/
public class Task16 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        int b=(a%100)/10;

        System.out.println(b);
    }
}
