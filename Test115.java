//Validate Parentheses

public class Test115 {
    public static void main(String[] args) {

        String letters = "({[]})";

        char[] stack = new char[letters.length()];
        int top = -1;

        boolean valid = true;

        for (int i = 0; i < letters.length(); i++) {
            char ch = letters.charAt(i);

            // opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                top++;
                stack[top] = ch;
            }
            // closing brackets
            else {
                if (top == -1) {
                    valid = false;
                    break;
                }

                char last = stack[top];
                top--;

                if ((ch == ')' && last != '(') ||
                        (ch == '}' && last != '{') ||
                        (ch == ']' && last != '[')) {
                    valid = false;
                    break;
                }
            }
        }

        if (top != -1) {
            valid = false;
        }

        if (valid) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}