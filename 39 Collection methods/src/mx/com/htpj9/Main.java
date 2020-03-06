package mx.com.htpj9;

import java.sql.Time;
import java.text.CollationKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        List<String> list = Arrays.asList(suits);
        System.out.printf("Unorted array elements: %s%n", list);

        /*
        *
        * METHOD SORT
        *
        * */
        Collections.sort(list);
        System.out.printf("Sorted array elements: %s%n", list);
        System.out.println();

        /*
         *
         * METHOD SORT WITH A COMPARATOR OBJECT
         *
         * */
        Collections.sort(list, Collections.reverseOrder());
        System.out.printf("Sorted array elements: %s%n", list);
        System.out.println();

        /*
         *
         * METHOD SORT WITH A COMPARATOR OBJECT
         *
         * */

        List<Time> timeList = new ArrayList<>();

        timeList.add(new Time(6, 24, 34));
        timeList.add(new Time(18, 14, 58));
        timeList.add(new Time(6, 5, 34));
        timeList.add(new Time(12, 14, 58));
        timeList.add(new Time(6, 24, 22));

        System.out.printf("Unsorted array elements:%n%s%n", timeList);

        Collections.sort(timeList, new TimeComparator());

        System.out.printf("Sorted array elements:%n%s%n", timeList);
        System.out.println();

        /*
         *
         * METHOD SHUFFLE
         *
         * */
        DeckOfCards cards = new DeckOfCards();
        cards.printCards();
        System.out.println();

        /*
         *
         * Collections methods reverse, fill, copy, max and min
         *
         * */

        Character[] letters = {'P', 'C', 'M'};
        List<Character> charList = Arrays.asList(letters);
        System.out.println("List contains: ");
        output(charList);

        Collections.reverse(charList);
        System.out.printf("%nAfter calling reverse, charlist contaions:%n");
        output(charList);

        Character[] lettersCopy = new Character[3];
        List<Character> copyList = Arrays.asList(lettersCopy);

        Collections.copy(copyList, charList);
        System.out.printf("%nAfter copying, copyList contaions:%n");
        output(copyList);

        Collections.fill(charList, 'R');
        System.out.printf("%nAfter calling fill, charlist contaions:%n");
        output(charList);

        /*
         *
         * Binary search
         *
         * */

        String[] colors = {"red", "white", "blue", "black", "yellow", "purple", "tan", "pink"};
        List<String> colorList = new ArrayList<>(Arrays.asList(colors));

        Collections.sort(colorList);
        System.out.printf("Sorted Arraylist %s%n", colorList);

        printSearchResults(colorList, "black");
        printSearchResults(colorList, "red");
        printSearchResults(colorList, "pink");
        printSearchResults(colorList, "aqua");
        printSearchResults(colorList, "gray");
        printSearchResults(colorList, "teal");

        /*
        *
        * Methods addAll, Frequency and disjoint
        *
        * */

        String[] collors = {"red", "white", "yellow", "blue"};
        List<String> list1 = Arrays.asList(collors);
        ArrayList<String> list2 = new ArrayList<>();

        list2.add("black");
        list2.add("red");
        list2.add("green");

        System.out.print("Before addAll, list2 contains: ");
        for(String s : list2)
            System.out.printf("%s ", s);

        Collections.addAll(list2, collors);

        System.out.printf("%nAfter addAll, list2 contains; ");
        for(String s : list2)
            System.out.printf("%s ", s);

        int frequency = Collections.frequency(list2, "red");
        System.out.printf("%nFrequency of red in list2: %d%n", frequency);

        boolean disjoint = Collections.disjoint(list1, list2);

        System.out.printf("list1 and list2 %s elements in common%n", (disjoint ? "do not have" : "have"));


    }

    private static void printSearchResults(List<String> colorList, String key) {

        int result = 0;

        System.out.printf("%nSearching for: %s%n", key);
        result =  Collections.binarySearch(colorList, key);

        if(result >= 0)
            System.out.printf("Found at index %d%n", result);
        else
            System.out.printf("Not found (%d)%n", result);
    }


    private static void output(List<Character> listRef){

        System.out.print("The list is: ");

        for(Character c : listRef)
            System.out.printf("%s ", c);

        System.out.printf("%nMax: %s", Collections.max(listRef));
        System.out.printf("  Min: %s%n", Collections.min(listRef));

    }
}
