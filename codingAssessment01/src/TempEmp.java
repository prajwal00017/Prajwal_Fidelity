public class TempEmp extends Employee{
    private int dailyWages;
    private int noOfDays;

    public TempEmp(int id, String name, int dailyWages,int noOfDays){
        super(id,name,dailyWages*noOfDays);
        this.dailyWages=dailyWages;
        this.noOfDays=noOfDays;
        calculateBonus();
        calculateNetSalary();
    }
    private void calculateBonus(){
        if(dailyWages<1000){
            bonus=0.15f*getNetSalary();
        } else if (dailyWages>=1000 && dailyWages<1500){
            bonus=0.12f*getNetSalary();
        } else if (dailyWages>=1500 && dailyWages<1750){
            bonus=0.11f*getNetSalary();
        } else {
            bonus=0.08f*getNetSalary();
        }
    }
    @Override
    public void calculateNetSalary(){
        this.netSalary=getBasicSalary()+bonus;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Daily Wages: "+dailyWages);
        System.out.println("No. of Days Worked: "+noOfDays);
    }
}