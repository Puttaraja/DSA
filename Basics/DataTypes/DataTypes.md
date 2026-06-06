# 📌 Data Types in Java

In Java, **data types** define the type of data a variable can store.  
They specify **size, range, and behavior** of the data.  

Java supports **two main categories** of data types:  
1. **Primitive Data Types**  
2. **Non-Primitive (Reference) Data Types**

---

## 1️⃣ Primitive Data Types
- The **basic built-in types** in Java.  
- Always store **simple values** directly in memory.    
- Total: **8 types**.  

### 🔹 Types of Primitive Data Types
1. **byte**
   - 8-bit integer
   - Range: -128 to 127
   - Used for saving memory in large arrays.

2. **short**
   - 16-bit integer
   - Range: -32,768 to 32,767
   - Useful when memory is limited.

3. **int**
   - 32-bit integer
   - Range: -2^31 to 2^31-1
   - Default type for integers.

4. **long**
   - 64-bit integer
   - Range: -2^63 to 2^63-1
   - Used for very large numbers.

5. **float**
   - 32-bit floating-point
   - Range: ~1.4e-45 to 3.4e38
   - Used for decimal values (less precision).

6. **double**
   - 64-bit floating-point
   - Range: ~4.9e-324 to 1.8e308
   - Default type for decimal values (high precision).

7. **char**
   - 16-bit Unicode character
   - Range: `\u0000` (0) to `\uffff` (65,535)
   - Used to store a single character.

8. **boolean**
   - Stores only `true` or `false`
   - Size depends on JVM
   - Used for logical conditions.

---

## 2️⃣ Non-Primitive (Reference) Data Types
- **Created by the programmer** (not predefined like primitives) except String and Array.  
- Store the **reference (memory address)** of the object, not the value directly.  
- Can be `null`.  
- Examples: **String, Arrays, Classes, Interfaces**.  

### 🔹 Characteristics
- Non-primitive types are **objects** (except arrays which have special handling).  
- Provide **methods** to perform operations.  
- Size depends on the object, not fixed like primitives.  

### Examples
```java
String name = "Raja";       // String object - array of characters
int[] numbers = {1, 2, 3};  // Array - group of like-typed variables
class Student { }           // User-defined class
