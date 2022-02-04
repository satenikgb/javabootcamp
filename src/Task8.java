import java.util.Scanner;


public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int sn;
        int i=0;
        while(i<=n){
            sn=3*i*i-12*i;
            sum=sum+sn;
            i++;
        }
        System.out.println(sum);
    }
}
