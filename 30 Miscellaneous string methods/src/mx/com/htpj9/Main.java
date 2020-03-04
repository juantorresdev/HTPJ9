package mx.com.htpj9;

public class Main {

    public static void main(String[] args) {

        String s1 = "hello";
        String s2 = "GOODBYE";
        String s3 = " spaces ";

        char[] charArrayy = {'a', 'b', 'c', 'd', 'e', 'f'};
        boolean booleanValue = true;
        char characterValue = 'Z';
        int integerValue = 7;
        long longValue = 10000000000L;
        float floatValue = 2.5f;
        double doubleValue = 33.333;
        Object objectRef = "hello";

        System.out.printf("s1 = %s%ns2 = %s%ns3 = %s%n%n", s1, s2, s3);

        System.out.printf("Replace 'l' with 'L' in s1: %s%n%n", s1.replace('l', 'L'));

        System.out.printf("s1.toUpperCase() = %s%n",s1.toUpperCase() );
        System.out.printf("s2.toLowerCase() = %s%n%n", s2.toLowerCase());

        System.out.printf("s3 after trim = \"%s\"%n%n", s3.trim());

        char[] charArray = s1.toCharArray();

        System.out.print("s1 as a character array = ");

        for(char character : charArray)
            System.out.print(character);

        System.out.println();
        System.out.println();

        System.out.printf("char array = %s%n", String.valueOf(charArrayy));
        System.out.printf("part of char array = %s%n", String.valueOf(charArrayy, 3, 3));
        System.out.printf("boolean = %s%n", String.valueOf(booleanValue));
        System.out.printf("char = %s%n", String.valueOf(characterValue));

        System.out.printf("int = %s%n", String.valueOf(integerValue));
        System.out.printf("long = %s%n", String.valueOf(longValue));
        System.out.printf("float = %s%n", String.valueOf(floatValue));
        System.out.printf("double = %s%n", String.valueOf(doubleValue));
        System.out.printf("Object = %s", String.valueOf(objectRef));

    }
}
