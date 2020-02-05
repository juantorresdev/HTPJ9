package mx.com.htpj9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner( System.in );
        GradeBook myGradeBook = new GradeBook();
        String nameCourse;

        System.out.println( "Please enter the course name:" );
        nameCourse = input.nextLine();
        System.out.println();

        myGradeBook.displayMessage(nameCourse);

    }
}
