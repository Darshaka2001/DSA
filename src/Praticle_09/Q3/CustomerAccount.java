package Praticle_09.Q3;

public class CustomerAccount {
    int accountNumber;
    String customerName;
    String accountType;
    double accountBalance;

    public CustomerAccount(int accountNumber, String customerName, String accountType, double accountBalance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    public double getInterestRate() {
        if (accountBalance < 250000) {
            return 0.025; // 2.5%
        } else if (accountBalance <= 500000) {
            return 0.050; // 5.0%
        } else if (accountBalance <= 750000) {
            return 0.075; // 7.5%
        } else if (accountBalance <= 1000000) {
            return 0.080; // 8.0%
        } else if (accountBalance <= 1500000) {
            return 0.095; // 9.5%
        }
        return 0.095; // Assuming the highest rate for balances over 1.5M
    }

    public double getInterestAmount() {
        return this.accountBalance * getInterestRate();
    }

    public double getTotalBalance() {
        return this.accountBalance + getInterestAmount();
    }

    public String getAccountType() {
        return this.accountType;
    }

    @Override
    public String toString() {
        return String.format("AccNo: %-5d | Name: %-20s | Type: %-8s | Balance: Rs. %-12.2f | Interest: Rs. %-12.2f | Total Balance: Rs. %-12.2f",
                accountNumber, customerName, accountType, accountBalance, getInterestAmount(), getTotalBalance());
    }
}
