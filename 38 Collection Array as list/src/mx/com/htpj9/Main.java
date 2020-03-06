package mx.com.htpj9;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        String[] colors = {"black", "blue", "yellow"};
        LinkedList<String> links = new LinkedList<>(Arrays.asList(colors));

        links.addLast("red");
        links.add("pink");
        links.add(3, "green");
        links.addFirst("cyan");

        colors = links.toArray(new String[links.size()]);

        System.out.println("colors: ");

        for(String color : colors)
            System.out.println(color);

        Collections.sort(links);

        System.out.printf("Sorted array elements: %s%n", links);

    }
}
