public class Employee {
    private int id;
    private String name;
    private float basicSalary;
    protected float bonus;
    protected float netSalary;


    public Employee(int id, String name, float basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public void calculateNetSalary() {
        this.netSalary = this.basicSalary + this.bonus;

    }

    public void displayDetails() {
        System.out.println("Employee Id: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Net Salary: " + netSalary);

    }
    public float getNetSalary(){
        return netSalary;

    }
    public float getBasicSalary(){
        return basicSalary;
    }
}






