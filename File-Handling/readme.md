
---

## 1️⃣ Java File Handling Basics

Java mein file handling mainly **`java.io`** aur **`java.nio`** packages se hoti hai. Hum **text files** aur **binary files** dono handle kar sakte hain.

### Common Classes:

| Class                   | Use                                                                              |
| ----------------------- | -------------------------------------------------------------------------------- |
| `File`                  | Represents a file or directory, can check existence, create/delete, get metadata |
| `FileReader`            | Read characters from text files                                                  |
| `FileWriter`            | Write characters to text files                                                   |
| `BufferedReader`        | Efficient reading of large files line by line                                    |
| `BufferedWriter`        | Efficient writing with buffering                                                 |
| `Scanner`               | Read data easily from files, also tokenize input                                 |
| `Files` (java.nio.file) | Modern API, simple, fast, supports reading/writing all at once                   |
| `Path`                  | Represents a file path in java.nio                                               |

---

### 1.1 Create a File

```java
import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

**Internal working:**

* `new File(...)` just creates an object in memory (path abstraction).
* `createNewFile()` actually touches the filesystem.
* Throws `IOException` if path invalid or permissions missing.

---

### 1.2 Writing to a File

#### Simple `FileWriter`:

```java
import java.io.FileWriter;
import java.io.IOException;

public class WriteDemo {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("example.txt")) {
            writer.write("Hello, Java File Handling!\n");
            writer.write("Second line");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

**Key points:**

* Try-with-resources ensures `close()` is called automatically.
* `FileWriter` overwrites by default; `FileWriter("file.txt", true)` → append mode.

#### BufferedWriter (for efficiency):

```java
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriteDemo {
    public static void main(String[] args) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("example.txt", true))) {
            bw.write("Buffered write line\n");
        }
    }
}
```

**Why BufferedWriter?**

* Writes in chunks → reduces IO calls → better performance for large files.

---

### 1.3 Reading from a File

#### Using `Scanner`:

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadDemo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new File("example.txt"))) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
```

#### Using `BufferedReader`:

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReadDemo {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("example.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
```

**BufferedReader vs Scanner:**

* `Scanner` → tokenizing support, parsing ints/doubles easily.
* `BufferedReader` → faster for large files, reads line by line.

---

### 1.4 Modern Java NIO (v1.7+)

```java
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;

public class NioDemo {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("example.txt");

        // Read all lines at once
        List<String> lines = Files.readAllLines(path);
        lines.forEach(System.out::println);

        // Write all lines at once
        Files.write(path, List.of("Line 1", "Line 2"));
    }
}
```

**Why NIO?**

* Simple, modern, thread-safe, better for large file operations.
* Can handle paths, symbolic links, file attributes easily.

---

## 2️⃣ Best Practices in Java File Handling

1. **Always use try-with-resources**

   * Ensures file handles are closed → avoids memory leaks.

   ```java
   try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) { ... }
   ```

2. **Handle exceptions properly**

   * Catch `IOException`, `FileNotFoundException` etc.
   * Log the error; avoid silent failures.

3. **Prefer NIO for modern applications**

   * Faster, concise, better API (`Files`, `Path`).

4. **Avoid hardcoding paths**

   * Use `Paths.get(System.getProperty("user.home"), "file.txt")`.

5. **Use Buffered streams for large files**

   * BufferedReader/BufferedWriter → reduces system calls → faster.

6. **Check file existence before operations**

   ```java
   File file = new File("file.txt");
   if (!file.exists()) {
       System.out.println("File not found!");
   }
   ```

7. **Append vs overwrite**

   * Default `FileWriter` overwrites. Always specify `true` for append if needed.

8. **Be careful with encoding**

   * Default charset may differ by system → specify explicitly if needed:

   ```java
   Files.writeString(path, "Hello", StandardCharsets.UTF_8);
   ```

9. **Avoid reading entire large files into memory**

   * Stream line by line for huge files to save RAM.

10. **Thread safety**

    * Don’t share FileWriter/Reader across threads without synchronization.

---

## 3️⃣ Real-World Example

**Task:** Read a CSV of sales data, compute total sales, append summary to a new file.

```java
import java.io.*;
import java.util.Scanner;

public class SalesSummary {
    public static void main(String[] args) {
        double totalSales = 0.0;

        try (Scanner sc = new Scanner(new File("sales.csv"))) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] parts = line.split(",");
                double sale = Double.parseDouble(parts[1]);
                totalSales += sale;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("summary.txt", true))) {
            bw.write("Total Sales: " + totalSales + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

**Highlights:**

* Reads line by line → memory efficient.
* Splits CSV → simple parsing.
* Appends result → avoids overwriting old summaries.

---

### ✅ Summary

* Java File Handling: `java.io` (classic) + `java.nio` (modern, preferred).
* Always **close resources** → try-with-resources.
* Use **Buffered streams** for efficiency.
* Handle exceptions properly.
* Avoid hardcoded paths; prefer **Path** objects.
* For large files → **streaming**, not `readAllLines`.

---


Perfect, Coder 69. Chalo Java **File Handling** ko full-depth explore karte hain, step-by-step, memory, performance, internal working aur real-world **project ideas** ke saath. Main tumhare level ke hisaab se ye structure bana raha hoon: **Basics → Intermediate → Advanced → Projects & Best Practices**.

---

## **1️⃣ Basics of File Handling in Java**

### 1.1 File Representation

Java mein **file handling** ka starting point hai `File` class (`java.io.File`):

```java
File file = new File("example.txt");
```

* Ye **sirf file ka reference object** banata hai, filesystem pe koi file create nahi hoti.
* File ka path **relative** ya **absolute** ho sakta hai.
* Methods:

  * `exists()`, `isFile()`, `isDirectory()`
  * `createNewFile()`, `delete()`
  * `getName()`, `length()`

**Memory behavior:**

* `File` object sirf JVM memory mein hota hai.
* Disk space sirf `createNewFile()` call ke baad occupy hoti hai.

---

### 1.2 Writing to a File

**FileWriter:**

* Writes **characters**, overwrite by default.
* Can append with `FileWriter(file, true)`.

```java
try (FileWriter writer = new FileWriter("example.txt")) {
    writer.write("Hello World\n");
} catch(IOException e) {
    e.printStackTrace();
}
```

**BufferedWriter:**

* Writes in **chunks**, faster for large files.
* Internal buffer (default 8KB) → system calls kam.

```java
try (BufferedWriter bw = new BufferedWriter(new FileWriter("example.txt", true))) {
    bw.write("Buffered Write\n");
}
```

**Best Practice:** Use **try-with-resources** → automatic closing, no memory leak.

---

### 1.3 Reading from a File

**Scanner vs BufferedReader**

```java
// Scanner - tokenizing easy
Scanner sc = new Scanner(new File("example.txt"));
while(sc.hasNextLine()){
    System.out.println(sc.nextLine());
}

// BufferedReader - faster for large files
BufferedReader br = new BufferedReader(new FileReader("example.txt"));
String line;
while((line = br.readLine()) != null){
    System.out.println(line);
}
```

**Internal working:**

* `FileReader` reads 1 char at a time → slow.
* `BufferedReader` uses 8KB buffer → reads chunks from disk → memory efficient.

---

### 1.4 Modern Approach: Java NIO

* Classes: `Files`, `Path`, `Paths`
* Supports **readAllLines**, **write**, **streaming**, symbolic links, attributes.

```java
Path path = Paths.get("example.txt");

// Read all lines
List<String> lines = Files.readAllLines(path);
lines.forEach(System.out::println);

// Write lines
Files.write(path, List.of("Line 1", "Line 2"), StandardOpenOption.APPEND);
```

**Benefits:**

* Thread-safe
* Clean API
* Better performance for big files

---

## **2️⃣ Intermediate Concepts**

### 2.1 Handling Binary Files

* Use `FileInputStream` & `FileOutputStream`
* Works with images, PDFs, videos
* Example:

```java
try (FileInputStream fis = new FileInputStream("image.png");
     FileOutputStream fos = new FileOutputStream("copy.png")) {
    
    byte[] buffer = new byte[1024];
    int bytesRead;
    while((bytesRead = fis.read(buffer)) != -1){
        fos.write(buffer, 0, bytesRead);
    }
}
```

**Memory behavior:**

* Reads 1KB chunks → low memory footprint
* Efficient for large files

---

### 2.2 CSV Handling (Text Parsing)

* Common in real apps: sales, users, logs
* Split using `String.split(",")` or use libraries like `OpenCSV`

```java
String[] parts = line.split(",");
String name = parts[0];
double sale = Double.parseDouble(parts[1]);
```

---

### 2.3 Exception Handling & Best Practices

* Always handle `IOException`, `FileNotFoundException`
* Log errors, avoid program crash
* Avoid hardcoded paths
* Specify **charset** for cross-platform consistency:

```java
Files.writeString(path, "Hello", StandardCharsets.UTF_8);
```

---

## **3️⃣ Advanced Concepts**

### 3.1 File Streams & Memory Optimization

* For **huge files**, never use `readAllLines` → memory hog.
* Use **streaming**:

```java
Files.lines(Paths.get("bigfile.txt"))
     .filter(line -> line.contains("Java"))
     .forEach(System.out::println);
```

* Lazy evaluation → memory-efficient

### 3.2 Multi-threaded File Handling

* Multiple threads can read → safe
* Writing needs **synchronization**:

```java
synchronized(fileWriter){
    fileWriter.write("Thread-safe write\n");
}
```

### 3.3 Temporary Files

* `Files.createTempFile()` → useful for caching or temp processing
* JVM deletes on exit

---

## **4️⃣ Real-World Project Ideas**

1. **Sales Summary System**

   * Read `sales.csv`, calculate totals, append summary.
   * Use: FileReader, BufferedWriter, Scanner

2. **Log File Analyzer**

   * Read large log files → filter by error/warning → output summary.
   * Use: `Files.lines()` streaming

3. **CSV to JSON Converter**

   * Read CSV → parse → write JSON file
   * Libraries: `Jackson` or manual parsing

4. **File Backup Utility**

   * Copy files/folders → rename by timestamp
   * Binary streams, NIO `Files.copy()`

5. **Student Report Generator**

   * Input: CSV with marks
   * Output: summary per student in text file
   * Use: Exception handling, FileWriter/BufferedWriter

---

## **5️⃣ File Handling Flowchart**

```
File Handling in Java
├── Text Files
│   ├── FileReader / FileWriter
│   └── BufferedReader / BufferedWriter
├── Binary Files
│   ├── FileInputStream / FileOutputStream
│   └── BufferedInputStream / BufferedOutputStream
├── Modern NIO
│   ├── Path / Paths
│   └── Files (read/write/stream)
├── Advanced
│   ├── CSV Parsing
│   ├── Streaming Large Files
│   └── Multi-threaded handling
```

---

## **6️⃣ Summary of Best Practices**

* **Always close resources** → try-with-resources
* **Buffered streams** for performance
* **Exception handling** → catch + log
* **Avoid hardcoded paths** → use Path
* **Streaming for huge files** → memory optimization
* **Charset awareness** → StandardCharsets.UTF_8
* **Thread safety** → synchronize writes

---



