package mx.com.htpj9;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        String[] colors = {"red", "white", "blue", "green", "gray", "orange", "tan", "white", "cyan", "peach", "gray", "orange"};
        List<String> list = Arrays.asList(colors);
        System.out.printf("List: %s%n", list);

        printNonDuplicates(list);

    }

    private static void printNonDuplicates(Collection<String> list) {

        Set<String> set = new HashSet<>(list);

        System.out.printf("%nNonduplicates are: ");

        for(String element: set){
            System.out.println(element);
        }

    }
}
