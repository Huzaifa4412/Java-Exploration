package Strings;

public class PractiseQuestions {

    public static void main(String[] args) {

//         1️⃣ Reverse a String (Basic + StringBuilder)
// Problem: Reverse the given string.
// Input: "Hello World"
// Output: "dlroW olleH"
// Concepts covered:
// String immutability
// charAt() / toCharArray()
// StringBuilder.reverse()
// Looping over string
// Hint: Use StringBuilder for faster reversing in loops.
        // StringBuilder sbuilder = new StringBuilder("Hello world");
        // sbuilder.reverse();
        // System.out.println(sbuilder);
//         2️⃣ Count Vowels & Consonants (Traversal + Condition)
// Problem: Count the number of vowels and consonants in a string.
// Input: "Hello Java"
// Output: Vowels=4, Consonants=6
// Concepts covered:
// Looping through string
// charAt(), Character.toLowerCase()
// Condition checking
// Ignoring spaces / special chars
        // String checkString = "Hello Java";
        // char[] charArray = checkString.toCharArray();
        // String vowel = "aeiou";
        // int vowel_count = 0;
        // int consonant_count = 0;
        // System.out.println(charArray[0]);
        // for (int i = 0; i < checkString.length(); i++) {
        //     if (vowel.contains(String.valueOf(charArray[i]))) {
        //         vowel_count++;
        //     } else if (charArray[i] != ' ') {
        //         consonant_count++;
        //     }
        // }
        // System.out.println("Vowel Count: " + vowel_count + " Consonant Count: " + consonant_count);
        // String.valueOf() in Java is a static, overloaded method of the String class used to convert various data types (primitives and objects) into their string representation. 
        // System.out.println(vowel.contains("h"));
        // System.out.println(String.valueOf("Bilal"));
//         3️⃣ Check Palindrome (String vs StringBuilder)
// Problem: Check if a string is a palindrome.
// Input: "racecar"
// Output: true
// Concepts covered:
// Reversing strings
// equals() vs ==
// String immutability
// Using StringBuilder for comparison
        String s = "race car".replaceAll("\\s",
                "");
        char[] sc = s.toLowerCase().toCharArray();
        String newStr = "";
        for (int i = 0; i < sc.length; i++) {
            if (sc[i] != ' ') {
                newStr = newStr + sc[i];
            }
        }

        if (newStr.equals(s)) {

            System.out.println("Yes, Palindrome");
        } else {
            System.out.println(
                    "No, Not Palindrome"
            );
        }

    }
}
