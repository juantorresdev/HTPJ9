package mx.com.htpj9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Introduce el valor a calcular: ");

        Scanner num = new Scanner(System.in);
        int number = num.nextInt();

        System.out.printf("El valor de la serie de Fibonacci de %d es: %d", number, fibonacci(number));

    }

    private static int fibonacci(int number) {

        if(number == 0 || number == 1)
            return 1;
        else
            return fibonacci(number - 1) + fibonacci(number - 2);

    }
}
