//Bhupendra Patel
public class Encapsulation{
    public static void main(String[] args) {
        Amazon customer = new Amazon();
        float payableamt = customer.transaction(1000);
        System.out.println(payableamt);
    }
}

class Amazon {
    float transaction(float amt) {
        Gpay gPayObj = new Gpay();
        // gpayobj.charge=0;
        gPayObj.changeTX(0.99f);
        float totlamt = amt*(amt*gPayObj.getTX());
        return totlamt;
    }
}

class Gpay {
    private float charge = 0.05f;

    public void changeTX(float ch) {
        if(ch<=5) {
            System.out.println("Invalid charge");
            return;
        }
        charge = ch;
    }

    public float getTX() {
        return charge;
    }
}