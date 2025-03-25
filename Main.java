import java.util.Scanner;

public class Main {
    public static int numRet(String input) {
        String[] words = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", 
                          "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", 
                          "eighteen", "nineteen", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", 
                          "eighty", "ninety", "hundred", "thousand", "million"};
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 30, 40, 50, 60, 70, 80, 90, 100, 1000, 1000000};
        
        for (int i = 0; i < words.length; i++)
            if (words[i].equals(input)) return values[i];
        
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        String input = scanner.nextLine().toLowerCase();
        System.out.println("Output: " + numRet(input));
        scanner.close();
    }
}