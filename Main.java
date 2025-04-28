// Text to Number by Mooyi07
import java.util.Scanner;

public class Main {

    private static final String[] WORDS = {
        "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
        "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
        "eighteen", "nineteen", "twenty", "thirty", "forty", "fifty", "sixty", "seventy",
        "eighty", "ninety", "hundred", "thousand", "million"
    };

    private static final int[] VALUES = {
        1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
        11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
        30, 40, 50, 60, 70, 80, 90, 100, 1000, 1000000
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input: ");
        String input = scanner.nextLine().toLowerCase();

        int output = parseTextToNumber(input);
        System.out.println("Output: " + String.format("%,d", output));

        scanner.close();
    }

    private static int parseTextToNumber(String input) {
        String[] words = input.split(" ");
        int total = 0;
        int temp = 0;

        for (String word : words) {
            int value = wordToNumber(word);

            if (value == 100 || value == 1000 || value == 1000000) {
                temp *= value;
            } else {
                temp += value;
            }

            if (value >= 1000) {
                total += temp;
                temp = 0;
            }
        }
        return total + temp;
    }

    private static int wordToNumber(String word) {
        for (int i = 0; i < WORDS.length; i++) {
            if (WORDS[i].equals(word)) {
                return VALUES[i];
            }
        }
        return 0;
    }
}
