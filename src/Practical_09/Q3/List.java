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

    public void set(int index, Account account){
        accounts[index] = account;
    }

    public void mergeSort(){
        if (this.size() <= 1){
            return;
        }

        int mid = this.size() / 2;

        // Divide
        List left = new List();
        for (int i = 0; i < mid; i++) {
            left.add(this.get(i));
        }

        List right = new List();
        for (int i = mid; i < this.size(); i++) {
            right.add(this.get(i));
        }

        // conquer
        left.mergeSort();
        right.mergeSort();

        // marge
        this.merge(left, right);
    }

    private void merge(List left, List right) {

        int leftIndex = 0, rightIndex = 0, mainIndex = 0;

        while (leftIndex < left.size() && rightIndex < right.size()){
            if (left.get(leftIndex).getCustomerName().compareTo(right.get(rightIndex).getCustomerName()) <= 0){
                this.set(mainIndex++,left.get(leftIndex++));
            } else {
                this.set(mainIndex++,right.get(rightIndex++));
            }
        }

        // copy remaining elements for left
        while (leftIndex < left.size()){
            this.set(mainIndex++, left.get(leftIndex++));
        }

        // copy remaining elements for right
        while (rightIndex < right.size()){
            this.set(mainIndex++, right.get(rightIndex++));
        }

    }
}
