package Domain;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private String subject;
    private String introductionText;
    private String level;
    private ArrayList<Course> interest = new ArrayList<>();

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getIntroductionText() {
        return introductionText;
    }

    public void setIntroductionText(String introductionText) {
        this.introductionText = introductionText;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public ArrayList<Course> getInterest() {
        return interest;
    }

    public void setInterest(ArrayList<Course> interest) {
        this.interest = interest;
    }

    public void addCourse(Course course) {
        this.interest.add(course);
    }
}
