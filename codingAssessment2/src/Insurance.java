import java.util.Scanner;
class Insurance {
    private String insuranceNo;
    private String insuranceName;
    private Double amountCovered;

    public String getInsuranceNo() {
        return insuranceNo;
    }

    public void setInsuranceNo(String insuranceNo) {
        this.insuranceNo = insuranceNo;
    }

    public String getInsuranceName() {
        return insuranceName;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public Double getAmountCovered() {
        return amountCovered;
    }

    public void setAmountCovered(Double amountCovered) {
        this.amountCovered = amountCovered;
    }
}
