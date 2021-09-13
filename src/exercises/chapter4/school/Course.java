package exercises.chapter4.school;

import java.util.ArrayList;

public class Course {
    private String topic;
    private String instructor;
    private int numberOfCredits;
    private ArrayList<Student> enrolledStudents;

    //constructor
    public Course(String topic, int numberOfCredits) {
        this.topic = topic;
        this.numberOfCredits = numberOfCredits;
    }

    @Override
    public String toString() {
        return this.topic + " is worth " + this.numberOfCredits + " number of credits";
    }

    @Override
    public boolean equals(Object obj) {
        if ((obj instanceof Course)==false) return false;
        Course myCourseObj = (Course) obj;
        if (myCourseObj.topic.equals(this.topic)) return true;
        else return false;
    }
}
