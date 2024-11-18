package Stack;
import java.util.*;
public class Basic {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        // push 
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);

        // peek
        System.out.println(st.peek());
        System.out.println(st);
        st.pop();
        System.out.println(st);
    }
}