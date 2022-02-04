import java.util.Random;
/*Generate and print random integer number between 15 to 30 */

public class Task14 {
    public static void main(String[] args) {
        Random random=new Random();
        int r= random.nextInt(16)+15;
        System.out.println(r);
    }
}
