package mx.com.htpj9;

public class Employee {

    private String firstName;
    private String lastName;
    private static int count = 0;

    public Employee(String firstName_, String lastName_){

        firstName = firstName_;
        lastName = lastName_;

        count++;
        System.out.printf("Employee constructor: %s %s; count = %d\n", firstName, lastName, count);

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public static int getCount() {
        return count;
    }
}
