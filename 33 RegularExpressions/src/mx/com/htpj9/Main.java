package mx.com.htpj9;

public class Main {

    public static void main(String[] args) {


        String firstName = "Jane";
        String lastName = "Doe";
        String address = "123 Some Street";
        String city = "Some City";
        String state = "SS";
        String zip = "12345";
        String phone = "123-456-7890";

        System.out.println("%Validate Results: ");

        if (!ValidateInput.validateFirstName(firstName))
            System.out.println("Invalid first name");
        else if (!ValidateInput.validateLastName(lastName))
            System.out.println("Invalid last name");
        else if (!ValidateInput.validateAddress(address))
            System.out.println("Invalid address");
        else if (!ValidateInput.validateCity(city))
            System.out.println("Invalid city");
        else if (!ValidateInput.validateState(state))
            System.out.println("Invalid state");
        else if (!ValidateInput.validateZip(zip))
            System.out.println("Invalid zip code");
        else if (!ValidateInput.validatePhone(phone))
            System.out.println("Invalid phone number");
        else
            System.out.println("Valid input. Thank you.");


    }
}
