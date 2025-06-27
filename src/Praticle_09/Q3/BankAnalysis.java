package Praticle_09.Q3;

public class BankAnalysis {

    public static void main(String[] args) {

        // a. Input customer details into a contiguous list data structure.
        CustomerList customerList = new CustomerList();
        customerList.add(new CustomerAccount(1001, "Kamal Dissanayake", "savings", 500000));
        customerList.add(new CustomerAccount(1002, "Namal Perera", "current", 975000));
        customerList.add(new CustomerAccount(1003, "Sithumm Udovita", "current", 100000));
        customerList.add(new CustomerAccount(1004, "Manel Dias", "savings", 1250000));
        customerList.add(new CustomerAccount(1005, "Chethiya Munasinghe", "savings", 950000));
        customerList.add(new CustomerAccount(1006, "Sanju Perera", "current", 1500000));
        customerList.add(new CustomerAccount(1007, "Lahiru Karunarathna", "savings", 600000));
        customerList.add(new CustomerAccount(1008, "Tharanga Prasad", "savings", 400000));
        customerList.add(new CustomerAccount(1009, "Shashi Dayarathna", "savings", 250000));
        customerList.add(new CustomerAccount(1010, "Anju Senanayake", "current", 1100000));

        // a, b, c, d, e, f, g, h. Display initial details with calculated interest and total balance.
        System.out.println("a-h. Customer Details with Calculated Interest and New Total Balance:");
        customerList.display();
        System.out.println("\n--------------------------------------------------------------------------------------------------------------------------------\n");

        // i. Sort the customer details according to Total Account Balance using quick sort.
        customerList.sortByTotalBalance();
        System.out.println("i. Customers Sorted by Total Account Balance (Ascending):");
        customerList.display();
        System.out.println("\n--------------------------------------------------------------------------------------------------------------------------------\n");

        // j. Find and display all customers who have more than 1,000,000 in their account after one year.
        System.out.println("j. Customers with Total Balance > Rs. 1,000,000:");
        for (int i = 0; i < customerList.size(); i++) {
            CustomerAccount acc = customerList.get(i);
            if (acc.getTotalBalance() > 1000000) {
                System.out.println(acc);
            }
        }
        System.out.println("\n--------------------------------------------------------------------------------------------------------------------------------\n");

        // k. Identify customers with savings accounts and calculate the total balance in savings accounts.
        System.out.println("k. Savings Accounts Analysis:");
        double totalSavingsBalance = 0;
        for (int i = 0; i < customerList.size(); i++) {
            CustomerAccount acc = customerList.get(i);
            if (acc.getAccountType().equalsIgnoreCase("savings")) {
                totalSavingsBalance += acc.getTotalBalance();
            }
        }
        System.out.printf("Total balance in all savings accounts: Rs. %.2f\n", totalSavingsBalance);
        System.out.println("\n--------------------------------------------------------------------------------------------------------------------------------\n");

        // l. Calculate the percentage of the total balance in savings accounts relative to the total balance in all accounts.
        System.out.println("l. Percentage of Savings Balance Relative to Total Bank Balance:");
        double grandTotalBalance = 0;
        for (int i = 0; i < customerList.size(); i++) {
            grandTotalBalance += customerList.get(i).getTotalBalance();
        }

        if (grandTotalBalance > 0) {
            double percentage = (totalSavingsBalance / grandTotalBalance) * 100;
            System.out.printf("Total balance in savings accounts: Rs. %.2f\n", totalSavingsBalance);
            System.out.printf("Grand total balance in all accounts: Rs. %.2f\n", grandTotalBalance);
            System.out.printf("Percentage of savings balance: %.2f%%\n", percentage);
        } else {
            System.out.println("Cannot calculate percentage as total balance is zero.");
        }
    }
}
