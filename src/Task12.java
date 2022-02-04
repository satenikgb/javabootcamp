import java.util.Random;

/* generate and print random integer number*/
public class Task12 {
    public static void main(String[] args) {
        Random random = new Random();
        int r = random.nextInt();

        System.out.println(r);
    }
}
