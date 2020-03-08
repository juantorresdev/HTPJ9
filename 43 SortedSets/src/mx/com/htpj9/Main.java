package mx.com.htpj9;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        String[] colors = {"yellow", "green", "black", "tan", "grey", "white", "orange", "red", "green"};

        SortedSet<String> tree = new TreeSet<>(Arrays.asList(colors));
        System.out.print("sorted set: ");
        printSet(tree);

        // get headSet based on "orange"
        System.out.print("headSet (\"orange\"): ");
        printSet(tree.headSet("orange") );

        // get tailSet based upon "orange"
        System.out.print("tailSet (\"orange\"): ");
        printSet(tree.tailSet("orange") );

        // get first and last elements
        System.out.printf("first: %s%n", tree.first());
        System.out.printf("last : %s%n", tree.last());

    }

    private static void printSet(SortedSet<String> set) {
        for(String element : set)
            System.out.printf("%s ", element);
        System.out.println();
    }
}
