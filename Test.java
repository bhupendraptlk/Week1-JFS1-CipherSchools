//Bhupendra Patel
import java.util.*;
public class Test {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter any number");
            int num = scan.nextInt();
            if(num>0) {
                System.out.println("+ve");
            }
            else if(num==0) {
                System.out.println("Neurtal");
            }
            else {
                System.out.println("-ve");
            }
        }
    }
}