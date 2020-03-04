package mx.com.htpj9;

public class Main {

    public static void main(String[] args) {

        char[] charArray = {'b', 'i', 'r', 't', 'h', ' ', 'd', 'a', 'y'};
        String s = new String("hello");

        String s1 = new String();
        String s2 = new String(s);
        String s3 = new String(charArray);
        String s4 = new String(charArray, 6, 3);

        System.out.printf("s1 = %s\n", s1);
        System.out.printf("s2 = %s\n", s2);
        System.out.printf("s3 = %s\n", s3);
        System.out.printf("s4 = %s\n", s4);

    }
}
