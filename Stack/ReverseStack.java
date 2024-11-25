package Stack;
import java.util.*;
public class ReverseStack {
   
    public static void main(String[] args) {
        Stack<Integer> s =new Stack<> ();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        // System.out.println(s); 
        Stack<Integer> rev =new Stack<> ();
        while (s.size()>0) {
            rev.push(s.pop());
            rev.push(s.pop());
            
        }
        System.out.println(rev);
        System.out.println(rev);
        
    }
    
}
