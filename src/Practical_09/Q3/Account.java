package Practical_09.Q3;

public class Account {
    private int accNumber;
    private String customerName;
    private String accType;
    private double accBalance;

    public Account(int accNumber, String customerName, String accType, double accBalance) {
        this.accNumber = accNumber;
        this.customerName = customerName;
        this.accType = accType;
        this.accBalance = accBalance;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public double getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }

    public double getInterestRate(){
        if (getAccBalance() < 250000){
            return getAccBalance() * 0.025;
        } else if (getAccBalance() <= 500000) {
            return getAccBalance() * 0.05;
        } else if (getAccBalance() <= 750000) {
            return getAccBalance() * 0.075;
        } else if (getAccBalance() <= 1000000) {
            return getAccBalance() * 0.08;
        } else if (getAccBalance() <= 1500000) {
            return getAccBalance() * 0.09;
        }
        return getAccBalance() * 0.095;
    }

    public double getTotalBalance(){
        return getAccBalance() + getInterestRate();
    }



    @Override
    public String toString() {
        return String.format("%-4d | %-20s | %-10s | %10.2f | %10.2f",
                accNumber,customerName,accType,accBalance,getTotalBalance());
    }
}
