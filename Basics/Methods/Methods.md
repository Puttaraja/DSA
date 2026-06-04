## 🔧 Methods in Java

- A **method** in Java is a block of code that performs a specific task.  
- It helps in **code reusability**, **modularity**, and **readability**.

---

### 📌 Why Use Methods?
- To avoid repeating code (reusability).  
- To divide a large program into smaller parts (modularity).  
- To make code easy to read, debug, and maintain.  

---

### 📝 Method Syntax
```java
returnType methodName(parameters) {
    // body of the method
    return value; // optional, only if returnType is not void
}
```

## ⚡ Types of Methods in Java

### 1️⃣ Predefined Methods (Built-in)

- Already defined in Java libraries.
- Can be used directly without writing their code.
- Example: toUpperCase(), length, random() etc

### 2️⃣ User-Defined Methods

- Created by the programmer.
- Can be called multiple times in the program.
- Example: creating methods like area, factorila, multification etc.

### 3️⃣ Static Methods

- Declared using the static keyword.
- Can be called without creating an object of the class.
- Like main method which is static can be called without creating object by JVM.

### 4️⃣ Instance Methods

- Belong to an object of the class.
- Must create an object to call them.
- Creating methods inside a class without static key word and accessed after creating an object of the class

### 5️⃣ Abstract Methods

- Declared using the abstract keyword.
- Have no body (only declaration).
- Must be implemented in a subclass.
- Used for overriding the methods by inherited child classes based on child classes requirements.

```java
abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    void sound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Meow!");
    }
}
```
-Here Dog and Cat child classes overrides the sound method of animal parent class.

### 6️⃣ Final Methods

- Declared using the final keyword.
- Cannot be overridden by subclasses.

```java
class Parent {
    final void display(){
        //statements
    }
}
class Child extends Parent {
    // ❌ Cannot override display()
}
```

### 7️⃣ Synchronized Methods

- Used in multithreading to avoid multiple threads accessing a method at the same time.

## 📊 Summary of Method Types in Java

| Method Type       | Description                              | Example Use Case                         |
|-------------------|------------------------------------------|------------------------------------------|
| **Predefined**    | Already available in Java libraries      | `toUpperCase()`, `Math.sqrt()`           |
| **User-defined**  | Created by the programmer                | `add(int a, int b)`                      |
| **Static**        | Belongs to class, no object needed       | `main()` method                          |
| **Instance**      | Belongs to object, needs object creation | `obj.display()`                          |
| **Abstract**      | Declared without body, implemented later | `abstract void sound();`                 |
| **Final**         | Cannot be overridden in subclass         | `final void show()`                      |
| **Synchronized**  | Thread-safe method in multithreading     | `synchronized void increment()`          |


### 🚀 Why is the main Method Static in Java?

- The `main` method is **static** because the Java program starts **before any objects are created**.  
- If it wasn’t static, Java would need to first **create an object of the class** just to call `main()`.  
- That would be a problem, because we need `main()` to run **without creating anything first**.  

👉 In short:  
- `main()` is static so the JVM can call it **directly**.  
- No object = no extra memory or setup needed.  
- It’s like the "entry door" to your program that works immediately.  
