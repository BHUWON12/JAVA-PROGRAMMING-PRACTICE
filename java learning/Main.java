import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private String rollNumber;
    private String name;
    private String dob;

    public Student(String rollNumber, String name, String dob) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.dob = dob;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }
}

class StudentManagementSystem {
    private List<Student> students;

    public StudentManagementSystem() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

    public void displayAllStudents() {
        System.out.println("Student List:");
        for (Student student : students) {
            System.out.println("Roll Number: " + student.getRollNumber());
            System.out.println("Name: " + student.getName());
            System.out.println("Date of Birth: " + student.getDob());
            System.out.println();
        }
    }

    public void searchStudent(String rollNumber) {
        for (Student student : students) {
            if (student.getRollNumber().equals(rollNumber)) {
                System.out.println("Student Details:");
                System.out.println("Roll Number: " + student.getRollNumber());
                System.out.println("Name: " + student.getName());
                System.out.println("Date of Birth: " + student.getDob());
                return;
            }
        }
        System.out.println("Student not found.");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagementSystem sms = new StudentManagementSystem();

        while (true) {
            System.out.println("Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll Number: ");
                    String rollNumber = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Date of Birth: ");
                    String dob = scanner.nextLine();
                    Student student = new Student(rollNumber, name, dob);
                    sms.addStudent(student);
                    break;
                case 2:
                    sms.displayAllStudents();
                    break;
                case 3:
                    System.out.print("Enter Roll Number to Search: ");
                    String searchRollNumber = scanner.nextLine();
                    sms.searchStudent(searchRollNumber);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}