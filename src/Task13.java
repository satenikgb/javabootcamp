import java.util.Random;
/* generate and print random integer number between 0-15(bound) */

public class Task13 {
    public static void main(String[] args) {
        Random random=new Random();
        int r= random.nextInt(16)+0;
        System.out.println(r);
    }
}
