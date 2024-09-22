import java.util.*;
public class Main {
    public static void prontlatter(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // char arr[]={'a','b','c','d'};
        // String str = "abcd";
        // String str2 = new String("xyz");
        // Scanner sc =new Scanner(System.in);
        // System.out.println("Enter the string");
        // String name = sc.nextLine();
        // System.out.println(name);

        // String fullName = "Uttam";
        // System.out.println(fullName.length());
        // concatenation
        String fn="Uttam";
        String ln="Maurya";
        String fullName = fn + " " + ln;
        // System.out.println(fullName.charAt(0));
        // .charAt using to catch index value 
        prontlatter(fullName);

    }
    
}
