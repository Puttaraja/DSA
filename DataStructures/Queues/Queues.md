# 📚 Queue in Data Structures

## 📌 Definition
A **Queue** is a linear data structure that follows the **FIFO (First In, First Out)** principle:  
- The element inserted first is the first one to be removed.  
- Think of a line at a ticket counter → the first person in line is served first.  

It supports two primary operations:  
- **enqueue(x)** → Insert an element at the rear.  
- **dequeue()** → Remove an element from the front.  

---

## 🌟 Features of Queue
- Follows **FIFO** order.  
- Elements are inserted from the **rear** and removed from the **front**.  
- Supports operations like **enqueue, dequeue, peek, isEmpty, size**.  
- Can be implemented using **arrays**, **linked lists**, or **stacks**.  
- Variants: **Circular Queue, Deque (Double-ended Queue), Priority Queue, Double Queue**.  

---

## ⚠️ Limitations of Queue
- Fixed size in array-based implementation (can cause overflow).  
- Inefficient if implemented with plain arrays (shifting required on dequeue).  
- Limited access → only **front** and **rear** elements are accessible.  

---

## 📘 Use Cases in DSA
- **CPU Scheduling** (Round Robin, FCFS).  
- **Printer Spooler** (jobs executed in order).  
- **Breadth-First Search (BFS)** in graphs and trees.  
- **Cache Implementation** (LRU Cache with deque + hashmap).  
- **Message Queues** in distributed systems.  
- **Simulation of real-world queues** (ticket booking, call center).  

---

## ⏱️ Time Complexity of Queue Operations

| Operation   | Time Complexity | Use Case |
|-------------|-----------------|----------|
| **Enqueue** | O(1)            | Add a job/task to the waiting list |
| **Dequeue** | O(1)            | Process the oldest job in the system |
| **Peek**    | O(1)            | Check the current front element |
| **isEmpty** | O(1)            | Validate if queue has elements |
| **Size**    | O(1)            | Track number of pending tasks |
| **Search**  | O(n)            | Rare in real-world queues |
| **poll**    | O(1)            | Returns front element and removes it |

---

## 🚀 State-of-the-Art DSA Problems Using Queues

1. **Implement Stack using Queues**  
   - Use one or two queues to simulate stack’s LIFO behavior.  

2. **Implement Queue using Stacks**  
   - Classic problem that reverses the logic of stack to build a queue.  

3. **Sliding Window Maximum (Monotonic Queue)**  
   - Given an array and a window size `k`, find the maximum in each window.  
   - Solved in O(n) using deque (monotonic decreasing queue).  

4. **Rotting Oranges** (LeetCode)  
   - BFS with a queue to simulate spreading of rot over time.  

5. **Shortest Path in an Unweighted Graph**  
   - BFS with a queue guarantees shortest path in O(V+E).  

6. **Course Schedule (Topological Sort)**  
   - Detect if all courses can be finished using BFS (Kahn’s Algorithm with queue).  

7. **LRU Cache Implementation**  
   - Uses a combination of **Deque + HashMap** for O(1) access.  

8. **Flood Fill Algorithm**  
   - BFS/DFS queue-based solution used in image processing.  

---

## ✅ Summary
- **Queue = FIFO** (first in, first out).  
- Best for scenarios where tasks must be processed in order.  
- Variants like **Deque** and **Priority Queue** solve advanced scheduling and optimization problems.  
- Fundamental for BFS, scheduling algorithms, and cache design.  
