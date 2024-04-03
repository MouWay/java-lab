public class Lab1 {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.printf("Student's average grade: %.2f\n", student.averageGrade());
        if (student.isPoor()) System.out.println("This is a poor student!");
        else System.out.println("This student is good.");
    }
}