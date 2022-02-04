import java.util.Scanner;
/*In program we have byte b, short c, int a variables , print result of these action -print average of them,
- print product of them
 */

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        byte b= scanner.nextByte();
        short c= scanner.nextShort();
        int a= scanner.nextInt();
        int l=a*b*c;
        float f=(a+b+c)/3;
        System.out.println(l);
        System.out.println(f);
    }
}
