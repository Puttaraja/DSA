# 🌳 Binary Search Tree (BST)

## 📖 Definition

A **Binary Search Tree (BST)** is a special type of Binary Tree that follows the **BST Property**:

* All values in the left subtree are smaller than the current node.
* All values in the right subtree are greater than the current node.
* Both left and right subtrees are themselves BSTs.

Example:

```text
          50
        /    \
      30      70
     /  \    /  \
   20   40  60   80
```

For node `50`:

```text
Left Subtree  < 50
Right Subtree > 50
```

---

## ✨ Features of BST

* Maintains data in sorted order.
* Efficient searching, insertion, and deletion.
* Inorder traversal produces sorted output.
* Supports finding minimum and maximum efficiently.
* Forms the foundation for AVL Trees and Red-Black Trees.

---

## ⚠️ Limitations of BST

### Skewed Tree Problem

If values are inserted in sorted order:

```text
10
  \
   20
     \
      30
        \
         40
```

The BST behaves like a Linked List.

As a result:

```text
Search  -> O(N)
Insert  -> O(N)
Delete  -> O(N)
```

instead of:

```text
O(log N)
```

---

## 🌲 BST Property

For every node:

```text
Left Subtree < Node < Right Subtree
```

Example:

```text
          50
        /    \
      30      70
```

```text
30 < 50 < 70
```

---

## 🔄 Traversals

### Inorder Traversal (Left → Node → Right)

```text
L N R
```

Example:

```text
          50
        /    \
      30      70
     /  \    /  \
   20   40  60   80
```

Output:

```text
20 30 40 50 60 70 80
```

✅ Produces sorted order in a BST.

---

### Preorder Traversal (Node → Left → Right)

```text
N L R
```

Output:

```text
50 30 20 40 70 60 80
```

---

### Postorder Traversal (Left → Right → Node)

```text
L R N
```

Output:

```text
20 40 30 60 80 70 50
```

---

### Level Order Traversal (BFS)

```text
50
30 70
20 40 60 80
```

---

## 🔍 Search Operation

Searching follows the BST Property.

Example: Search `60`

```text
60 > 50
Move Right

60 < 70
Move Left

Found 60
```

Average Complexity:

```text
O(log N)
```

Worst Case:

```text
O(N)
```

---

## ➕ Insertion

Insertion follows the BST Property.

Insert:

```text
50
30
70
20
40
```

Result:

```text
          50
        /    \
      30      70
     /  \
   20   40
```

Each value determines its own position based on comparisons.

---

## 🔽 Find Minimum

Minimum value is always the leftmost node.

Example:

```text
          50
        /    \
      30      70
     /  \
   20   40
```

Traversal:

```text
50
↓
30
↓
20
```

Minimum:

```text
20
```

Algorithm:

```text
Keep moving left until left child becomes null.
```

---

## 🔼 Find Maximum

Maximum value is always the rightmost node.

Example:

```text
          50
        /    \
      30      70
             /  \
            60   80
```

Traversal:

```text
50
↓
70
↓
80
```

Maximum:

```text
80
```

Algorithm:

```text
Keep moving right until right child becomes null.
```

---

## 🔁 Inorder Predecessor

The predecessor of a node is:

```text
Largest value smaller than the node.
```

Formula:

```text
findMax(root.left)
```

Example:

```text
          50
        /    \
      30      70
     /  \
   20   40
```

Predecessor of `50`:

```text
40
```

---

## 🔁 Inorder Successor

The successor of a node is:

```text
Smallest value greater than the node.
```

Formula:

```text
findMin(root.right)
```

Example:

```text
          50
        /    \
      30      70
            /   \
           60   80
```

Successor of `50`:

```text
60
```

---

## ❌ Deletion

### Case 1: Leaf Node

Before:

```text
    30
   /
 20
```

Delete:

```text
20
```

After:

```text
30
```

Simply remove the node.

---

### Case 2: Node with One Child

Before:

```text
    30
   /
 20
  \
   25
```

Delete:

```text
20
```

After:

```text
   30
  /
25
```

Promote the child.

---

### Case 3: Node with Two Children

Before:

```text
          50
        /    \
      30      70
     /  \    /  \
   20   40  60   80
```

Delete:

```text
50
```

Step 1:

Find successor:

```text
findMin(root.right)
=
60
```

Step 2:

Replace:

```text
50 → 60
```

Step 3:

Delete original `60`.

Result:

```text
          60
        /    \
      30      70
     /  \       \
   20   40      80
```

---

## ⏱️ Time Complexities

| Operation  | Average Case | Worst Case |
| ---------- | ------------ | ---------- |
| Search     | O(log N)     | O(N)       |
| Insert     | O(log N)     | O(N)       |
| Delete     | O(log N)     | O(N)       |
| Find Min   | O(log N)     | O(N)       |
| Find Max   | O(log N)     | O(N)       |
| Traversals | O(N)         | O(N)       |

---

## 📊 Binary Tree vs Heap vs BST

| Feature        | Binary Tree | Heap          | BST          |
| -------------- | ----------- | ------------- | ------------ |
| Ordering       | ❌           | Partial       | ✅            |
| Search         | O(N)        | O(N)          | O(log N) Avg |
| Insert         | O(N)        | O(log N)      | O(log N) Avg |
| Delete         | O(N)        | O(log N)      | O(log N) Avg |
| Find Min       | O(N)        | O(1) Min Heap | O(log N)     |
| Find Max       | O(N)        | O(1) Max Heap | O(log N)     |
| Inorder Sorted | ❌           | ❌             | ✅            |

---

## 🚀 Standard DSA Problems

1. Insert into BST.
2. Search in BST.
3. Delete a node from BST.
4. Find minimum element.
5. Find maximum element.
6. Find predecessor and successor.
7. Validate BST.
8. Lowest Common Ancestor (LCA) in BST.
9. Convert BST to sorted array.
10. Construct BST from sorted array.

---

## ✅ Summary

* BST is a Binary Tree with ordering.
* Left Subtree < Node < Right Subtree.
* Inorder traversal produces sorted output.
* Search, Insert, and Delete are efficient in balanced trees.
* Minimum is the leftmost node.
* Maximum is the rightmost node.
* Deletion has three cases: leaf node, one child, and two children.
* BST forms the foundation for self-balancing trees such as AVL Trees and Red-Black Trees.
