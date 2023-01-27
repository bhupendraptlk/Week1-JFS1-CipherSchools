//Bhupendra Patel
import java.util.Scanner;

public class Ticket{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter speed");
        int speed = scan.nextInt();
        System.out.println("Today is your birthday");
        boolean isBirthDay = scan.nextBoolean();
        if(isBirthDay==true) {
            speed = speed - 5;
        }
        if(speed > 80) {
            System.out.println("High ticket");
        }
        else if(speed >= 60 && speed <= 80) {
            System.out.println("Mid ticket");
        }
        else{
            System.out.println("No ticket");
        }
    }
}
