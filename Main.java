// Text to Number by Mooyi07
import java.util.Scanner;

public class Main {
    public static int numRet(String input) {
        // up to million only since it is INTEGER data type
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
        int output = 0;

        // prevention of uppercase formats
        String input = scanner.nextLine().toLowerCase();

        // Checking if the input has spaces, if so then splits into arrays.
        if (!input.contains(" ")){
            output = numRet(input);
        } else {
            String[] myArray = input.split(" ");
            
            for (int i = 0; i < myArray.length; i++){
                int returnVal = numRet(myArray[i]);
                if (returnVal > 99){
                    output = output + (numRet(myArray[i-1]) * numRet(myArray[i])); 
                }
                if ((myArray.length-2) <= i && returnVal < 91){
                    output = output + numRet(myArray[i]);
                }
            }
        }

        System.out.println("Output: " + String.format("%,d", output));
        scanner.close();
    }
}