package mx.com.htpj9;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> items = new ArrayList<String>();

        items.add("red");
        items.add(0, "yellow");

        System.out.printf("Display list contents with counter-controlled loop: ");
        for(int i = 0; i < items.size(); i++)
            System.out.printf("\n%s", items.get(i));
        System.out.println();

        display(items, "\nDisplay list contents with enhanced for statement: ");

        items.add("green");
        items.add("yellow");
        display(items, "List with two new elements: ");
        System.out.println();

        items.remove("yellow");
        display(items, "Remove first instance of yellow: ");
        System.out.println();

        items.remove(1);
        display(items, "Remove second list element (green): ");
        System.out.println();

        System.out.printf("%s\n", items.size());
    }

    private static void display(ArrayList<String> items, String header) {

        System.out.printf(header);

        for(String item : items)
            System.out.printf("\n%s", item);

        System.out.println();
    }
}
