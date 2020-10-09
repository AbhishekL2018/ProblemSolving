package Stacks;

import java.util.*;

public class NormalStackOperations {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println(st);
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st);
        st.pop();
        st.pop();
        System.out.println(st);
        System.out.println(st.peek());
        st.pop();
        System.out.println(st);
        //System.out.println(st.peek()); ---> empty stack peek will throw exception
    }
}
