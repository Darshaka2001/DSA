package Praticle_09.Q3;

public class CustomerList {
    private CustomerAccount[] accounts;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public CustomerList() {
        this.accounts = new CustomerAccount[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public void add(CustomerAccount account) {
        if (size < accounts.length) {
            accounts[size++] = account;
        }
    }

    public int size() {
        return size;
    }

    public CustomerAccount get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds.");
        }
        return accounts[index];
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(accounts[i]);
        }
    }

    public void sortByTotalBalance() {
        quickSort(0, size - 1);
    }

    private void quickSort(int low, int high) {
        if (low < high) {
            int partitionIndex = partition(low, high);
            quickSort(low, partitionIndex - 1);
            quickSort(partitionIndex + 1, high);
        }
    }

    private int partition(int low, int high) {
        double pivot = accounts[high].getTotalBalance();
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (accounts[j].getTotalBalance() < pivot) {
                i++;
                swap(i, j);
            }
        }
        swap(i + 1, high);
        return i + 1;
    }

    private void swap(int i, int j) {
        CustomerAccount temp = accounts[i];
        accounts[i] = accounts[j];
        accounts[j] = temp;
    }
}
