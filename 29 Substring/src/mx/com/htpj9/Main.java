package mx.com.htpj9;

public class Main {

    public static void main(String[] args) {

        String letters = "abcdefghijklmabcdefghijklm";
        String s1 = "Happy ";
        String s2 = "Birthday";

        System.out.printf("'c' is located at index %d%n", letters.indexOf('c'));
        System.out.printf("'a' is located at index %d%n", letters.indexOf('a', 1));
        System.out.printf("'$' is located at index %d%n%n", letters.indexOf('$'));

        System.out.printf("Last 'c' is located at index %d%n", letters.lastIndexOf('c'));
        System.out.printf("Last 'a' is located at index %d%n", letters.lastIndexOf('a', 25));
        System.out.printf("Last '$' is located at index %d%n%n", letters.indexOf('$'));

        System.out.printf("\"def\" is located at index %d%n",  letters.indexOf("def"));
        System.out.printf("\"def\" is located at index %d%n",  letters.indexOf("def", 7));
        System.out.printf("\"hello\" is located at index %d%n%n", letters.indexOf("hello"));

        System.out.printf("Last \"def\" is located at index %d%n", letters.lastIndexOf("def"));
        System.out.printf("Last \"def\" is located at index %d%n", letters.lastIndexOf("def", 25));
        System.out.printf("Last \"hello\" is located at index %d%n", letters.lastIndexOf("hello"));

        System.out.printf("%nSubstring from index 20 to end is \"%s\"%n", letters.substring(20));
        System.out.printf("%s \"%s\"%n", "Substring from index 3 up to, but no including 6 is", letters.substring(3, 6));

        System.out.printf("%ns1 = %s %ns2 = %s", s1, s2);
        System.out.printf("%n%s", s1.concat(s2));



    }
}
