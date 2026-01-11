
---

# Java Complete Tutorial (Beginner → Intermediate)

---

## 1️⃣ Environment Setup

### Step 1: Install Java JDK

1. Visit [Adoptium OpenJDK](https://adoptium.net/) or [Oracle JDK](https://www.oracle.com/java/technologies/javase-downloads.html)
2. Download latest **LTS version** (e.g., Java 21)
3. Run installer and follow instructions

### Step 2: Verify Installation

Open terminal and type:

```bash
java -version
javac -version
```

Output me installed version dikhni chahiye.

---

### Step 3: Install VS Code & Java Extension

1. Install [VS Code](https://code.visualstudio.com/)
2. Go to **Extensions → Java Extension Pack**

   * Installs Language support, Debugger, Maven/Gradle support
3. Open folder for Java projects
4. Configure **JDK path** if needed:

   * `Ctrl+Shift+P → Java: Configure Java Runtime`

---

## 2️⃣ Your First Java Program

Create file: `Main.java`

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Java World!");
    }
}
```

### Compile & Run

```bash
javac Main.java
java Main
```

Output:

```
Hello, Java World!
```

**Explanation:**

* `class Main` → Java me har program class ke andar hota hai
* `main` → Entry point
* `System.out.println()` → Prints to console

---

## 3️⃣ Java Basics

### 3.1 Variables & Data Types

```java
int age = 25;
double price = 99.99;
float weight = 70.5f;
boolean isJavaFun = true;
char grade = 'A';
String name = "Ali";
```

### 3.2 Operators

* Arithmetic: `+ - * / %`
* Relational: `> < == != >= <=`
* Logical: `&& || !`

---

### 3.3 Input Using Scanner

```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);

System.out.print("Enter your age: ");
int age = sc.nextInt();

System.out.print("Enter your name: ");
sc.nextLine(); // consume newline
String name = sc.nextLine();

System.out.printf("Hello %s, age %d%n", name, age);

sc.close();
```

---

### 3.4 Conditional Statements

```java
if (age >= 18) {
    System.out.println("Adult");
} else if (age >= 13) {
    System.out.println("Teen");
} else {
    System.out.println("Child");
}
```

---

### 3.5 Loops

#### For Loop

```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Count: " + i);
}
```

#### While Loop

```java
int i = 1;
while (i <= 5) {
    System.out.println("Count: " + i);
    i++;
}
```

#### Do-While Loop

```java
int i = 1;
do {
    System.out.println("Count: " + i);
    i++;
} while (i <= 5);
```

---

### 3.6 Arrays

```java
int[] numbers = {1, 2, 3, 4, 5};

for (int num : numbers) {
    System.out.println(num);
}
```

---

### 3.7 Methods / Functions

```java
public class Main {

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result = add(5, 7);
        System.out.println("Sum = " + result);
    }
}
```

---

### 3.8 String Operations

```java
String name = "Ali";
System.out.println(name.length());       // 3
System.out.println(name.toUpperCase());  // ALI
System.out.println(name.charAt(0));      // A
```

---

### 3.9 printf() / Formatting

```java
double salary = 12345.6789;
System.out.printf("Salary: %.2f%n", salary); // 2 decimals
System.out.printf("%-10s %-10s%n", "Name", "Age");
System.out.printf("%-10s %-10d%n", "Ali", 25);
```

---

### 3.10 Float vs Double

```java
float f = 3.14f;       // 32-bit
double d = 3.141592;   // 64-bit
System.out.println(f);
System.out.println(d);
```

* **double** → more precise, default for decimals
* **float** → less memory, rarely used

---

### 3.11 Calculations Example: Original Price from Discount

```java
Scanner sc = new Scanner(System.in);

System.out.print("Enter discounted price: ");
double sp = sc.nextDouble();

System.out.print("Enter discount %: ");
double discount = sc.nextDouble();

double originalPrice = sp / (1 - discount / 100.0);
System.out.printf("Original price = %.2f%n", originalPrice);

sc.close();
```

---

## 4️⃣ Next Steps (Intermediate)

1. **OOP Basics**

   * Classes & Objects
   * Constructors
   * Encapsulation (getters/setters)
2. **Advanced Loops & Arrays**

   * 2D arrays
   * Nested loops
3. **Exception Handling**

   * try-catch
   * finally
4. **Collections Framework**

   * ArrayList, HashMap
5. **File I/O**

   * Reading/writing text files

---

### 5️⃣ Practice Tasks

1. Calculate factorial of a number
2. Reverse a string / number
3. Even/Odd checker
4. Create a mini calculator with methods
5. Table printing using loops & printf

---

### 6️⃣ Tips for Beginners

* Always close Scanner
* Use **printf** for neat output
* Comment your code
* Follow **Java naming conventions**

---

Perfect! Ab main **Next Step: Intermediate → Advanced Java (OOP + Projects)** tutorial add kar deta hoon. Isme **Object-Oriented Programming (OOP), Inheritance, Polymorphism, Interfaces, Collections, Exception Handling** aur **mini-project examples** included hain.

---

# Java Intermediate → Advanced Tutorial (OOP + Projects)


## 1️⃣ Object-Oriented Programming (OOP) Basics

Java is **object-oriented**, iska matlab:

1. **Class** → Blueprint / template
2. **Object** → Instance of a class

### Example: Class & Object

```java
class Car {
    String color;
    String model;

    // Constructor
    Car(String color, String model) {
        this.color = color;
        this.model = model;
    }

    void displayInfo() {
        System.out.println("Car Model: " + model + ", Color: " + color);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Red", "Toyota");
        Car car1.displayInfo();
    }
}
```

---

### Key Concepts

| Concept       | Explanation                                                   |
| ------------- | ------------------------------------------------------------- |
| Encapsulation | Private variables + getters/setters                           |
| Abstraction   | Hide implementation details using abstract classes/interfaces |
| Inheritance   | Child class inherits properties/methods from parent           |
| Polymorphism  | Same method behaves differently (Compile-time/Run-time)       |

---

## 2️⃣ Inheritance

```java
class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike started");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.start(); // Vehicle started

        Bike b = new Bike();
        b.start(); // Bike started → Overriding
    }
}
```

---

## 3️⃣ Polymorphism

### 3.1 Compile-time (Method Overloading)

```java
class Calculator {
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 10));
        System.out.println(calc.add(5.5, 10.3));
    }
}
```

### 3.2 Run-time (Method Overriding)

Example → Inheritance section above

---

## 4️⃣ Interfaces & Abstract Classes

```java
interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Bark!");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound(); // Bark!
    }
}
```

---

## 5️⃣ Collections Framework

* **ArrayList** → Dynamic arrays
* **HashMap** → Key-Value pairs

### Example: ArrayList

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
```

---

### Example: HashMap

```java
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("Ali", 90);
        marks.put("Sara", 85);

        System.out.println(marks.get("Ali")); // 90
    }
}
```

---

## 6️⃣ Exception Handling

```java
try {
    int result = 10 / 0; // Division by zero
} catch (ArithmeticException e) {
    System.out.println("Error: " + e.getMessage());
} finally {
    System.out.println("This runs always");
}
```

---

## 7️⃣ File I/O

```java
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello Java File I/O!");
            writer.close();

            BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
            String line = reader.readLine();
            System.out.println(line);
            reader.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
```

---

## 8️⃣ Mini Projects

### 8.1 Bank Account System

* Classes: Account, Customer, Bank
* Features: Deposit, Withdraw, Check balance
* Practice loops, methods, OOP

### 8.2 Student Grading System

* Class: Student
* Input marks → Calculate total, percentage, grade
* Use ArrayList for multiple students

### 8.3 Inventory Management

* Class: Product
* HashMap → Product Name → Quantity
* Add, Remove, Update, Display Products

---

## 9️⃣ Next Step: Advanced Topics

1. **Generics** → Type-safe collections
2. **Multithreading** → Thread, Runnable
3. **Lambda Expressions** → Functional programming
4. **Streams API** → Advanced data manipulation
5. **Networking** → Sockets, HTTP requests
6. **GUI** → JavaFX, Swing

---

## 10️⃣ Practice Tips

* Har concept ke liye **mini program** banao
* Use VS Code **Debugger** → breakpoints, step-over, step-into
* Try **real-world problems** → bank system, calculator, student app
* Document code & comment properly

---

Ye **Next Step tutorial** intermediate → advanced topics cover karta hai aur **real project-based learning** ke liye tayar karta hai.

Agar chaho to main **“Complete Project Roadmap + Daily Assignments in Java”** bhi bana doon, jisme beginner se advanced tak **step-by-step tasks + projects** cover hon.

Kya main wo bana doon?
