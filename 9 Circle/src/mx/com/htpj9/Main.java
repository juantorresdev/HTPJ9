package mx.com.htpj9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double radio;
        double diameter, circumference, area;

        System.out.println("Introduce el valor del radio: ");
        radio = input.nextInt();

        diameter = 2 * radio;
        circumference = 2 * Math.PI * radio;
        area = Math.PI * radio * radio;

        System.out.printf("Valor del diámetro: %f\n", diameter);
        System.out.printf("Valor del diámetro: %f\n", circumference);
        System.out.printf("Valor del diámetro: %f\n", area);

    }
}
