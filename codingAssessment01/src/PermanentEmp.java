public class PermanentEmp extends Employee  {

    private int pf;

    public PermanentEmp(int id, String name, float basicSalary,int pf){
        super(id,name,basicSalary);
        this.pf=pf;
        calculateBonus();
        calculateNetSalary();
    }


    private void calculateBonus(){
        if(pf<1000){
            bonus = 0.1f * getBasicSalary();
        } else if (pf>=1000 && pf<1500){
            bonus = 0.115f * getBasicSalary();
        } else if (pf>=1500 && pf<1800){
            bonus = 0.12f * getBasicSalary();
        } else {
            bonus = 0.15f * getBasicSalary();
        }
    }

    @Override
    public void calculateNetSalary(){
        this.netSalary=getBasicSalary()-pf+bonus;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("PF: "+pf);
    }
}

