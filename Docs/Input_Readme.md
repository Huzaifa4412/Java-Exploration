### Scanner in Java — Input lena (Complete & Clear)

`Scanner` Java ka built-in class hai jo **user se input** lena easy banata hai (keyboard, file, etc.). Yahan hum **keyboard input** par focus karenge.

---

## 1. Scanner ko use karne ke liye import

```java
import java.util.Scanner;
```

---

## 2. Scanner object banana

```java
Scanner sc = new Scanner(System.in);
```

**Explanation (Roman Urdu):**

* `System.in` → keyboard se input stream
* `sc` → Scanner ka object jo input read karega

---

## 3. Different types ka input lena

### (a) String input (single word)

```java
System.out.print("Enter your name: ");
String name = sc.next();
System.out.println("Name: " + name);
```

* `next()` → **sirf ek word** leta hai (space aate hi ruk jata)

---

### (b) String input (full line)

```java
System.out.print("Enter your full name: ");
String fullName = sc.nextLine();
System.out.println("Full Name: " + fullName);
```

* `nextLine()` → **poori line** read karta hai (spaces ke sath)

---

### (c) Integer input

```java
System.out.print("Enter age: ");
int age = sc.nextInt();
System.out.println("Age: " + age);
```

---

### (d) Double / Float input

```java
System.out.print("Enter salary: ");
double salary = sc.nextDouble();
System.out.println("Salary: " + salary);
```

---

### (e) Character input

```java
System.out.print("Enter gender (M/F): ");
char gender = sc.next().charAt(0);
System.out.println("Gender: " + gender);
```

---

## 4. Most Common Confusion (⚠ Important)

### Problem:

```java
int age = sc.nextInt();
String name = sc.nextLine(); // BUG
```

### Why problem hota hai?

`nextInt()` **Enter key ka newline (`\n`) leave kar deta hai**, jo `nextLine()` turant read kar leta hai.

### Solution:

```java
int age = sc.nextInt();
sc.nextLine(); // buffer clear
String name = sc.nextLine();
```

---

## 5. Complete Example (Real Program)

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your CGPA: ");
        double cgpa = sc.nextDouble();

        System.out.println("\n--- User Info ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);

        sc.close();
    }
}
```

---

## 6. Scanner methods summary

| Method          | Use         |
| --------------- | ----------- |
| `next()`        | single word |
| `nextLine()`    | full line   |
| `nextInt()`     | integer     |
| `nextDouble()`  | decimal     |
| `nextFloat()`   | float       |
| `nextLong()`    | long        |
| `nextBoolean()` | true/false  |

---

## 7. Scanner kab close karna chahiye?

```java
sc.close();
```

* Jab program ka input ka kaam complete ho jaye
* **Note:** `System.in` close hota hai, is liye ek hi Scanner use karo

---

## 8. Practice Tasks (Tum try karo)

**Task 1:**
User se:

* name
* city
* age

Print karo properly.

**Task 2:**
2 numbers input lo aur:

* sum
* average

**Task 3 (Important):**
Age input lo aur check karo:

* age >= 18 → "Eligible"
* else → "Not Eligible"

---

Agar tum chaho next step mein:

* `BufferedReader vs Scanner`
* `InputMismatchException`
* Real-world form input program

batao, kis level tak jana hai.
