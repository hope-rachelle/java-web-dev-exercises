package exercises.chapter4.school;

public class Student {

    public static void main(String[] args) {
        Student myself = new Student("Hope", 123, 1, 4.0);
    }

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }

    public void setName(String name){
        this.name = name;
    }
    private void setStudentId(int studentId){
        this.studentId = studentId;
    }
    public void setNumberOfCredits(int numberOfCredits){
        this.numberOfCredits = numberOfCredits;
    }
    public void setGpa(double gpa){
        this.gpa = gpa;
    }
    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

}
