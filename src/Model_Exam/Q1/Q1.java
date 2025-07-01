package Model_Exam.Q1;

public class Q1 {
    public static void main(String[] args) {
        CarList carList = new CarList();

        carList.add(new Car("C105","Toyota Aqua","Hatchback",8000));
        carList.add(new Car("C102","Honda Vezel","SUV",12000));
        carList.add(new Car("C108","Suzuki Alto","Hatchback",6000));
        carList.add(new Car("C101","Toyota Prius","Sedan",9500));
        carList.add(new Car("C106","Kia Sportage","SUV",14000));
        carList.add(new Car("C104","Nissan Leaf","Electric",11000));
        carList.add(new Car("C103","Honda Civic","Sedan",10000));
        carList.add(new Car("C107","Perodua Axia","Hatchback",75000));

        // i
        System.out.println("Question i : ");
        carList.display();
        System.out.println("\n\n");

        // ii
        System.out.println("Question ii : ");
        carList.insertionSort();
        carList.display();
        System.out.println("\n\n");

        // iii
        System.out.println("Question iii : ");
        carList.qSort();
        carList.display();
        System.out.println("\n\n");

        // iv
        System.out.println("Question iv : ");
        for (int i = 0; i < carList.size(); i++) {
            Car car = carList.get(i);
            if (car.getDailyRate() >= 10000){
                System.out.println(car);
            }
        }

    }
}
