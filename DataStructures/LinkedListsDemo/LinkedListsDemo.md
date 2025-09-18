# Linked List in Data Structures

## 📌 Definition
A **Linked List** is a linear data structure where elements (called **nodes**) are stored at non-contiguous memory locations.  
Each node consists of:
- **Data** → stores the actual value.  
- **Pointer (next)** → stores the address of the next node.  
- **Pointer (prev)** → stores the address of the prev node in case of Doubly Linked List.  

Unlike arrays, linked lists do not require a fixed size and can grow or shrink dynamically.

---

## 🌟 Features of Linked List
- Dynamic memory allocation (no fixed size like arrays).  
- Insertion and deletion are efficient compared to arrays (no shifting required).  
- Elements are not stored in contiguous memory, they are connected via pointers.  
- Traversal is sequential (cannot access random elements directly).  
- Can be **singly linked**, **doubly linked**, or **circular**.

---

## ⚠️ Limitations
- Extra memory is needed for pointers.  
- Random access is **not possible** (O(n) traversal required).  
- Cache locality is poor compared to arrays.  
- Reverse traversal is not possible in **singly linked lists**.  
- More complex implementation compared to arrays.

---

## 📘 Use Cases in DSA
- Implementing stacks and queues.  
- Dynamic memory management (e.g., memory allocator).  
- Adjacency list representation of graphs.  
- Undo functionality in editors (backtracking using linked lists).  
- Polynomial arithmetic (storing coefficients as linked nodes).  
- Efficient insertion and deletion in the middle of a sequence.

---

## ⏱️ Time Complexity of Linked List Operations

| Operation                  | Singly Linked List | Doubly Linked List |
|----------------------------|--------------------|---------------------|
| **Access (by index)**      | O(n)               | O(n)                |
| **Search**                 | O(n)               | O(n)                |
| **Insert at Beginning**    | O(1)               | O(1)                |
| **Insert at End**          | O(n) *(unless tail pointer maintained → O(1))* | O(1) if tail maintained |
| **Insert at Middle (kth)** | O(n)               | O(n)                |
| **Delete at Beginning**    | O(1)               | O(1)                |
| **Delete at End**          | O(n) *(O(1) with tail but extra handling)* | O(1) if tail maintained |
| **Delete by Key**          | O(n)               | O(n)                |
| **Reverse List**           | O(n)               | O(n)                |

---

## ✅ Summary
- **Arrays** are better when frequent random access is needed.  
- **Linked Lists** are better when frequent insertions/deletions are required.  
- Choice depends on use case: **read-heavy** workloads → arrays, **write-heavy** workloads → linked lists.  
