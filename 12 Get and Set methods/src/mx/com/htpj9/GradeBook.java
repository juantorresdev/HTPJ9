package mx.com.htpj9;

public class GradeBook {

    private String courseName;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void displayMessage(){
        System.out.printf("Welcome to the grade book for \n%s!", getCourseName());
    }

}
