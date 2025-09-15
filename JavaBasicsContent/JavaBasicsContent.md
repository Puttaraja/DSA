### Java Definition, Features, Limitations

**Definition:**
Java is a high-level, object-oriented programming language developed by Sun Microsystems (now owned by Oracle). It is designed to be platform-independent, secure, and robust, allowing developers to write code once and run it anywhere (WORA).

**Features:**
- **Platform Independence:** Java programs run on any device with a Java Virtual Machine (JVM).
- **Object-Oriented:** Supports encapsulation, inheritance, and polymorphism.
- **Robust and Secure:** Strong memory management, exception handling, and security features.
- **Multithreading:** Supports concurrent execution of two or more threads.
- **Automatic Garbage Collection:** Manages memory automatically.
- **Rich Standard Library:** Provides a wide range of built-in classes and APIs.
- **Distributed Computing:** Supports networking and remote method invocation (RMI).
- **Dynamic:** Can load classes at runtime.

**Limitations:**
- **Performance:** Slower than languages like C/C++ due to JVM overhead.
- **Memory Consumption:** Higher memory usage compared to lower-level languages. 
  - **Reason:** Java programs run on the Java Virtual Machine (JVM), which adds an extra layer between your code and the hardware. This abstraction provides portability and security but requires more memory for:
    - JVM runtime itself
    - Automatic garbage collection
    - Object metadata and management
    - Rich standard libraries loaded in memory
  - **Comparison:** Lower-level languages like C/C++ compile directly to machine code and manage memory manually, resulting in lower overhead and more efficient memory usage.
- **GUI Development:** Java’s GUI libraries (Swing, AWT) are less modern compared to other frameworks.
- **Verbosity:** More boilerplate code compared to some modern languages.
- **Mobile Development:** Not preferred for iOS development; Android uses a modified version.

----------

### Concept of Java Compiler, JVM, JDK

**Java Compiler (javac):**
- Translates Java source code (.java files) into bytecode (.class files).
- Bytecode is platform-independent and can be executed on any system with a JVM.

**JVM (Java Virtual Machine):**
- Runs Java bytecode on any platform.
- Provides platform independence ("write once, run anywhere").
- Handles memory management, garbage collection, and security.
- Converts bytecode into machine code for the host system at runtime.

**JDK (Java Development Kit):**
- Complete package for Java development.
- Includes the Java Compiler (javac), JVM, and core libraries (API).
- Provides tools for developing, debugging, and monitoring Java applications.
- Required for writing and compiling Java programs; JRE (Java Runtime Environment) is only for running them.

**Summary Table:**
| Component | Purpose |
|-----------|---------|
| JDK       | Develop, compile, run Java programs |
| JVM       | Run Java bytecode on any platform   |
| Compiler  | Convert source code to bytecode     |

---------

### Why className and fileName are same in Java?

In Java, the file name and the public class name must be the same because of how the Java compiler and JVM locate and load classes. This rule ensures:

- **Consistency:** The compiler can easily find the source file for a given class.
- **Compilation:** When you compile, the `.class` file is named after the public class, matching the file name.
- **Access:** The JVM loads classes by their name, so mismatches cause errors.

**Example:**
If you declare `public class HelloWorld` in a file, the file must be named `HelloWorld.java`.

If the names do not match, you will get a compilation error: `class HelloWorld is public, should be declared in a file named HelloWorld.java`.

This rule applies only to public classes. Non-public classes can have any name and be placed in any file.

---------

### Why is the main method static in Java?

The `main` method in Java is declared as `static` because:

- **No Object Needed:** The JVM can call the `main` method without creating an instance of the class. This is necessary since program execution starts before any objects are created.
- **Entry Point:** It serves as the entry point for the application. The JVM looks for `public static void main(String[] args)` to start execution.
- **Consistency:** Ensures a consistent way for the JVM to locate and invoke the starting method.
- **Efficiency:** Avoids unnecessary object creation just to start the program.

**Summary:**
Declaring `main` as static allows the JVM to invoke it directly, making it possible to start the program without needing to instantiate the class first.

--------

### Multithreading Concept in Java (Concise)

- **Definition:** Multithreading allows multiple threads (lightweight processes) to run concurrently within a single Java program, improving performance and responsiveness.
- **Benefits:**
  - Efficient CPU utilization
  - Faster execution for tasks like I/O, networking, and GUIs
  - Better resource sharing
- **How:**
  - Create threads by extending `Thread` class or implementing `Runnable` interface
  - Start threads using `start()` method
- **Key Points:**
  - Each thread runs independently but shares process resources
  - Synchronization is needed to avoid data inconsistency
  - Java provides thread management and synchronization tools (e.g., `synchronized`, `wait`, `notify`)
  - Only one thread per object is allowed to execute the shared resource block. Using lock and release methods.
- **Example:**
```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running");
    }
}
// In main:
new MyThread().start();
```

--------



