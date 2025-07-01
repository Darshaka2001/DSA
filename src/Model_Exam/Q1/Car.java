package Model_Exam.Q1;

public class Car {
    private String carID;
    private String carName;
    private String carCategory;
    private double dailyRate;

    public Car(String carID, String carName, String carCategory, double dailyRate) {
        this.carID = carID;
        this.carName = carName;
        this.carCategory = carCategory;
        this.dailyRate = dailyRate;
    }

    public String getCarID() {
        return carID;
    }

    public void setCarID(String carID) {
        this.carID = carID;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarCategory() {
        return carCategory;
    }

    public void setCarCategory(String carCategory) {
        this.carCategory = carCategory;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public String toString(){
        return String.format("%-6s | %-15s | %-14s | %10.2f",
                carID,carName,carCategory,dailyRate);
    }


}
