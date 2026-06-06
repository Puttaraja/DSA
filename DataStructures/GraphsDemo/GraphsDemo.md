# 📘 Graphs in Data Structures (Java)

Graphs are one of the most widely used **non-linear data structures** that represent relationships between entities (nodes/vertices).  
A **graph** is defined as a collection of **nodes (vertices)** and **edges** connecting pairs of nodes.

---

## 🔹 Definition
- A **Graph** `G` is defined as `G = (V, E)`  
  where `V` = set of vertices (nodes), `E` = set of edges connecting pairs of vertices.
- Types:
  - **Directed / Undirected**
  - **Weighted / Unweighted**
  - **Cyclic / Acyclic**
  - **Connected / Disconnected**

---

## 🔹 Features
- Can model **real-world problems**: networks, maps, social connections, etc.
- Representation methods:
  1. **Adjacency List** (efficient for sparse graphs)
  2. **Adjacency Matrix** (efficient for dense graphs)
- Traversals: **BFS (Breadth-First Search)** and **DFS (Depth-First Search)**.

---

## 🔹 Limitations
- Higher memory consumption for large dense graphs (especially with adjacency matrices).
- Traversal can be **O(V + E)** which becomes expensive for very large datasets.
- Requires careful handling to avoid **infinite loops** in cyclic graphs.

---

## 📊 Time Complexities

| Operation              | Adjacency List | Adjacency Matrix |
|------------------------|----------------|------------------|
| Storage                | O(V + E)       | O(V²)            |
| Add Edge               | O(1)           | O(1)             |
| Remove Edge            | O(E)           | O(1)             |
| Check Edge Exists      | O(E)           | O(1)             |
| Traverse (BFS/DFS)     | O(V + E)       | O(V²)            |

---

## 🔹 Standard Problems on Graphs
- BFS (Breadth-First Search)
- DFS (Depth-First Search)
- Detect Cycle (Directed & Undirected)
- Connected Components
- Shortest Path Algorithms
  - Dijkstra’s Algorithm
  - Bellman-Ford
  - Floyd-Warshall
- Minimum Spanning Tree
  - Prim’s Algorithm
  - Kruskal’s Algorithm
- Topological Sort
- Bipartite Graph Check
- Strongly Connected Components (Kosaraju’s / Tarjan’s)

---


