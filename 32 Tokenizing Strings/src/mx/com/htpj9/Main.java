package mx.com.htpj9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        String sentence = "This is a sentences with seven tokens";

        String[] tokens = sentence.split(" ");
        System.out.printf("Number of elements: %d%nThe tokens are: %n", tokens.length);

        for(String token : tokens)
            System.out.println(token);

    }
}
