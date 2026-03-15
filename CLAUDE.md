# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

This is a Java learning repository (`Java-Exploration`) containing practice code organized by topic. It serves as a beginner-to-intermediate Java tutorial workspace with examples ranging from basic syntax to OOP concepts, matrix operations, and date/time handling.

**Repository is NOT a production project** - it's an educational workspace with mixed code quality and varying levels of completion.

---

## Commands

### Compilation and Execution

```bash
# Compile a single Java file
javac FileName.java

# Run a compiled class
java ClassName

# Compile and run in one command (Java 11+)
java FileName.java

# For files in packages (e.g., Strings/Strings.java)
javac Strings/Strings.java
java Strings.Strings
```

**Important**: The class name must match the filename for public classes. When running compiled classes, use the fully qualified name (package.ClassName).

---

## Architecture and Structure

### Directory Organization

The repository follows a topic-based organization:

- **Root directory**: Basic Java concepts (Variables.java, DataTypes.java, Loops.java, InputOutput.java, TypeCasting.java, HelloWorld.java)
- **Strings/**: String manipulation and StringBuilder examples
- **Matrix-problems/**: 2D array algorithms (MatrixMultiplication.java, MagicSquareMatrix.java)
- **Date And Time Module/**: Java time API examples (DateAndTime.java, DayFinder2026.java)
- **Practise/**: Practice exercises and incomplete code

### Code Conventions Observed

- Most files use **no package declaration** (except `Strings/Strings.java` which uses `package Strings;`)
- Class names match filenames for public classes
- Mixed access modifiers (some classes are package-private)
- Main method pattern: `public static void main(String[] args)`

### Key Patterns

1. **Input handling**: Uses `java.util.Scanner` with `System.in` for user input
2. **Output**: Uses `System.out.println()` for output (note: some files incorrectly use `System.err.println()`)
3. **2D arrays**: Matrix problems use nested loops with `int[][]` syntax
4. **Modern Java**: Date/time module uses `java.time` API (LocalDate) instead of legacy Date class

---

## Important Notes

- **No build system**: This repository uses raw `javac` compilation - no Maven, Gradle, or other dependency management
- **Mixed code quality**: Expect incomplete exercises, commented-out code, and learning experiments
- **Language**: README.md contains Hindi/English mixed content - this is intentional for the learning context
- **Class/file naming**: When creating new files, ensure the public class name matches the filename
- **Package usage**: Only add package declarations if organizing into subdirectories that mirror the package structure
