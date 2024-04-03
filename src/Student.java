public class Student {
    private String name = "Ivan";

    private int mathGrade;
    private int physGrade;
    private int progGrade;

    public Student(){
        mathGrade = (int) (Math.random() * 4) + 2;
        physGrade = (int) (Math.random() * 4) + 2;
        progGrade = (int) (Math.random() * 4) + 2;
    }

    public float averageGrade(){
        return (float) (mathGrade + physGrade + progGrade) / 3;
    }

    public boolean isPoor(){
        return (mathGrade == 2 || progGrade == 2 || physGrade == 2);
    }
}
