package mx.com.htpj9;

public class Main {

    public static void main(String[] args) {

        System.out.println("Java example of the use of varagrs (...)");

        String uno = "Cadena 1";
        String dos = "Cadena 2";
        String tres = "Cadena 3";

        methodExample(uno, dos, tres, uno, dos, tres);

    }

    public static void methodExample(String ... cadena){

        for(String element : cadena){
            System.out.println(element);
        }

    }
}
