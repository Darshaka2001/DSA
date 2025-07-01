package Practical_09.Q3;

public class Q3 {
    public static void main(String[] args) {
        List list = new List();

        list.add(new Account(1001, "Kamal Dissanayake", "savings", 500000));
        list.add(new Account(1002, "Namal Perera", "current", 975000));
        list.add(new Account(1003, "Sithumm Udovita", "current", 100000));
        list.add(new Account(1004, "Manel Dias", "savings", 1250000));
        list.add(new Account(1005, "Chethiya Munasinghe", "savings", 950000));
        list.add(new Account(1006, "Sanju Perera", "current", 1500000));
        list.add(new Account(1007, "Lahiru Karunarathna", "savings", 600000));
        list.add(new Account(1008, "Tharanga Prasad", "savings", 400000));
        list.add(new Account(1009, "Shashi Dayarathna", "savings", 250000));
        list.add(new Account(1010, "Anju Senanayake", "current", 1100000));

        list.display();

        System.out.println("\n\n\n");
        list.sort();
        list.display();

        System.out.println("\n\n\n");

        for (int i = 0; i < list.size() ; i++) {
            Account account = list.get(i);
            if (account.getTotalBalance() > 1000000){
                System.out.println(account);
            }
        }

        System.out.println("\n\n\n");

        double totalInSaving = 0;
        for (int i = 0; i < list.size(); i++) {
            Account account = list.get(i);
            if (account.getAccType().equalsIgnoreCase("Savings")){
                totalInSaving += account.getAccBalance();
                System.out.println(account);
            }
        }
        System.out.println("Total Savings : "+totalInSaving);
        
        double totalBalance = 0;

        for (int i = 0; i < list.size(); i++) {
            Account account = list.get(i);
            totalBalance += account.getAccBalance();
        }
        
        double presentage = (totalInSaving / totalBalance) * 100;

        System.out.println("Total Balance : "+totalBalance);
        System.out.printf("%.2f%%",presentage);


        System.out.println("\n\n\n");

        list.mergeSort();
        list.display();


    }
}
