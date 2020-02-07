package mx.com.htpj9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the course name: ");
        String courseName = input.nextLine();

        GradeBook gradeBook = new GradeBook();
        gradeBook.setCourseName(courseName);
        gradeBook.displayMessage();


    }
}
