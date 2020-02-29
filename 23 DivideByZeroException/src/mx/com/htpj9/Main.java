package mx.com.htpj9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;

        do{
            try{
                System.out.print("Introduce el numerador: ");
                int numerator = scanner.nextInt();
                System.out.print("Introduce el denominador: ");
                int denominator = scanner.nextInt();

                int result = quotient(numerator, denominator);
                System.out.printf("\nResultado: %d / %d = %d\n", numerator, denominator, result);
                continueLoop = false;
            }
            catch (InputMismatchException inputMismatchException){
                System.err.printf("\nExcepción: %s\n", inputMismatchException);
                scanner.nextLine();
                System.out.println("Debes introducir enteros. Vuelve a intentar.\n");
            }
            catch (ArithmeticException arithmeticException){
                System.err.printf("\nException: %s\n", arithmeticException);
                System.out.println("Zero es un denominador inválido. Vuelve a intentar.");
            }
        } while(continueLoop);

    }

     public static int quotient(int numerator, int denominator) throws ArithmeticException{
        return numerator/denominator;
     }
}
