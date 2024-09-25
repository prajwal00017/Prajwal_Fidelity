public class EmployeePayrollManagement {
    public static void main(String[] args) {
        System.out.println("Initialization 1 (Permanent Employee): ");
        PermanentEmp permanentemp = new PermanentEmp(101,"Esther",25000,1500);
        permanentemp.displayDetails();
        System.out.println();
        System.out.println("Initialization 2 (Temporary Employee): ");
        TempEmp emp2 = new TempEmp(102,"Ganesh",1500,20);
        emp2.displayDetails();

    }
}
