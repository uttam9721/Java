import java.util.*;
public class Max {
    public static void main(String[] args) {
        int max=Integer.MIN_VALUE;
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(2);
        list.add(4);
        list.add(3);
        // System.out.println(list.size());

        // print the arraylist
        for (int i =0; i< list.size() ; i++) {
            // System.out.print(list.get(i)+ " ");
            if(max<list.size()){
                max=list.size();
            }
        }
        System.out.print(max);
        // System.out.println();
    }
    
}
