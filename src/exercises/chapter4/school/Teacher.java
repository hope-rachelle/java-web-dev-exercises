package exercises.chapter4.school;

public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    private void setFirstName() { this.firstName = firstName; }
    public void setLastName() { this.lastName = lastName; }
    public void setSubject() { this.subject = subject; }
    public void setYearsTeaching() { this.yearsTeaching = yearsTeaching; }

    public String getFirstName() { return firstName; }
    public String getLastName() { return  lastName; }
    public String getSubject() { return subject; }
    public int getYearsTeaching() { return yearsTeaching; }
}
