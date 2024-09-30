class MotorInsurance extends Insurance {
    private Double idv;
    private Float depPercent;

    public Double getIdv() {
        return idv;
    }

    public void setIdv(Double idv) {
        this.idv = idv;
    }

    public Float getDepPercent() {
        return depPercent;
    }

    public void setDepPercent(Float depPercent) {
        this.depPercent = depPercent;
    }

    public double calculatePremium() {
        idv = getAmountCovered() - ((getAmountCovered() * depPercent) / 100);
        return idv * 0.03;
    }
}
