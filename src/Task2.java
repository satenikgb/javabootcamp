import java.util.Scanner;
/*Write a Java program to convert minutes into a number of hours and minutes.Input minutes from console*/
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int min= scanner.nextInt();
        int hours=min/60;
        int minute=min%60;
        System.out.println(hours);
        System.out.println(minute);


    }
}
