import java.util.Scanner;
/*find the sum of the first 4 consecutive odd numbers, the first 4 consecutive even numbers*/
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int sumodd=1+3+5+7;
        int sumeven=0+2+4+6;
        System.out.println(sumodd);
        System.out.println(sumeven);
    }
}
