package lt.baltictalents.p31.demo1_ChainOfResponsibility;

public class PurchaseRequest {

    private double amount;

    private String purpose;

    public PurchaseRequest(double amount, String purpose) {
        this.amount = amount;
        this.purpose = purpose;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount)  {
        this.amount = amount;
    }

    public String getPurpose() {
        return this.purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
}
