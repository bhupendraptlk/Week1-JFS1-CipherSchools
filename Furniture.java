//Bhupendra Patel
public class Furniture{
    int width;
    int height;

    void display(String item) {
        System.err.println(item+" width "+width+" height "+height);
    }
    public static void main(String[] args) {
        Chair chairOb = new Chair();
        chairOb.foo();
    }

}
class Chair extends Furniture {
    void foo() {
        width=19;
        height=54;
        display("chair");
    }
}
class Table extends Furniture {
    void foo() {
        width=89;
        height=94;
        display("Table");
    }
}
class Almirah extends Furniture{
    void foo() {
        width=18;
        height=94;
        display("Almirah");
    }

}
//memory = n*8 bytes n is count of classes
//memory optimization
//code resuability
//faster dev