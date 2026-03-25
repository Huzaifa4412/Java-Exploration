---

# 🔹 Java Type Casting, Conversion, and Promotion — Complete Guide

---

## 1️⃣ **Type Promotion in Arithmetic**

### Concept:

* Java arithmetic operations (+, -, *, /) **small types ko int mein promote karta hai**.
* Ye types hain: `byte`, `short`, `char`

**Rule:**

```
byte + byte → int
short + short → int
char + char → int
byte + char → int
```

**Example:**

```java
byte a = 10, b = 20;
int c = a + b;  // ✅ ok
byte d = a + b; // ❌ compile-time error (int → byte needs cast)
```

---

## 2️⃣ **Explicit Type Casting**

### Concept:

* Narrowing conversion (larger → smaller type) **automatic nahi hota**.
* Explicit cast karna zaruri hai.

**Example:**

```java
double d = 9.78;
int i = (int) d; // i = 9 (decimal truncated)
```

* `float → int`, `double → int` or `long` sab explicit chahiye
* Widening conversions (smaller → larger) automatic hote hain:

```java
int x = 5;
long y = x; // ✅ automatic
```

---

## 3️⃣ **Final Constants and Implicit Narrowing**

* Agar variable **final + compile-time constant** ho aur value range mein ho → compiler **implicit narrowing allow karta hai**.

**Example:**

```java
final byte b1 = 5, b2 = 10;
byte b3 = b1 + b2; // ✅ Works, 15 in byte range
```

* Non-final variables → narrowing illegal, cast chahiye.

---

## 4️⃣ **Compound Assignment Operators**

* Operators like `+=, -=, *=, /=` **auto-cast back** karte hain target type mein

```java
byte b = 10;
b += 1;  // ✅ Works, auto-cast
b = b + 1; // ❌ error, b + 1 → int, cast missing
```

* Shortcut for **small types arithmetic assignment**.

---

## 5️⃣ **Overflow and Wrap-around**

* Java **integer types** (byte, short, int, long) ka overflow **silent** hota hai
* Byte example:

```java
byte b = 127;
b += 1; 
System.out.println(b); // -128
```

* 2’s complement ke rules follow hotay hain: `value % (max+1-range)`

**Analogy:** odometer wrap-around

---

## 6️⃣ **Floating-Point vs Integer Casting**

* float/double → int/long → **explicit cast required**
* decimal part truncated

```java
double d = 9.78;
int i = (int) d; // 9
```

* Compound assignment works with floats too:

```java
float f = 1.5f;
f += 2.5f; // ✅ Works
```

---

## 7️⃣ **Mixed-Type Arithmetic**

| Expression Types | Result Type |
| ---------------- | ----------- |
| byte + byte      | int         |
| byte + char      | int         |
| char + char      | int         |
| int + long       | long        |
| long + float     | float       |
| float + double   | double      |

**Rule:** Smaller type **promoted to larger type automatically**.

---

## 8️⃣ **Constants vs Variables in JShell / Compiler**

* JShell (REPL) mein **final constants ka implicit narrowing sometimes fail**
* Normal Java compiler (javac) full class mein constant folding karta hai → implicit narrowing possible

```java
final int x = 10;
byte b = x; // ✅ Works in normal Java class
```

---

## 9️⃣ **Char Arithmetic**

* char + anything → **int result**
* To assign to char → cast required
* Compile-time constant expression of char → sometimes implicit narrowing allowed

```java
char c = 'A';
char d = (char)(c + 1); // ✅ 'B'
```

---

## 🔹 Quick Mental Models

1. **Promotion hierarchy:** byte/short/char → int → long → float → double
2. **Widening → automatic, Narrowing → explicit cast**
3. **Final constants in range → implicit narrowing allowed**
4. **Compound operators (`+=`) → auto cast**
5. **Overflow → wrap-around**
6. **JShell quirks → compile-time constant folding limited**

---

# ✅ Shareable Summary Table

| Operation                | Result Type         | Notes                      |
| ------------------------ | ------------------- | -------------------------- |
| byte + byte              | int                 | auto promotion             |
| byte + char              | int                 | auto promotion             |
| int + long               | long                | auto promotion             |
| long + float             | float               | auto promotion             |
| float + double           | double              | auto promotion             |
| double → int             | ❌ compile error     | cast needed                |
| final constants in range | ✅ narrowing allowed | implicit                   |
| b += 1 (byte)            | ✅ auto cast         | compound assignment        |
| b = b + 1 (byte)         | ❌ error             | int result → explicit cast |

---

# 🔹 Wrap-Up Insight

* Ye concepts **interlinked hain**
* JVM internally **promotes operands to at least int**, overflow wrap-around use karta hai
* Type safety ke liye explicit cast chahiye unless final constants ya compound assignment

---



<br>
<br>
<br>
<br>
<br>
<br>


# 🔹 Java Type Casting & Promotion — MCQ Series

---

## **MCQ 1 — Byte Arithmetic**

```java
byte a = 10;
byte b = 20;
byte c = a + b;
```

### Question:

What happens here?

A) Runs fine → c = 30
B) Compile-time error
C) Runtime error
D) c = 10

---

**Answer:** B) Compile-time error
**Reason:** `byte + byte → int`. Narrowing conversion required → cast needed.

---

## **MCQ 2 — Char Arithmetic**

```java
char a = 'A';
char b = 1;
char c = a + b;
```

### Question:

What happens here?

A) Runs fine → 'B'
B) Compile-time error
C) Runtime error
D) c = 66

---

**Answer:** B) Compile-time error
**Reason:** `char + char → int`. Assign to char → explicit cast required.

---

## **MCQ 3 — Final Constant Narrowing**

```java
final byte b1 = 5;
final byte b2 = 10;
byte b3 = b1 + b2;
```

### Question:

What happens here?

A) Runs fine → b3 = 15
B) Compile-time error
C) Runtime error
D) Depends on JVM

---

**Answer:** A) Runs fine → b3 = 15
**Reason:** Both `b1` and `b2` are final constants. Compile-time constant folding allows implicit narrowing.

---

## **MCQ 4 — Compound Assignment**

```java
byte b = 10;
b += 1;
```

### Question:

What happens here?

A) Compile-time error
B) Runtime error
C) Runs fine → b = 11
D) Depends on JVM

---

**Answer:** C) Runs fine → b = 11
**Reason:** `+=` automatically casts result back to byte.

---

## **MCQ 5 — Byte Overflow**

```java
byte b = 127;
b += 1;
System.out.println(b);
```

### Question:

What is the output?

A) 128
B) Compile-time error
C) -128
D) Runtime error

---

**Answer:** C) -128
**Reason:** Overflow in byte. Silent wrap-around occurs due to 2’s complement representation.

---

## **MCQ 6 — Mixed Types**

```java
int x = 5;
long y = 10;
long z = x + y;
```

### Question:

What happens here?

A) Compile-time error
B) Runs fine → z = 15
C) Runtime error
D) z becomes int

---

**Answer:** B) Runs fine → z = 15
**Reason:** `int + long → long`. Smaller type promoted automatically.

---

## **MCQ 7 — Floating-point to Integer**

```java
double d = 9.78;
int i = d;
```

### Question:

What happens here?

A) Runs fine → i = 9
B) Compile-time error
C) Runtime error
D) i = 10

---

**Answer:** B) Compile-time error
**Reason:** Narrowing conversion from double → int requires explicit cast.

---

## **MCQ 8 — Byte + Char Assignment**

```java
byte b = 5;
char c = 'A';
b = b + c;
```

### Question:

What happens here?

A) Runs fine → b = 70
B) Compile-time error
C) Runtime error
D) b = 65

---

**Answer:** B) Compile-time error
**Reason:** `byte + char → int`. Narrowing assignment → cast required.

---

## **MCQ 9 — Explicit Cast Byte + Char**

```java
final byte b1 = 50;
char c1 = 'A';
byte b2 = (byte)(b1 + c1);
System.out.println(b2);
```

### Question:

What is the output?

A) 115
B) Compile-time error
C) Overflow → negative number
D) Runtime error

---

**Answer:** A) 115
**Reason:** Explicit cast applied. `b1 + c1 = 50 + 65 = 115` → within byte range → fine.

---

## ✅ Wrap-Up

Ye **fresh MCQ series** tumhare friends ke liye bhi practice-friendly hai:

* Har MCQ ek **concept test karta hai**
* Step-by-step **promotion, casting, final constants, compound assignment, overflow** cover hua
* Correct answers + reasoning included → self-study friendly

---


float f = 3.4e38f;
f *= 10;
System.out.println(f);

A) Infinity
B) Compile-time error
C) Runtime error
D) 3.4e39

---


**Answer:** A) Infinity
**Reason:** Float overflow → Infinity.

---

# 🔹 Phase 2 — Advanced MCQs (Type Casting, Promotion, Overflow)

---

## **MCQ 10 — Float + Int**

```java id="p1advq"
int x = 10;
float y = 5.5f;
float z = x + y;
```

### Question:

What is the result type and value of `z`?

A) int → 15
B) float → 15.5
C) double → 15.5
D) Compile-time error

---

**Answer:** B) float → 15.5

**Reason:**

* Mixed types: `int + float` → **int promoted to float**
* Result = `10.0f + 5.5f = 15.5f`
* Assignment to float is fine.

---

## **MCQ 11 — Double to Float Narrowing**

```java id="ad3flt"
double d = 10.5;
float f = d;
```

### Question:

What happens?

A) Runs fine → f = 10.5
B) Compile-time error
C) Runtime error
D) f = 10

---

**Answer:** B) Compile-time error

**Reason:** Narrowing conversion from double → float **requires explicit cast**:

```java id="d8v9py"
float f = (float)d;
```

* Without cast → compiler error.

---

## **MCQ 12 — Final Double Constant**

```java id="fj0n1x"
final double d1 = 5.5;
final double d2 = 4.5;
double d3 = d1 + d2;
```

### Question:

What happens?

A) Runs fine → d3 = 10.0
B) Compile-time error
C) Runtime error
D) Depends on JVM

---

**Answer:** A) Runs fine → d3 = 10.0

**Reason:**

* `final` constants → compile-time constants
* `double + double = double`
* Assignment type matches → no cast required.

---

## **MCQ 13 — Float Overflow**

```java id="t9kfvq"
float f = 3.4e38f;
f *= 10;
System.out.println(f);
```

### Question:

What happens?

A) f = 3.4e39
B) Compile-time error
C) Infinity
D) Runtime error

---

**Answer:** C) Infinity

**Reason:**

* Maximum float = ~3.4028235e38
* Multiplying by 10 → exceeds max → **float overflow → Infinity**
* Java floating-point arithmetic silently produces **Infinity** for overflow.

---

## **MCQ 14 — Mixed Promotion: Byte + Double**

```java id="qk8f3t"
byte b = 10;
double d = 5.5;
double result = b + d;
```

### Question:

What happens?

A) Compile-time error
B) result = 15.5
C) result = 15
D) Runtime error

---

**Answer:** B) result = 15.5

**Reason:**

* `byte + double` → **byte promoted to double**
* Result = 10.0 + 5.5 = 15.5
* Assignment to double → fine.

---

## **MCQ 15 — Explicit Narrowing with Final Constants**

```java id="x1d2cz"
final double d1 = 10.5;
final float f1 = (float)d1;
```

### Question:

What happens?

A) Compile-time error
B) Runs fine → f1 = 10.5
C) Runtime error
D) f1 = 10

---

**Answer:** B) Runs fine → f1 = 10.5

**Reason:**

* Explicit cast `(float)d1` → allowed
* d1 = 10.5 → within float precision → fine
* Final constant ensures no runtime change → safe.

---

## **MCQ 16 — Overflow in Byte + Byte with Cast**

```java id="l2kv0r"
byte b1 = 100;
byte b2 = 50;
byte b3 = (byte)(b1 + b2);
System.out.println(b3);
```

### Question:

What is the output?

A) 150
B) Compile-time error
C) -106
D) Runtime error

---

**Answer:** C) -106

**Reason:**

* `b1 + b2 = 100 + 50 = 150` (int)
* Cast to byte → overflow: 150 - 256 = -106
* Silent wrap-around.

---

## **MCQ 17 — Char + Byte Overflow**

```java id="p0r2zl"
char c = 200;
byte b = 100;
byte result = (byte)(c + b);
System.out.println(result);
```

### Question:

What is the output?

A) 300
B) Compile-time error
C) 44
D) Runtime error

---

**Answer:** C) 44

**Reason:**

* `c + b → 200 + 100 = 300` (int)
* Cast to byte → overflow: 300 % 256 = 44
* JVM silently wraps around using 2’s complement modulo arithmetic.

---

## **MCQ 18 — Final Byte + Byte Beyond Range**

```java id="q3j6zv"
final byte b1 = 120;
final byte b2 = 20;
byte b3 = b1 + b2;
```

### Question:

What happens?

A) Runs fine → 140
B) Compile-time error
C) -116
D) Runtime error

---

**Answer:** B) Compile-time error

**Reason:**

* `b1 + b2 = 120 + 20 = 140` → **out of byte range (-128 to 127)**
* Even though `final` constants, value exceeds range → implicit narrowing **not allowed**
* Compile-time error.

---

## **MCQ 19 — Compound Assignment + Overflow**

```java id="ms2f1q"
byte b = 120;
b += 20;
System.out.println(b);
```

### Question:

Output?

A) 140
B) Compile-time error
C) -96
D) Runtime error

---

**Answer:** C) -96

**Reason:**

* `b += 20` → auto cast `(byte)(120 + 20)`
* 140 → byte overflow → 140 - 256 = -96

---

## **MCQ 20 — Mixed Types Promotion Chain**

```java id="n3kvp2"
byte b = 10;
char c = 'A';
int i = 5;
double d = 2.5;
double result = b + c + i + d;
```

### Question:

What is the result type and value?

A) int → 80
B) double → 82.5
C) float → 82.5
D) Compile-time error

---

**Answer:** B) double → 82.5

**Reason:**

* `b + c → byte + char → int = 10 + 65 = 75`
* `75 + i → 75 + 5 = 80` (int)
* `80 + d → int + double → double = 82.5`
* Result assigned to double → fine

---

✅ Phase 2 MCQs complete.

**Phase 2 Concepts Covered:**

1. Float/Double + Int → promotion
2. Double → Float/Int → explicit cast required
3. Compound assignments with overflow
4. Byte + Byte / Byte + Char → overflow + explicit cast
5. Final constants edge cases
6. Mixed-type promotion chain
7. Wrap-around (2’s complement)
8. Floating-point overflow → Infinity

---
