# 📚 Stack in Data Structures

## 📌 Definition
A **Stack** is a linear data structure that follows the **LIFO (Last In, First Out)** principle:  
- The element inserted last is the first one to be removed.  
- Think of a stack of plates: the last plate placed on top is the first one to be taken off.  

It mainly supports two operations:
- **push(x)** → Insert an element onto the stack.  
- **pop()** → Remove the top element from the stack.  

---

## 🌟 Features of Stack
- Follows **LIFO order**.  
- Allows **push, pop, peek, isEmpty, size** operations.  
- Can be implemented using **arrays** or **linked lists**.  
- Efficient insertion and deletion at the top (O(1)).  
- Widely used in recursion and expression evaluation.  

---

## ⚠️ Limitations of Stack
- Limited access → only the **top element** is accessible.  
- Fixed size if implemented using arrays (can cause overflow).  
- Traversal is not efficient (no random access).  
- If not managed properly, stack overflow or underflow may occur.  

---

## 📘 Use Cases in DSA
- **Expression Evaluation**: Infix → Postfix/Prefix conversion.  
- **Balancing Symbols**: Checking for balanced parentheses `()[]{}`.  
- **Undo/Redo** functionality in editors.  
- **Recursion**: Function call management uses system stack.  
- **DFS Traversal** in graphs.  
- **Backtracking Problems**: N-Queens, Maze solving.  
- **Browser History** (forward/backward navigation).  

---

## ⏱️ Time Complexity of Stack Operations

| Operation | Time Complexity |
|-----------|-----------------|
| Push      | O(1)            |
| Pop       | O(1)            |
| Peek/Top  | O(1)            |
| Search    | O(n)            |
| isEmpty   | O(1)            |
| Size      | O(1)            |

---

## 🚀 State-of-the-Art DSA Problems Using Stack

1. **Balanced Parentheses**  
   - Problem: Check if an expression with brackets `(), {}, []` is balanced.  
   - Solution: Use stack to push opening brackets and match with closing ones.  

2. **Next Greater Element**  
   - For each element, find the next greater element to its right.  
   - Uses **monotonic stack** for O(n) solution.  

3. **Largest Rectangle in Histogram**  
   - Given bar heights, find the largest rectangular area.  
   - Solved using stack in O(n).  

4. **Trapping Rain Water**  
   - Find water that can be trapped between buildings.  
   - Stack-based approach (or two-pointer) gives O(n) solution.  

5. **Evaluate Postfix/Prefix Expressions**  
   - Use stack to compute mathematical expressions efficiently.  

6. **Stock Span Problem**  
   - For each day, find how many consecutive days before it had lower/equal stock price.  
   - Solved with stack in O(n).  

7. **Min Stack / Max Stack**  
   - Stack that supports push, pop, and retrieving min/max in O(1).  

---

## ✅ Summary
- **Stack** is essential for problems requiring **reversal, backtracking, expression evaluation, and efficient top-based operations**.  
- It is simple but extremely powerful when solving **monotonic sequence** problems, **parsing**, and **graph traversals**.  

-----

## Optional

- Use Array Deque which works same as stack
