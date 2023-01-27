//Bhupendra Patel
import java.util.Scanner;

public class Burp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How long is your burp");
        int length = scan.nextInt();
        String msg="";
        for(int i=1;i<=length;i++) {
            msg = msg+"r";
        }
        System.out.println("Bu"+msg+"p");
        scan.close();
    }
}
