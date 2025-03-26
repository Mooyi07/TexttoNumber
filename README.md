# Text to Number Converter

## Description

This Java program converts a textual representation of numbers (up to one million) into its numerical form. It takes input from the user and returns the corresponding integer value.

## Features

- Converts numbers from "one" to "one million" into integer values.
- Supports compound numbers (e.g., "twenty five", "one hundred fifty").
- Handles both single-word and multi-word number representations.
- Outputs the number formatted with commas for better readability.

## How It Works

1. The user inputs a number in text form.
2. The program processes the input, matching words to numerical values.
3. The program calculates the final integer value based on the structure of the text.
4. The output is displayed in a formatted numerical form.

## Example

**Input:**

```
three hundred forty five
```

**Output:**

```
345
```

## Usage

1. Compile the program:
   ```sh
   javac Main.java
   ```
2. Run the program:
   ```sh
   java Main
   ```
3. Enter a number in words when prompted.
4. The program will return the corresponding integer value.

## Limitations

- Supports numbers only up to one million.
- Does not handle decimals or fractions.
- Does not support ordinal numbers (e.g., "first", "second").

## Author

Mooyi07

