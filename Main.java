import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final Map<String, Integer> numberMap = new HashMap<>();

    static {
        numberMap.put("one", 1); numberMap.put("two", 2); numberMap.put("three", 3); numberMap.put("four", 4); numberMap.put("five", 5);
        numberMap.put("six", 6); numberMap.put("seven", 7); numberMap.put("eight", 8); numberMap.put("nine", 9); numberMap.put("ten", 10);
        numberMap.put("eleven", 11); numberMap.put("twelve", 12); numberMap.put("thirteen", 13); numberMap.put("fourteen", 14); numberMap.put("fifteen", 15);
        numberMap.put("sixteen", 16); numberMap.put("seventeen", 17); numberMap.put("eighteen", 18); numberMap.put("nineteen", 19); numberMap.put("twenty", 20);
        numberMap.put("thirty", 30); numberMap.put("forty", 40); numberMap.put("fifty", 50); numberMap.put("sixty", 60); numberMap.put("seventy", 70);
        numberMap.put("eighty", 80); numberMap.put("ninety", 90); numberMap.put("hundred", 100); numberMap.put("thousand", 1000); numberMap.put("million", 1000000);
    }

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
