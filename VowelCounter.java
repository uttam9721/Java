import java.util.Scanner;

public class VowelCounter {

    // Function to count the number of vowels in a string
    public static int countVowels(String input) {
        // Convert the string to lowercase to make the vowel checking case-insensitive
        input = input.toLowerCase();

        // Initialize a counter for vowels
        int vowelCount = 0;

        // Loop through each character in the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        return vowelCount;
    }

    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Count the vowels using the countVowels function
        int count = countVowels(input);

        // Display the number of vowels
        System.out.println("The number of vowels is: " + count);

        // Close the scanner to avoid resource leaks
        // scanner.close();
    }
}
