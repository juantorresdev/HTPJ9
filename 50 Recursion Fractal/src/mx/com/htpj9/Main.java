package mx.com.htpj9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Introduce el valor a calcular fractal: ");
        Scanner number = new Scanner(System.in);
        int num = number.nextInt();

        System.out.printf("Fractal de %d: %d", num, calculaFractal(num));


    }

    public static int calculaFractal(int num){

        if (num <= 1)
            return 1;
        else
            return num * calculaFractal(num-1);

    }
}
