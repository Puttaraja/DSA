# 🔁 Loops in Java

A **loop** is a control structure that allows you to execute a block of code **repeatedly** until a condition is met.  
Loops help reduce code repetition and make programs efficient.  

---

## ✅ Types of Loops in Java

### 1. for loop
- Used when the number of iterations is **known**.
- **Syntax:**
```java
for(initialization; condition; update) {
    // code
}
```

### 2. while loop
- Condition is checked **before** the block is executed.  
- If the condition is `false` initially, the loop body may **not execute at all**.  
- Best used when the number of iterations is **not fixed**.

### ✅ Syntax
```java
while(condition) {
    // code to execute
}
```

### 3. do-while Loop

-Condition is checked after the block is executed.
-Ensures the loop body runs at least once.
-Useful when you need to execute first, then check condition.

### ✅ Syntax
```java
do {
    // code to execute
} while(condition);
```


