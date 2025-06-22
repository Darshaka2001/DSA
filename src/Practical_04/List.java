package Practical_04;

public class List {
    private int[] dataArray;
    private String[] strArray;
    private int nextIndex;
    private int initSize;

    List(int size){
        this.initSize = size;
        nextIndex = 0;
        dataArray = new int[size];
        strArray = new String[size];
    }

    public void add(int data){
        if (isFull()){
            System.out.println("List is Full");
        }
        dataArray[nextIndex++] = data;
    }

    public void add(String data){
        if (isFull()){
            System.out.println("List is Full");
        }
        strArray[nextIndex++] = data;
    }

    public void removeLast(){
        if (isEmpty()){
            System.out.println("List is empty");
        }
        nextIndex--;
    }

    public int[] toArray(){
        int[] tempArray = new int[size()];
        for (int i = 0; i < nextIndex; i++) {
            tempArray[i] = dataArray[i];
        }
        return tempArray;
    }

    public String[] toArrayStr(){
        String[] tempArray = new String[size()];
        for (int i = 0; i < nextIndex; i++) {
            tempArray[i] = strArray[i];
        }
        return tempArray;
    }

    public int get(int index){
        if (isEmpty()){
            return -1;
        }
       return dataArray[index];
    }

    public int indexOf(int data){
        for (int i = 0; i < size(); i++) {
            if (dataArray[i] == data)
                return i;
        }
        return -1;
    }

    public String getStr(int i){
        if (isEmpty()){
            return null;
        }
        return strArray[i];
    }

    public int size(){
        return nextIndex;
    }

    public boolean isEmpty(){
        return nextIndex == 0;
    }

    public boolean isFull(){
        return nextIndex == initSize;
    }

}
