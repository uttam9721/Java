import java.util.Scanner;

/**
 * vovel
 */
public class vovel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word");
        String input = scanner.nextLine();
        input = input.toLowerCase();
        int count =0;
        for (int i = 0; i < input.length(); i++) {
            char ch =input.charAt(i);
            if (ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u') {
                count++;
                
            }
            
        }
        System.out.println("the output is"+count);
    }
}
//jnput      computer 
//output 3