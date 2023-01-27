// dynamic polymorphism overriding
//Bhupendra Patel
import java.util.Scanner;
abstract class Doctor {
    abstract void treatPatient();
}

class Physician extends Doctor {

    @Override
    void treatPatient() {
        System.out.println("I am Physician");
    }
}

class Surgeon extends Doctor {
    @Override
    void treatPatient() {
        System.out.println("I am surgeon");
    }
}
public class Program{
    public static void main(String[] args) {
        System.out.println("Hi");
        System.out.println("Choose 1 for Physician 2 for surgeon");
        int choice = new Scanner(System.in).nextInt();
        Doctor doc;

        switch (choice) {
            case 1:
                doc = new Physician();
                break;
            case 2:
                doc = new Surgeon();
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}