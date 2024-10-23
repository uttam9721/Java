import java.util.ArrayList;

public class Classroom {
    public static void main(String[] args) {
        // ClassName objName = new ClassName
        ArrayList<Integer>list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        // add element 
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        // GET OPERATION
     int ele=   list.get(2);
     System.out.println(ele);

    //  delete
    list.remove(2);
    System.out.println(list);

    // set 
    list.set(2,10);
    System.out.println(list);

    // contains
    System.out.println(list.contains(1));
    System.out.println(list.contains(11));

    list.add(1,20);
    System.out.println(list);
    }    
}
