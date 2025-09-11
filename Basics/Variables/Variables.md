# 📌 Variables in Java

A **variable** is a **named memory location** that stores data.

---

## 🔑 Properties of a Variable
Every variable in Java has:
- **Data type** – type of the data it stores (e.g., `int`, `double`, `String`).
- **Name (identifier)** – a unique name given to the variable.
- **Value** – the actual data stored in memory.

**Syntax:**
dataType variableName = value;

# 📌 Types of Variables in Java

Java supports three main types of variables:

1. **Local Variables** – declared inside methods, constructors, or blocks.  
2. **Instance Variables** – declared inside a class but outside methods.  
3. **Static Variables** – declared with the `static` keyword, shared across objects.  

---

## 📊 Comparison Table

| Feature          | Local Variable             | Instance Variable             | Static Variable              |
|------------------|----------------------------|-------------------------------|-------------------------------|
| **Declared In**  | Method / Block / Constructor | Inside class, outside methods | Inside class, with `static`   |
| **Default Value**| ❌ None (must initialize)  | ✅ Yes                        | ✅ Yes                        |
| **Scope**        | Within method/block        | Per object                    | Shared across class           |
| **Memory**       | Stack                      | Heap                          | Method Area                   |
| **Lifetime**     | Method execution           | Object lifetime               | Class lifetime                |

---
