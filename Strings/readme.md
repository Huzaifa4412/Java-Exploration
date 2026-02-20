Absolutely. Here's a **complete, in-depth guide and cheat sheet** for **Strings, StringBuilder, and StringBuffer** in **Markdown format**, ready for reference or study. I’ve structured it for **clarity, concepts, methods, and examples**.

---

# Java Strings, StringBuilder & StringBuffer — Complete Guide & Cheat Sheet

---

## Table of Contents

1. [String](#1-string)

   * Definition
   * Memory & Immutability
   * String Pool
   * Common Methods
   * Comparison (`==` vs `.equals()`)
2. [StringBuilder](#2-stringbuilder)

   * Definition & Internal Structure
   * Capacity
   * Key Methods
   * Performance & Use Cases
3. [StringBuffer](#3-stringbuffer)

   * Definition
   * Thread Safety
   * Methods
4. [Comparison Table](#4-comparison-table)
5. [Best Practices](#5-best-practices)
6. [Common Pitfalls](#6-common-pitfalls)
7. [Quick Reference Examples](#7-quick-reference-examples)

---

## 1️⃣ String

### Definition

* `String` is a **class** in `java.lang`
* Represents **immutable sequences of characters**
* **Immutable:** content cannot be changed once created

```java
String s = "Hello";
```

---

### Memory & Immutability

* **Literal:** stored in **String Pool**
* **`new String()`**: creates object in **heap**, not reused
* **Immutability reason:** security, thread safety, string pool optimization

```java
String s1 = "Java";
String s2 = "Java";      // points to same object (pool)
String s3 = new String("Java"); // new object in heap
```

---

### Common Methods

| Method                                        | Description                    | Example                                    |
| --------------------------------------------- | ------------------------------ | ------------------------------------------ |
| `length()`                                    | Number of characters           | `"Hello".length()` → 5                     |
| `charAt(int index)`                           | Character at index             | `"Hello".charAt(1)` → 'e'                  |
| `equals(Object o)`                            | Content comparison             | `"Hi".equals("hi")` → false                |
| `equalsIgnoreCase(String s)`                  | Ignore case                    | `"Hi".equalsIgnoreCase("hi")` → true       |
| `compareTo(String s)`                         | Lexicographical comparison     | `"a".compareTo("b")` → -1                  |
| `contains(CharSequence s)`                    | Checks substring               | `"Java".contains("av")` → true             |
| `startsWith(String s)` / `endsWith(String s)` | Prefix/Suffix check            | `"Java".startsWith("Ja")` → true           |
| `substring(int start, int end)`               | Extract substring              | `"Java".substring(1,3)` → "av"             |
| `toUpperCase()` / `toLowerCase()`             | Change case                    | `"java".toUpperCase()` → "JAVA"            |
| `trim()`                                      | Remove leading/trailing spaces | `" Hello ".trim()` → "Hello"               |
| `replace(char old, char new)`                 | Replace characters             | `"Java".replace('a','o')` → "Jovo"         |
| `split(String regex)`                         | Split by regex                 | `"a,b,c".split(",")` → ["a","b","c"]       |
| `toCharArray()`                               | Convert to char array          | `"Java".toCharArray()` → ['J','a','v','a'] |

---

### Comparison

```java
String a = "Java";
String b = new String("Java");

a == b        // false → checks reference
a.equals(b)   // true  → checks content
```

---

## 2️⃣ StringBuilder

### Definition

* Mutable sequence of characters
* **Not thread-safe**
* Fast for repeated modifications

```java
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");
```

---

### Internal Structure

```
StringBuilder object
char[] value
count = number of characters
capacity = total allocated size
```

* Default capacity: 16
* If exceeded: `(oldCapacity * 2) + 2`

---

### Key Methods

| Method                                  | Description        | Example                  |
| --------------------------------------- | ------------------ | ------------------------ |
| `append(...)`                           | Add at end         | `sb.append("World")`     |
| `insert(int index, ...)`                | Add at index       | `sb.insert(5, "X")`      |
| `delete(int start, int end)`            | Remove range       | `sb.delete(0,2)`         |
| `deleteCharAt(int index)`               | Remove char        | `sb.deleteCharAt(3)`     |
| `replace(int start,int end,String str)` | Replace range      | `sb.replace(0,2,"Hi")`   |
| `reverse()`                             | Reverse string     | `sb.reverse()`           |
| `charAt(int index)`                     | Get char           | `sb.charAt(2)`           |
| `setCharAt(int index, char c)`          | Update char        | `sb.setCharAt(0,'h')`    |
| `length()`                              | Current length     | `sb.length()`            |
| `capacity()`                            | Total capacity     | `sb.capacity()`          |
| `ensureCapacity(int minCapacity)`       | Preallocate memory | `sb.ensureCapacity(100)` |
| `setLength(int newLength)`              | Adjust length      | `sb.setLength(3)`        |
| `substring(int start,int end)`          | Get substring      | `sb.substring(0,5)`      |
| `toString()`                            | Convert to String  | `sb.toString()`          |

---

### Performance & Use Cases

* Loop string concatenation → **use StringBuilder**
* JSON building, logs, SQL generation → **use StringBuilder**
* **Mutable → no new object created**

---

## 3️⃣ StringBuffer

### Definition

* Same as StringBuilder
* **Thread-safe**
* Synchronized methods → slower than StringBuilder

```java
StringBuffer sb = new StringBuffer("Hello");
sb.append(" World");
```

* Methods: exactly same as StringBuilder

---

## 4️⃣ Comparison Table

| Feature     | String                | StringBuilder       | StringBuffer                |
| ----------- | --------------------- | ------------------- | --------------------------- |
| Mutable     | ❌ No                  | ✅ Yes               | ✅ Yes                       |
| Thread-safe | ✅ Yes (immutable)     | ❌ No                | ✅ Yes                       |
| Performance | Slow                  | Fastest             | Medium                      |
| Memory      | New object per change | Same object         | Same object                 |
| Use case    | Constants, configs    | Loops, mutable text | Multi-threaded modification |

---

## 5️⃣ Best Practices

* **Use String** for constant/read-only text
* **Use StringBuilder** for heavy modifications in a single thread
* **Use StringBuffer** for multi-threaded modifications

---

## 6️⃣ Common Pitfalls

* Using `+` in loops → slow → use StringBuilder
* Comparing String with `==` → wrong → use `.equals()`
* Ignoring capacity → may trigger memory copy
* Using StringBuffer unnecessarily in single-threaded code → slower

---

## 7️⃣ Quick Reference Examples

```java
// String
String s = "Hello";
s = s.concat(" World"); // new object
System.out.println(s);  // Hello World

// StringBuilder
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World").append(10).append(true);
System.out.println(sb);  // Hello World10true

// StringBuffer
StringBuffer sbf = new StringBuffer("Start");
sbf.append(" Middle").append(" End");
System.out.println(sbf); // Start Middle End

// insert, delete
sb.insert(5, " INSERT "); 
sb.delete(0, 5);  
sb.deleteCharAt(0);

// reverse
sb.reverse();

// toString
String finalString = sb.toString();
```

---

### ✅ Mental Model

* **String** → immutable, read-only
* **StringBuilder** → mutable, fast, single-thread
* **StringBuffer** → mutable, thread-safe, slower

---

This Markdown sheet covers **everything from core concept → methods → memory → examples → best practices**.

---

