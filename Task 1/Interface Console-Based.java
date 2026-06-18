import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Student Grade Management System ===");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Grade: ");
        int grade = sc.nextInt();

        System.out.println("\n--- Summary Report ---");
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
