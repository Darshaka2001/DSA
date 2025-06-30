package Pratical_07;

import java.util.Scanner;

class Student{
    String stNumber;
    String name;
    String gender;
    String grade;

    public Student(String stNumber, String name, String gender, String grade) {
        this.stNumber = stNumber;
        this.name = name;
        this.gender = gender;
        this.grade = grade;
    }
}

public class Q1 {

    static Student[] students = new Student[10];

    static void inputAndDisplayProduct(){
        students[0] = new Student("PS/2017/016","Amal","M","A");
        students[1] = new Student("PS/2017/198","Binura","M","A");
        students[2] = new Student("PS/2017/301","Chanaka","M","A");
        students[3] = new Student("PS/2017/045","Sarath","M","B");
        students[4] = new Student("PS/2017/149","Nirmala","F","B");
        students[5] = new Student("PS/2017/151","Sithara","F","B");
        students[6] = new Student("PS/2017/280","Kamal","M","B");
        students[7] = new Student("PS/2017/273","Kasuni","F","C");
        students[8] = new Student("PS/2017/312","Akila","F","C");
        students[9] = new Student("PS/2017/105","Dasuni","F","A");

        System.out.println("-----Student List----");
        for (Student s : students){
            System.out.printf("%s\t%s\t%s\t%s\n",s.stNumber,s.name,s.gender,s.grade);
        }
    }

    static void sequentialSearch(String input){
        System.out.printf("Sequential Search for Search Student Details with Grade '%s' \n",input);
        boolean found = false;
        for (Student s : students){
            if (s.grade.equals(input)){
                System.out.printf("%s\t%s\t%s\t\t%s\n",s.stNumber,s.name,s.gender,s.grade);
                found = true;
            }
        }
        if (!found)
            System.out.println("No student found with grade " + input);
    }

    static void sortData(){
        int n = students.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (students[j].grade.charAt(0) < students[min].grade.charAt(0)){
                    min = j;
                }
            }
            Student temp = students[min];
            students[min] = students[i];
            students[i] = temp;
        }

    }

    static void binarySearch(String input){

        int left = 0;
        int right = students.length - 1;

        while (left <= right){
            int mid = left + (right - left) / 2;
            if (students[mid].grade.equals(input)){
                System.out.printf("%s\t%s\t%s\t\t%s\n",students[mid].stNumber,students[mid].name,students[mid].gender,students[mid].grade);

                int low = mid - 1;
                while (low >= 0 && students[low].grade.equals(input)){
                    System.out.printf("%s\t%s\t%s\t\t%s\n",students[low].stNumber,students[low].name,students[low].gender,students[low].grade);
                    low--;
                }

                int high = mid + 1;
                while (high <= students.length && students[high].grade.equals(input)){
                    System.out.printf("%s\t%s\t%s\t\t%s\n",students[high].stNumber,students[high].name,students[high].gender,students[high].grade);
                    high++;
                }
                break;
            } else if (students[mid].grade.charAt(0) < input.charAt(0)) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }


        }

    }


    public static void main(String[] args) {
        inputAndDisplayProduct();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter grade to search student: ");
        String input = scanner.nextLine().toUpperCase();

        sortData();

        sequentialSearch(input);
        System.out.println();
        binarySearch(input);
    }


}
