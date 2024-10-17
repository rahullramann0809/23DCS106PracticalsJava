import java.util.Scanner;
class Student {
    int rollNumber;
    String name;

    
    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    
    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
    }
}


class Exam extends Student {
    int[] marks = new int[6];

    
    public Exam(int rollNumber, String name, int[] marks) {
        super(rollNumber, name);
        this.marks = marks;
    }

    
    public void displayMarks() {
        System.out.println("Marks in 6 subjects: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
    }
}


class Result extends Exam {
    int totalMarks;

    
    public Result(int rollNumber, String name, int[] marks) {
        super(rollNumber, name, marks);
        this.totalMarks = calculateTotalMarks();
    }

   
    private int calculateTotalMarks() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

  
    public void displayResult() {
        displayStudentDetails();
        displayMarks();
        System.out.println("Total Marks: " + totalMarks);
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter roll number: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine();  
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
       

     
        int[] marks = new int[6];
        for (int i = 0; i < 6; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        Result result = new Result(rollNumber, name, marks);
        result.displayResult();
        scanner.close();
    }
}
