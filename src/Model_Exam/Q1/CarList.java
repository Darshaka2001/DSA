package Model_Exam.Q1;

public class CarList {
    private Car[] cars;
    private int size;
    private static final int DEFAULT_SIZE = 8;

    public CarList() {
        size = 0;
        cars = new Car[DEFAULT_SIZE];
    }

    public void add(Car car){
        if (cars.length == size){
            System.out.println("List is Full");
        }

        cars[size++] = car;
    }

    public Car get(int index){
        return cars[index];
    }

    public int size(){
        return size;
    }

    public void display(){
        for (int i = 0; i < size(); i++) {
            System.out.println(cars[i]);
        }
    }

    public void insertionSort(){
        for (int i = 0; i < size(); i++) {
            Car key = cars[i];
            int j = i - 1;

            while (j >= 0 && cars[j].getCarID().compareTo(key.getCarID()) > 0){
                cars[j + 1] = cars[j];
                j = j - 1;
            }
            cars[j + 1] = key;
        }
    }

    public void qSort(){
        quickSort(0,size() - 1);
    }

    private void quickSort(int start, int end) {
        if (start < end){
            int partitionIndex = partition(start, end);
            quickSort(start, partitionIndex  -1);
            quickSort(partitionIndex + 1, end);
        }
    }

    private int partition(int start, int end) {
        double pivot = cars[end].getDailyRate();
        int i = (start - 1);

        for (int j = start; j < end; j++) {
            if (cars[j].getDailyRate() > pivot){
                i++;
                swap(i, j);
            }
        }
        swap(i + 1, end);
        return i + 1;
    }

    private void swap(int i, int j){
        Car temp = cars[i];
        cars[i] = cars[j];
        cars[j] = temp;
    }

}
