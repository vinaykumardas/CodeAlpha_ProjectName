import java.util.ArrayList;

public class StudentGrades {
    public static void main(String[] args) {

        ArrayList<Integer> grades = new ArrayList<>();

        grades.add(80);
        grades.add(75);
        grades.add(90);
        grades.add(65);
        grades.add(85);

        System.out.println("Student Grades Report");
        System.out.println("---------------------");

        for (int i = 0; i < grades.size(); i++) {
            System.out.println("Student " + (i + 1) + ": " + grades.get(i));
        }
    }
}
