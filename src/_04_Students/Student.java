package _04_Students;

public class Student {

    String firstName;
    String secondName;
    Double grade;

    public Student(String firstName, String secondName, Double grade) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.grade = grade;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getsecondName() {
        return secondName;
    }

    public Double getGrade() {
        return grade;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setsecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }
}
