package Domain;

import java.util.ArrayList;
import java.util.Date;

import java.util.Date;

//import java.sql.Date;

public class Registration {
    private Date registrationate;
    private ArrayList<Student> emailAddress = new ArrayList<>();
    private Course course;
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public ArrayList<Student> getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(ArrayList<Student> emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Date getRegistrationate() {
        return registrationate;
    }

    public void setRegistrationate(Date registrationate) {
        this.registrationate = registrationate;
    }

}
