import java.util.Scanner;
/* Write a Java program that takes two numbers as input from the console and display the product of two numbrers*/

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num1= scanner.nextInt();
        int num2= scanner.nextInt();
        int displayproduct=num1*num2;
        System.out.println(displayproduct);
    }
}
