import java.util.Scanner;

class InvalidMarkException extends Exception {
    public InvalidMarkException(String message) {
        super(message);
    }
}

public class StudentGradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine().trim();
            name = formatName(name);

            System.out.print("Enter marks: ");
            String marksInput = scanner.nextLine().trim();

            int marks = parseMarks(marksInput);

            System.out.println("Student: " + name);
            System.out.println("Marks: " + marks);
            System.out.println("Grade: " + calculateGrade(marks));

        } catch (InvalidMarkException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Marks must be a number.");
        } finally {
            System.out.println("Program ended.");
            scanner.close();
        }
    }

    static String formatName(String name) {
        if (name.isEmpty()) return name;
        return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }

    static int parseMarks(String input) throws InvalidMarkException {
        int marks = Integer.parseInt(input);
        if (marks < 0 || marks > 100) {
            throw new InvalidMarkException("Marks should be between 0 and 100.");
        }
        return marks;
    }

    static String calculateGrade(int marks) {
        if (marks >= 90) return "A+";
        else if (marks >= 80) return "A";
        else if (marks >= 70) return "B+";
        else if (marks >= 60) return "B";
        else if (marks >= 50) return "C";
        else return "F";
    }
}
