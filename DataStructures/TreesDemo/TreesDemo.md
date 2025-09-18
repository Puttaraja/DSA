# 🌳 Trees in Data Structures

## 📖 Definition
A **Tree** is a hierarchical non-linear data structure that consists of nodes connected by edges.  
- It has a root node (the topmost node).  
- Every node may have zero or more child nodes.  
- Unlike arrays and linked lists, trees represent **hierarchical relationships**.

A **Binary Tree** is a special type of tree in which each node has at most **two children**: left and right.

---

## ✨ Features of Trees
- **Hierarchical**: Represents data in parent-child relationships.
- **Dynamic Size**: Grows/shrinks as needed.
- **Non-linear Structure**: Unlike arrays/linked lists, nodes are not stored sequentially.
- **Efficient Traversal**: Supports DFS (Preorder, Inorder, Postorder) and BFS (Level-order).
- **Flexible Representation**: Can model organizational charts, file systems, syntax trees, etc.

---

## ⚠️ Limitations of Trees
- **Complex Implementation** compared to arrays/lists.
- **Higher Memory Usage** due to pointers/references for children.
- **Balancing Issues**: Unbalanced trees can degrade performance (e.g., skewed binary tree → behaves like a linked list).
- **Traversal Overhead**: Finding/searching elements requires traversals (slower than hash-based structures).

---

## ⏱️ Time Complexities

### General Tree (Adjacency List Representation)
| Operation                   | Time Complexity |
|------------------------------|-----------------|
| Traversal (DFS/BFS)         | `O(N)` |
| Insert a Node               | `O(N)` (worst case) |
| Delete a Node               | `O(N)` (search required) |
| Search a Node               | `O(N)` |

### Binary Tree
| Operation                   | Time Complexity |
|------------------------------|-----------------|
| Insertion (Level-wise)      | `O(N)` (worst case) |
| Deletion                    | `O(N)` (search + re-linking) |
| Traversal (DFS/BFS)         | `O(N)` |
| Search                      | `O(N)` (unbalanced) |

👉 **Note**: For **Binary Search Tree (BST)** , complexities improve:  
- Search, Insert, Delete = `O(log N)` (balanced), but `O(N)` in skewed cases.
- TODO: Explore BST, Types of BST

---

## 📊 Summary / Comparison Table

| Feature              | General Tree                  | Binary Tree               |
|----------------------|--------------------------------|---------------------------|
| Children per node    | Any number                    | At most 2 (left, right)   |
| Traversals           | DFS, BFS                      | Preorder, Inorder, Postorder, Level-order |
| Storage              | Adjacency list / adjacency set | Node-based (left, right) |
| Insertion            | Depends on parent (`O(1)`)    | Level-order insertion (`O(N)`) |
| Deletion             | `O(N)`                        | `O(N)`                    |
| Applications         | File system, org charts, DOM  | Expression trees, heaps, search trees |

---

## 🚀 Standard DSA Problems

### Tree Problems
1. **Print parent of all nodes** (DFS/BFS based).
2. **Print children of all nodes**.
3. **Find height of a tree**.
4. **Check if two trees are identical**.
5. **Lowest Common Ancestor (LCA)**.
6. **Diameter of a tree**.
7. **Serialize and Deserialize a tree**.

### Binary Tree Problems
1. **Inorder, Preorder, Postorder Traversals** (recursive & iterative).
2. **Level-order Traversal** (BFS).
3. **Find height of binary tree**.
4. **Count nodes and leaves**.
5. **Check if a binary tree is balanced**.
6. **Boundary traversal of a binary tree**.
7. **Construct tree from preorder & inorder**.
8. **Maximum path sum in a binary tree**.

---

## ✅ Summary
- **Trees**: General non-linear structure, useful for hierarchical data.  
- **Binary Trees**: Special case with at most two children, forms the foundation for BSTs, heaps, and AVL trees.  
- Time complexities depend heavily on whether the tree is balanced.  
- Widely used in **compilers, databases, file systems, and competitive programming**.
