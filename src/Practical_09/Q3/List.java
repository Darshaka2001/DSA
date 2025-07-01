package Practical_09.Q3;

public class List {
    private Account[] accounts;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    List(){
        accounts = new Account[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public void add(Account account){
        if (size == accounts.length){
            System.out.println("List is Full.");
            return;
        }
        accounts[size++] = account;
    }

    public Account get(int index){
        return accounts[index];
    }

    public void display(){
        for (int i = 0; i < size; i++) {
            System.out.println(accounts[i]);
        }
    }

    public void sort(){
        quickSort(0,size - 1);
    }

    private void quickSort(int start, int end){
        if (start < end){
            int partitionIndex = partition(start, end);
            quickSort(start, partitionIndex - 1);
            quickSort(partitionIndex + 1, end);
        }
    }

    private int partition(int start, int end) {
        double pivot = accounts[end].getAccBalance();
        int i = (start - 1);

        for (int j = start; j < end; j++) {
            if (accounts[j].getAccBalance() < pivot){
                i++;
                swap(i, j);
            }
        }
        swap(i+1, end);
        return i + 1;
    }

    private void swap(int i, int j){
        Account temp = accounts[i];
        accounts[i] = accounts[j];
        accounts[j] = temp;
    }

    public int size(){
        return size;
    }
}
