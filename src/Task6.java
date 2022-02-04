import java.util.Scanner;
/*Write a program to calculate area of the right-angled triangle,sqare,recangle*/
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int legtr1=scanner.nextInt();
        int legtr2= scanner.nextInt();
        int areatr=legtr1*legtr2/2;
        System.out.println("area of right angled triangle"+ " "+ areatr);
        int legsq= scanner.nextInt();
        int areasq=legsq*legsq;
        System.out.println("area of square"+" " +areasq);
        int legrec1=scanner.nextInt();
        int legrec2= scanner.nextInt();
        int arearec=legrec1*legrec2;
        System.out.println("area of rectangle"+" "+arearec);

    }
}
