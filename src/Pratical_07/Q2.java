package Pratical_07;

class Employee{
    String employeeID;
    String employeeName;
    String dept;
    String salaryGrade;

    public Employee(String employeeID, String employeeName, String dept, String salaryGrade) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.dept = dept;
        this.salaryGrade = salaryGrade;
    }
}

public class Q2 {
    static Employee[] employees = new Employee[10];

    static void inputAndDisplayData(){
        employees[0] = new Employee("EMP001","Anjali","HR","B");
        employees[1] = new Employee("EMP002","Roshan","Finance","A");
        employees[2] = new Employee("EMP003","Meera","IT","C");
        employees[3] = new Employee("EMP004","Hiran","HR","A");
        employees[4] = new Employee("EMP005","Sanjay","Marketing","B");
        employees[5] = new Employee("EMP006","Vimukthi","Finance","D");
        employees[6] = new Employee("EMP007","Dilani","IT","C");
        employees[7] = new Employee("EMP008","Tharindu","Marketing","A");
        employees[8] = new Employee("EMP009","Ishara","HR","B");
        employees[9] = new Employee("EMP010","Lahiru","IT","D");

        System.out.println("Before Sort");

        for (Employee e : employees){
            System.out.printf("%-12s %-20s %-15s %-10s\n", e.employeeID, e.employeeName, e.dept, e.salaryGrade);
        }

    }

    static void sortData(){
        int n = employees.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (employees[j].salaryGrade.charAt(0) < employees[min].salaryGrade.charAt(0)){
                    min = j;
                }
            }
            Employee temp = employees[min];
            employees[min] = employees[i];
            employees[i] = temp;
        }

        System.out.println("\nAfter Sort");

        for (Employee e : employees){
            System.out.printf("%-12s %-20s %-15s %-10s\n", e.employeeID, e.employeeName, e.dept, e.salaryGrade);
        }
    }

    static void binarySearch(String target){
        int low = 0;
        int high = employees.length - 1;
        boolean isFound = false;

        while (low <= high){
            int mid = low + (high - low) / 2;
            if (employees[mid].salaryGrade.equals(target)){
                System.out.printf("%-12s %-20s %-15s %-10s\n", employees[mid].employeeID, employees[mid].employeeName, employees[mid].dept, employees[mid].salaryGrade);

                int left = mid - 1;
                while (left >= employees[left].salaryGrade.charAt(0)){
                    System.out.printf("%-12s %-20s %-15s %-10s\n", employees[left].employeeID, employees[left].employeeName, employees[left].dept, employees[left].salaryGrade);
                    left--;
                }

                int right = mid + 1;
                while (right <= employees[right].salaryGrade.charAt(0)){
                    System.out.printf("%-12s %-20s %-15s %-10s\n", employees[right].employeeID, employees[right].employeeName, employees[right].dept, employees[right].salaryGrade);
                    right--;
                }
                break;

            } else if (employees[mid].salaryGrade.charAt(0) < target.charAt(0)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

    }

    public static void main(String[] args) {

        inputAndDisplayData();
        sortData();
        System.out.println();




    }
}
