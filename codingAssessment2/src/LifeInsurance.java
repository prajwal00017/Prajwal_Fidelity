class LifeInsurance extends Insurance {
    private int policyTerm;
    private Float benefitPercent;

    public int getPolicyTerm() {
        return policyTerm;
    }

    public void setPolicyTerm(int policyTerm) {
        this.policyTerm = policyTerm;
    }

    public Float getBenefitPercent() {
        return benefitPercent;
    }

    public void setBenefitPercent(Float benefitPercent) {
        this.benefitPercent = benefitPercent;
    }

    public double calculatePremium() {
        return (getAmountCovered() - ((getAmountCovered() * benefitPercent) / 100)) / policyTerm;
    }
}