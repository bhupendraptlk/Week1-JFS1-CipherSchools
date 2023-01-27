//Bhupendra Patel
import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            Random rnd = new Random();
            int choice = rnd.nextInt(20);
            System.out.println("Computer Choice :" + choice);
            for (int i = 0; i < 6; i++) {
                System.out.println("Guess a number <20");
                int user = scan.nextInt();

                if (user < choice) {
                    System.out.println("low");
                } else if (user > choice) {
                    System.out.println("high");
                } else {
                    System.out.println("Right");
                    break;
                }
            }
        }
    }
}
