package exercises.chapter4.school;

import org.w3c.dom.ls.LSOutput;

public class Student {

    public static void main(String[] args) {

        Student myself = new Student("Hope", 1, 50, 4.0);
        Student secondStudent = new Student("Hope", 2, 30, 3.0);
        Teacher theTeacher = new Teacher();
        String myGradeLevel = myself.getGradeLevel();
        System.out.println(myself.name + ": " + myGradeLevel);
        myself.addGrade(4, 2.0);
        System.out.println(myself.gpa);
        //
        System.out.println(myself.toString());
        System.out.println(myself.equals(secondStudent));
        System.out.println(myself.equals(theTeacher));

        Course firstCourse = new Course("JavaScript", 2);
        Course secondCourse = new Course("Java", 3);
        System.out.println(firstCourse.equals(secondCourse));
        System.out.println(firstCourse.toString());

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

    public void addGrade(int courseCredits, double grade) {

    double currentQualityScore = this.gpa * this.numberOfCredits;
    double newQualityScore = grade * courseCredits;
    double newTotalQualityScore = currentQualityScore + newQualityScore;
    int newTotalNumberOfCredits = this.numberOfCredits + courseCredits;
    this.numberOfCredits = newTotalNumberOfCredits;
    double newGpa = newTotalQualityScore/newTotalNumberOfCredits;
     this.gpa = newGpa;

        //Use the new course grade and course credits to update their total quality score.
        //Update the student’s total numberOfCredits.
        //Compute their new GPA
    }

    public String getGradeLevel() {
        if (this.numberOfCredits <= 29) {
            return "Freshman";
        } else if (this.numberOfCredits <= 59) {
            return "Sophmore";
        } else if (this.numberOfCredits <= 89) {
            return "Junior";
        } else if (this.numberOfCredits >= 90) {
            return "Senior";
        } else return null;
    }
    public void setName(String name) {
        this.name = name;
    }

    private void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public void setGpa(double gpa) {
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

    @Override
    public String toString() {
        return this.name + ": " + this.gpa;
    }

    @Override
    public boolean equals(Object obj) {
        if ((obj instanceof Student)==false) return false;
        Student myStudentObj = (Student) obj;
        if (myStudentObj.name.equals(this.name)) return true;
        else return false;
    }
}


