import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private int age;
    private String course;
    private double marks;

    Student(int id, String name, int age, String course, double marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    public double getMarks() {
        return marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public double getPercentage() {
        return marks;
    }

    public String getGrade() {
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    public void display() {
        System.out.println("----------------------------");
        System.out.println("Student ID : " + id);
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Course     : " + course);
        System.out.println("Marks      : " + marks);
        System.out.println("Percentage : " + getPercentage() + "%");
        System.out.println("Grade      : " + getGrade());
        System.out.println("----------------------------");
    }
}

public class StudentManagementSystem {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n=================================");
            System.out.println("     STUDENT MANAGEMENT SYSTEM");
            System.out.println("=================================");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.println("=================================");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    updateStudent();
                    break;

                case 5:
                    deleteStudent();
                    break;

                case 6:
                    System.out.println("Thank you for using Student Management System!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    static void addStudent() {

        System.out.println("\n===== ADD STUDENT =====");

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (findStudent(id) != null) {
            System.out.println("Student ID already exists.");
            return;
        }

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();
        sc.nextLine();

        if (marks < 0 || marks > 100) {
            System.out.println("Marks must be between 0 and 100.");
            return;
        }

        Student student = new Student(id, name, age, course, marks);

        students.add(student);

        System.out.println("Student added successfully!");
    }

    static void viewStudents() {

        System.out.println("\n===== ALL STUDENTS =====");

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student student : students) {
            student.display();
        }
    }

    static void searchStudent() {

        System.out.println("\n===== SEARCH STUDENT =====");

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        Student student = findStudent(id);

        if (student != null) {
            student.display();
        } else {
            System.out.println("Student not found.");
        }
    }

    static void updateStudent() {

        System.out.println("\n===== UPDATE STUDENT =====");

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        Student student = findStudent(id);

        if (student == null) {
            System.out.println("Student not found.");
            return;
        }

        System.out.print("Enter New Name: ");
        String name = sc.nextLine();

        System.out.print("Enter New Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter New Course: ");
        String course = sc.nextLine();

        System.out.print("Enter New Marks: ");
        double marks = sc.nextDouble();
        sc.nextLine();

        if (marks < 0 || marks > 100) {
            System.out.println("Marks must be between 0 and 100.");
            return;
        }

        student.setName(name);
        student.setAge(age);
        student.setCourse(course);
        student.setMarks(marks);

        System.out.println("Student updated successfully!");
    }

    static void deleteStudent() {

        System.out.println("\n===== DELETE STUDENT =====");

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        Student student = findStudent(id);

        if (student != null) {
            students.remove(student);
            System.out.println("Student deleted successfully!");
        } else {
            System.out.println("Student not found.");
        }
    }

    static Student findStudent(int id) {

        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }

        return null;
    }
}