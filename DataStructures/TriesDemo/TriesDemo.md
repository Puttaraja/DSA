# Trie Data Structure (Prefix Tree)

## What is a Trie?

A Trie (Pronounced "Try") is a tree-based data structure used for efficient storage and retrieval of strings.

It is mainly used for:

* Dictionary applications
* Auto-complete systems
* Spell checkers
* Search suggestions   
* Prefix matching

Unlike HashMap, Trie stores characters one by one.

Example:

Words:
apple
app
ape

Trie Structure:

```
(root)
  |
  a
  |
  p
 / \
p   e*
|
l
|
e*
```

`*` indicates end of a valid word.

---

# TrieNode Structure

```java
static class TrieNode {
    boolean isEndOfWord;
    TrieNode[] children = new TrieNode[26];
}
```

## Components

### children[26]

Stores references to child nodes.

```
index = character - 'a'
```

Examples:

```
a -> 0
b -> 1
c -> 2
...
z -> 25
```

### isEndOfWord

Used to indicate whether the current node completes a valid word.

Example:

Words inserted:

```
app
apple
```

Node representing:

```
app
```

has:

```java
isEndOfWord = true
```

because "app" is a valid word.

---

# Insert Operation

## Algorithm

For each character:

1. Find index.
2. Create node if absent.
3. Move to child.
4. Mark last node as end of word.

### Code

```java
void insert(String word, TrieNode root)
```

---

## Dry Run

Insert:

```
apple
```

Steps:

```
root
 |
 a
 |
 p
 |
 p
 |
 l
 |
 e*
```

Time Complexity:

```
O(L)
```

where:

```
L = word length
```

Space Complexity:

```
O(L)
```

(for new nodes)

---

# Search Operation

## Algorithm

Traverse character by character.

If any character is missing:

```java
return false;
```

At the end:

```java
return currentNode.isEndOfWord;
```

---

## Example

Inserted:

```
apple
```

Search:

```
apple
```

Result:

```
true
```

Search:

```
appl
```

Result:

```
false
```

because:

```java
isEndOfWord == false
```

---

# StartsWith Operation

Checks whether a prefix exists.

Example:

Inserted:

```
apple
```

Queries:

```
app -> true
ap -> true
apl -> false
```

Unlike search, it does not require:

```java
isEndOfWord = true
```

Time Complexity:

```
O(P)
```

where:

```
P = prefix length
```

---

# Print All Words

Uses DFS traversal.

```java
printAllWords(root, "")
```

Recursively builds words.

Example Output:

```
apple
banana
grape
orange
```

Time Complexity:

```
O(total characters stored)
```

---

# Level Order Traversal

Uses Queue.

```java
Queue<TrieNode>
```

Processes nodes level by level.

Example:

```
Level 1:
a b g

Level 2:
p r
```

Useful for visualizing Trie structure.

---

# Delete Operation

Delete is the most important Trie interview question.

## Goal

Delete:

```
apple
```

without affecting:

```
app
```

or

```
apples
```

---

## Recursive Strategy

### Step 1

Reach last character.

```java
depth == word.length()
```

### Step 2

Unmark

```java
isEndOfWord = false
```

### Step 3

Return back.

### Step 4

Delete unnecessary nodes.

Conditions:

```java
isEmpty(node)
```

AND

```java
!node.isEndOfWord
```

Only then:

```java
parent.children[index] = null;
```

---

## Example

Inserted:

```
app
apple
```

Delete:

```
apple
```

Result:

```
app
```

still remains.

Reason:

Node "p" is still:

```java
isEndOfWord = true
```

Therefore cannot be deleted.

---

# Auto Complete

Feature used in:

* Google Search
* Amazon Search
* IDE Suggestions
* Mobile Keyboards

---

## Steps

### Find Prefix

Example:

```
ap
```

Traverse till:

```
a -> p
```

### DFS

Print all words below it.

Output:

```
apple
applex
appley
```

Time Complexity:

```
O(P + K)
```

where:

```
P = prefix length
K = characters in suggestions
```

---

# Time Complexity Summary

| Operation    | Complexity |
| ------------ | ---------- |
| Insert       | O(L)       |
| Search       | O(L)       |
| StartsWith   | O(P)       |
| Delete       | O(L)       |
| AutoComplete | O(P + K)   |

---

# Space Complexity

Each node stores:

```java
TrieNode[26]
```

Space:

```
O(26 × Number of Nodes)
```

Generally written as:

```
O(Number of Nodes)
```

---

# Real World Applications

### Search Engines

Google suggestions.

### IDEs

VS Code IntelliSense.

### Spell Checkers

Word validation.

### Contact Search

Mobile phone contacts.

### Dictionary Applications

Fast prefix matching.

---

# Common Interview Questions

### Easy

1. Implement Trie.
2. Search a word.
3. Check prefix.

### Medium

1. Auto Complete.
2. Count words with prefix.
3. Longest common prefix.

### Hard

1. Word Search II.
2. Replace Words.
3. Stream of Characters.
4. Design Search Suggestion System.

---

# Key Takeaways

* Trie is a Prefix Tree.
* Search, Insert and Delete are O(L).
* Excellent for string-based problems.
* Auto-complete is Trie's strongest use case.
* Delete requires recursive cleanup.
* Widely asked in product-company interviews.
