import java.util.Scanner;
import java.util.Map;

public class Main {
    private static final Map<String, Integer> numberMap = Map.of(
        "one", 1, "two", 2, "three", 3, "four", 4, "five", 5, "six", 6,
        "seven", 7, "eight", 8, "nine", 9, "ten", 10, "eleven", 11, "twelve", 12,
        "thirteen", 13, "fourteen", 14, "fifteen", 15, "sixteen", 16, "seventeen", 17,
        "eighteen", 18, "nineteen", 19, "twenty", 20, "thirty", 30, "forty", 40,
        "fifty", 50, "sixty", 60, "seventy", 70, "eighty", 80, "ninety", 90,
        "hundred", 100, "thousand", 1000, "million", 1000000
    );

    public static int numRet(String input) {
        return numberMap.getOrDefault(input, 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        String input = scanner.nextLine().toLowerCase();
        System.out.println("Output: " + numRet(input));
        scanner.close();
    }
}