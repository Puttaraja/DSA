# ⚡ Conditional Statements in Java

Conditional statements allow us to control the flow of execution of a program based on certain conditions.  
They help in **decision making** by executing different blocks of code depending on whether a condition is `true` or `false`.

---

### 1️⃣ if Statement
- Used for **single condition check**.
- Executes the block of code **only if the condition is true**.

### ✅ Syntax
```java
if (condition) {
    // code to execute if condition is true
}
```

### 2️⃣ if-else Statement

- Used for **two-way decision** making.
- Executes one block if the condition is true, otherwise the else block.

### ✅ Syntax
```java
if (condition) {
    // code if true
} else {
    // code if false
}
```

### 3️⃣ nested-if Statement

- Used for multi-level conditions (an if inside another if).
- Useful when we need to check multiple conditions in a hierarchy.

### ✅ Syntax
```java
if (condition1) {
    if (condition2) {
        // code if both conditions are true
    }
}
```

### 4️⃣ if-else-if Ladder

- Used for multiple conditions.
- Checks conditions sequentially until one is true, otherwise executes the else block.

### ✅ Syntax
```java
if (condition1) {
    // code
} else if (condition2) {
    // code
} else {
    // code if none are true
}
```

### 5️⃣ switch-case Statement

- Used for exact value matching.
- More efficient than multiple if-else statements when checking against constant values.

### ✅ Syntax
```java
switch(expression) {
    case value1:
        // code
        break;
    case value2:
        // code
        break;
    default:
        // code if no case matches
}
```

### 6️⃣ break Statement

- Used to exit from a loop or a switch block immediately.

### ✅ Syntax
```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) break;
    System.out.println(i);
}
```

### 7️⃣ continue Statement

- Used to skip the current iteration of a loop and move to the next one.

### ✅ Syntax
```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) continue;
    System.out.println(i);
}
```

### 8️⃣ return Statement

- Used to exit a method and optionally return a value.

### ✅ Syntax
```java
int add(int a, int b) {
    return a + b;
}
```


## 📊 Summary Table

| Statement       | Use Case                  | Example (short)                    |
|-----------------|---------------------------|------------------------------------|
| **if**          | Single condition check    | `if (age >= 18) {...}`             |
| **if-else**     | Two-way decision          | `if (x > y) {...} else {...}`      |
| **nested-if**   | Multi-level conditions    | `if (x > 10) { if (y > 5) {...} }` |
| **if-else-if**  | Multiple conditions       | `if (marks>=90)... else if...`     |
| **switch-case** | Exact value matching      | `switch(day) { case 1: ... }`      |
| **break**       | Exit loop/switch          | `if (i==3) break;`                 |
| **continue**    | Skip iteration            | `if (i==3) continue;`              |
| **return**      | Exit method with value    | `return result;`                   |
