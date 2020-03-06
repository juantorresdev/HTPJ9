package mx.com.htpj9;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        String[] colors = {"black", "yellow", "green", "blue", "violet", "silver"};
        List<String> list1 = new LinkedList<>();

        for(String color : colors)
            list1.add(color);

        String[] colors2 = {"gold", "white", "brown", "blue", "gray", "silver"};
        List<String> list2 = new LinkedList<>();

        for(String color : colors2)
            list2.add(color);

        list1.addAll(list2);
        list2 = null;
        printList(list1);

        convertToUppercaseStrings(list1);
        printList(list1);

        System.out.printf("%nDeleting elements 4 to 6");
        removeItems(list1, 4, 7);
        printList(list1);
        printReversedList(list1);


    }

    private static void removeItems(List<String> list1, int start, int end) {

        list1.subList(start, end).clear();

    }

    private static void convertToUppercaseStrings(List<String> list1) {

        ListIterator<String> iterator = list1.listIterator();

        while (iterator.hasNext()){
            String color = iterator.next();
            iterator.set(color.toUpperCase());
        }

    }

    private static void printList(List<String> list1) {

        System.out.printf("%nList:%n");

        for(String element : list1)
            System.out.println(element);

        System.out.println();

    }

    private static void printReversedList(List<String> list1) {

        ListIterator<String> iterator = list1.listIterator();

        System.out.printf("%nReverted List:%n");

        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }

    }
}
