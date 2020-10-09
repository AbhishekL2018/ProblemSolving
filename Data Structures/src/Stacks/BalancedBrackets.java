package Stacks;

import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        System.out.println(checkBalance("[(a+b)+{(c+d)*(e/f)}]")); //true
        System.out.println(checkBalance("[(a+b)+{(c+d)*(e/f)]}")); //false
        System.out.println(checkBalance("[(a+b)+{(c+d)*(e/f)}")); //false
        System.out.println(checkBalance("([(a+b)+{(c+d)*(e/f)}]")); //false
    }

    public static boolean handleClosing(Stack<Character> st, char openingBrace) {
        if (st.size() == 0) {
            return false;
        } else if (st.peek() != openingBrace) {
            return false;
        } else {
            st.pop();
            return true;
        }
    }

    public static boolean checkBalance(String sequenece) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < sequenece.length(); i++) {
            char ch = sequenece.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (ch == ')') {
                    boolean value = handleClosing(st, '(');
                    if (value == false) {
                        return false;
                    }
                } else if (ch == '}') {
                    boolean value = handleClosing(st, '{');
                    if (value == false) {
                        return false;
                    }
                } else if (ch == ']') {
                    boolean value = handleClosing(st, '[');
                    if (value == false) {
                        return false;
                    }
                }
            }
        }
        if (st.size() != 0) {
            return false;
        }
        return true;
    }
}
