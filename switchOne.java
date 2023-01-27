//Bhupendra Patel
import java.util.Scanner;

public class switchOne{
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter your division");
            int div = scan.nextInt();
            switch(div) {
                case 1:
                    System.out.println("1st");
                    break;
                case 2:
                    System.out.println("2nd");
                    break;
                case 3:
                    System.out.println("3rd");
                default:
                    System.out.println("No Rank");
            }
        }
    }
}
