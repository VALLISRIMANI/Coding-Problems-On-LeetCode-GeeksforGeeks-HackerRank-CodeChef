import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after the integer input
        while (t-- > 0) {
            String expression = scanner.nextLine();
            StringBuilder result = new StringBuilder();
            Stack<Character> myStack = new Stack<>();
            
            for (int i = 0; i < expression.length(); i++) {
                char currentChar = expression.charAt(i);
                if (currentChar >= 'a' && currentChar <= 'z') {
                    result.append(currentChar);
                } else if (currentChar == '(') {
                    myStack.push(currentChar);
                } else if (currentChar == ')') {
                    while (myStack.peek() != '(') {
                        result.append(myStack.pop());
                    }
                    myStack.pop(); // Pop the '(' from the stack
                } else {
                    myStack.push(currentChar);
                }
            }
            System.out.println(result.toString());
        }
        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
