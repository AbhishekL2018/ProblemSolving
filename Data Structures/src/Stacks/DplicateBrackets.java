package Stacks;

import java.util.Stack;

public class DplicateBrackets {
    public static void main(String[] args) {
        String expression = "(a+b)+((c+d))";
        //String expression = "((a+b)+(c+d))";
        System.out.println(DplicateBrackets.calculateDuplicate(expression));
    }
    public static boolean calculateDuplicate(String expression){
        Stack<Character> st =new Stack();
        for(int i=0; i<expression.length(); i++){
            if(expression.charAt(i)==')'){
                if(st.peek()=='('){
                    return true;
                }else {
                    while(st.peek()!='('){
                        st.pop();
                    }
                    st.pop();
                }
            }else{
                st.push(expression.charAt(i));
            }
        }
        return false;
    }
}
