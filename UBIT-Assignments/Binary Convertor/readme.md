# Binary Convertor

A simple Java project that converts a decimal integer into its binary representation.

## Project Files

- `BinaryConvertor.java`
  - Reads an integer from the user.
  - Converts the number to binary using repeated division by 2.
  - Prints the binary string.

- `BinaryReturn.java`
  - Reads an integer from the user.
  - Calculates the number of binary digits needed.
  - Uses a helper method to return a binary digit array.
  - Prints each binary digit on a new line.

- `BinaryString.java`
  - Contains a reusable `BinaryStringConvertor(int)` method.
  - Converts an integer to a binary string.
  - Prints the result in a friendly sentence.

## How to Run

Compile and run any of the Java classes using `javac` and `java`:

```bash
javac BinaryConvertor.java
java BinaryConvertor
```

```bash
javac BinaryReturn.java
java BinaryReturn
```

```bash
javac BinaryString.java
java BinaryString
```

## Example

Input:

```text
Enter the Number: 
10
```

Output from `BinaryConvertor`:

```text
1010
```

## Notes

- All programs use `Scanner` to read an integer from standard input.
- `BinaryConvertor` and `BinaryString` print the binary result as a single string.
- `BinaryReturn` prints each binary digit separately from most significant bit to least significant bit.
