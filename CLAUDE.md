# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

Educational Java repository (beginner-to-intermediate) organized by topic. **Not a production project** — expect incomplete exercises, commented-out code, and learning experiments. README.md uses Hindi/English mixed content intentionally.

---

## Commands

### Standalone files (majority of the repo)

```bash
# Compile and run separately
javac FileName.java && java ClassName

# Single-command run (Java 11+)
java FileName.java

# Files with package declarations (must run from parent of package dir)
javac Strings/Strings.java && java Strings.Strings
javac OOPs/Package/Main.java && java Package.Main
```

### Maven subproject (Maven-Exploration/demo/)

```bash
cd Maven-Exploration/demo
mvn compile exec:java          # compile & run main class (com.example.App)
mvn test                       # run JUnit 4 tests
```

### Gradle subproject (Projects/app/)

```bash
cd Projects
./gradlew run                  # run main class (org.example.App)
./gradlew test                 # run JUnit Jupiter tests
```

---

## Architecture and Structure

Topic-based flat organization. Each subdirectory is a self-contained topic module:

- **Root**: Core Java basics (Variables, DataTypes, InputOutput, TypeCasting, Factorials, HelloWorld)
- **Loops/**: Loop constructs and nested loop examples
- **Arrays/**: Array operations (IntroArray, MaxValueFinder, SumOfArray, SearchingArray)
- **Strings/**: String manipulation and StringBuilder — uses `package Strings;`
- **OOPs/**: Object-oriented programming (classes, constructors, `static`, `this` keyword, packages)
- **Matrix-problems/**: 2D array algorithms (multiplication, magic square)
- **Date And Time Module/**: `java.time` API examples
- **File-Handling/**: File I/O with FileWriter and BufferedReader
- **Projects/**: Gradle-based project scaffold (Java 21, Guava, JUnit Jupiter)
- **Maven-Exploration/demo/**: Maven-based project scaffold (Java 17, JUnit 4, Jansi)
- **UBIT-Assignments/**: University assignments (binary conversion)
- **Practise/**: Incomplete practice exercises

### Compilation gotchas

- **Class name conflicts in OOPs/**: Multiple files (`CommanMistakes.java`, `TestCase.java`, `ThisKeyWord.java`) each define a package-private class named `Test`. These files **cannot be compiled together** — compile and run them individually.
- **`System.err` vs `System.out`**: Several OOPs files use `System.err.println()` where `System.out.println()` was likely intended. Both work but `err` output may appear out of order with `out`.
- Class name must match filename for `public` classes. Helper classes in the same file must be package-private (no `public` modifier).
- Most files have **no package declaration**. Only `Strings/`, `OOPs/Package/`, and `OOPs/Package1/` use packages.
