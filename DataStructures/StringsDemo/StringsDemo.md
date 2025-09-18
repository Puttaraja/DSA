# 📌 Strings in Java
------

### Definition

A String is a sequence of characters enclosed in double quotes (" ").

In Java, strings are objects of the String class (not a primitive data type).

Internally, a string is represented as a character array (char[]), but with additional methods to work on text.

------

### Features of Strings

- Immutable → Once created, a string cannot be changed. Any modification creates a new string object.
- Stored in String Pool → Literals are stored in the String Constant Pool for memory efficiency.
- Rich API Support → Provides many built-in methods (length(), substring(), charAt(), indexOf(), etc.).
- Supports Concatenation → Using + operator or .concat() method.
- Comparable → Supports lexicographical comparison using compareTo().
- Thread-safe → Since Strings are immutable, they are automatically thread-safe.

------

### Limitations of Strings

- Immutability causes overhead → Every modification creates a new object, leading to more memory usage if used in loops.
- For frequent modifications, use StringBuilder (not thread-safe, faster) or StringBuffer (thread-safe).
- Fixed character encoding → By default, Java uses UTF-16 which may use extra memory compared to ASCII.
- Slower for repeated concatenations → e.g., in large-scale text operations.

-------

### String Builder

- One object is maintained, and modifications happen in-place.
- Faster than String when doing lots of concatenation (e.g., building a long string inside loops).
- Not thread-safe (multiple threads modifying the same StringBuilder can cause race conditions).

--------

### String Buffer

- StringBuffer is just like StringBuilder, but synchronized.
- This means multiple threads can safely modify the same StringBuffer.
- Slightly slower than StringBuilder because of synchronization overhead.

--------

### When to Use?

- ✅ Use String → When immutability and thread-safety matter (e.g., constants, config - values, identifiers).
- ✅ Use StringBuilder → When repeatedly modifying strings (e.g., loops, dynamic string building).
- ✅ Use StringBuffer → When modifications need to be thread-safe.

-------

### ✅ Summary Table

| Type            | Mutable? | Thread-safe? | Performance | Best Use Case |
|-----------------|----------|--------------|-------------|---------------|
| **String**      | ❌       | ✅           | Slow        | Constants, rarely changing values |
| **StringBuilder** | ✅     | ❌           | Fastest     | Frequent modifications in **single-threaded** programs |
| **StringBuffer**  | ✅     | ✅           | Slower      | Modifications in **multi-threaded** programs |

--------

## Useful Use Cases in DSA

- Palindrome Problems
- Check if a string reads the same forward and backward.
- Useful in interview problems (e.g., longest palindrome substring).
- Anagram Checking
- Determine if two strings contain the same characters in different orders.
- Substring Problems
- Find all substrings, longest substring without repeating characters, etc.
- Pattern Matching
- KMP Algorithm, Rabin-Karp, Z Algorithm → widely asked in coding interviews.
- String Reversal & Rotation
- Classic beginner problems.
- Character Frequency Counting
- Basis for problems like "First non-repeating character".
- Parsing & Tokenization
- Splitting input text, useful in competitive programming.