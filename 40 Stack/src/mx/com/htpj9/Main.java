package mx.com.htpj9;

import java.util.EmptyStackException;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Number> stack = new Stack<>();

        stack.push(12L);
        System.out.println("Pushed 12L");
        stack.push(34567);
        System.out.println("Pushed 34567");
        printStack(stack);
        stack.push(1.0F);
        System.out.println("Pushed 1.0F");
        printStack(stack);
        stack.push(1234.5678);
        System.out.println("Pushed 1234.5678");
        printStack(stack);

        try{
            Number removedObject = null;

            while(true){
                removedObject = stack.pop();
                System.out.printf("Popped %s%n", removedObject);
                printStack(stack);
            }
        } catch(EmptyStackException ese){
            ese.printStackTrace();
        }
    }

    private static void printStack(Stack<Number> stack){

        if(stack.isEmpty()){
            System.out.printf("Stack is Empty%n%n");
        } else{
            System.out.printf("Stack contains: %s (top)%n", stack);
        }

    }
}
