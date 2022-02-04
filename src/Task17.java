import java.util.Scanner;
/*Given an integer 3digit number, determine and print the first digit, input number from console*/
public class Task17 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int a=n/100;
        System.out.println(a);
    }
}
