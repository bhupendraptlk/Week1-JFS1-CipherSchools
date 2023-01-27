//Bhupendra Patel
public class EmployeeTwo {
    // constructor same name as class not return type
    // it creates/initialise objects in ram
    //you can use contructor block to initialiaze some default values

    int id;
    String dept;

    public EmployeeTwo(int id, String dept) {
        this.id = id;
        this.dept = dept;
    }

    public static void main(String[] args) {
        EmployeeTwo emp = new EmployeeTwo(8,"hehe");
        System.out.println(emp.dept);
    }
}
