package DataStructures.TreesDemo;
import java.util.Queue;
import java.util.Vector;
import java.util.LinkedList;
// import java.util.HashSet;
import java.util.HashMap;
import java.util.Stack;

public class TreesDemo {

    static Integer generateRandomNumberBetweenRange(int min, int max){
        return (int)(Math.random() * (max - min + 1)) + min;
    }

    // static Vector<HashSet<Integer>> createDynamicTree(){
    //     // Tree creation logic can be implemented here
    //     Integer nodes = generateRandomNumberBetweenRange(3, 10);
    //     Vector<HashSet<Integer>> tree = new Vector<HashSet<Integer>>(nodes+1);
    //     for(int i = 0; i < nodes + 1; i++){
    //         tree.add(new HashSet<Integer>());
    //     }
    //     for(int i = 1; i < nodes + 1; i++){
    //         Integer childrenCount = generateRandomNumberBetweenRange(0, 3);
    //         for(int j = 0; j < childrenCount; j++){
    //             Integer childValue = generateRandomNumberBetweenRange(1, nodes);
    //             if(childValue == i) continue; // avoid self-loop
    //             tree.get(i).add(childValue);
    //             tree.get(childValue).add(i); // for undirected tree
    //         }
    //     }
    //     return tree;
    // }

    static Vector<Vector<Integer>> createStaticTree(){
        // Tree creation logic can be implemented here
        Vector<Vector<Integer>> tree = new Vector<Vector<Integer>>(9);
        for(int i = 0; i < 10; i++){
            tree.add(new Vector<Integer>());
        }

        tree.get(1).add(2);
        tree.get(2).add(1);

        tree.get(1).add(3);
        tree.get(3).add(1);

        tree.get(1).add(4);
        tree.get(4).add(1);

        tree.get(2).add(5);
        tree.get(5).add(2);

        tree.get(2).add(6);
        tree.get(6).add(2);

        tree.get(3).add(8);
        tree.get(8).add(3);

        tree.get(4).add(7);
        tree.get(7).add(4);

        tree.get(4).add(9);
        tree.get(9).add(4);

        return tree;
    }

    static void printTree(Vector<Vector<Integer>> tree){
        for(int i = 0; i < tree.size(); i++){
            System.out.print("Node " + i + ": ");
            for(Integer child : tree.get(i)){
                System.out.print(child + " ");
            }
            System.out.println();
        }
    }

    static void printParentOfAllNodes(Vector<Vector<Integer>> tree, Integer node, Integer parent){
        if(node < 0 || node >= tree.size()){
            System.out.println("Invalid node");
            return;
        } else {
            System.out.println( node + " -> " + parent);
        }
        for(Integer child : tree.get(node)){
            if(child != parent){
                printParentOfAllNodes(tree, child, node);
            }
        }
    }

    static void printParentOfAllNodesUsingStack(Vector<Vector<Integer>> tree, int root){
        // Function to print parent of a given node can be implemented here
        Stack<Integer> stack = new Stack<>();
        boolean visited[] = new boolean[tree.size()+1];
        stack.push(root);
        visited[root] = true;
        HashMap<Integer, Integer> parentMap = new HashMap<>();
        parentMap.put(root, 0); // root has no parent
        while(!stack.isEmpty()){
            Integer parent = stack.pop();
            for(Integer child: tree.get(parent)){
                if(!visited[child]){
                    visited[child] = true;
                    stack.push(child);
                    parentMap.put(child, parent);
                }
            }
        }
        for(Integer child: parentMap.keySet()){
            System.out.println("Child: " + child + " -> Parent: " + parentMap.get(child));
        }
        return;
    }

    static void printChildrenOfAllNodes(Vector<Vector<Integer>> tree, int root){
        // Function to print children of a given node can be implemented here
        Queue<Integer> queue = new LinkedList<>();
        boolean visited[] = new boolean[tree.size()+1];
        queue.add(root);
        visited[root] = true;
        HashMap<Integer, Vector<Integer>> parentChildMap = new HashMap<>();
        while(!queue.isEmpty()){
            Integer current = queue.poll();
            for(Integer child: tree.get(current)){
                if(!visited[child]){
                    visited[child] = true;
                    queue.add(child);
                    parentChildMap.putIfAbsent(current, new Vector<Integer>());
                    parentChildMap.get(current).add(child);
                }
            }
        }
        for(Integer parent: parentChildMap.keySet()){
            System.out.println("Parent: " + parent + " -> Children: " + parentChildMap.get(parent));
        }
        return;
    }

    static void performBasicOperationsOnTree(){
        // Basic tree operations are implemented here
        //Vector<HashSet<Integer>> tree = createDynamicTree();
        Vector<Vector<Integer>> tree = createStaticTree();
        printTree(tree);
        printParentOfAllNodes(tree, 1, 0);  // DFS using recursion
        printParentOfAllNodesUsingStack(tree, 1);  // DFS using stack, instead of recursion need to maintain own stack and visited array
        printChildrenOfAllNodes(tree, 1);          // BFS using queue
        return;
    }

    static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    static class BinaryTree {
        Node root;

        BinaryTree() {
            root = null;
        }

        void insert(int key){
            if(root == null){
                root = new Node(key);
                return;
            }
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            while(!queue.isEmpty()){
                Node current = queue.poll();
                if(current.left == null){
                    current.left = new Node(key);
                    return;
                } else {
                    queue.add(current.left);
                }
                if(current.right == null){
                    current.right = new Node(key);
                    return;
                } else {
                    queue.add(current.right);
                }
            }
        }

        void printInOrder(Node node) {
            if (node == null)
                return;
            printInOrder(node.left);
            System.out.print(node.data + " ");
            printInOrder(node.right);
        }

        void printPreOrder(Node node) {
            if (node == null)
                return;
            System.out.print(node.data + " ");
            printPreOrder(node.left);
            printPreOrder(node.right);
        }

        void printPostOrder(Node node) {
            if (node == null)
                return;
            printPostOrder(node.left);
            printPostOrder(node.right);
            System.out.print(node.data + " ");
        }

        void printLevelOrder() {
            if (root == null)
                return;
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                Node tempNode = queue.poll();
                System.out.print(tempNode.data + " ");
                if (tempNode.left != null) {
                    queue.add(tempNode.left);
                }
                if (tempNode.right != null) {
                    queue.add(tempNode.right);
                }
            }
        }

        void printParentOfNodes(){
            // Function to print parent of a given node can be implemented here
            if(root == null) return;
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            System.out.println(root.data + " is the root node and has no parent.");
            while(!queue.isEmpty()){
                Node current = queue.poll();
                if(current.left != null){
                    System.out.println("Parent of " + current.left.data + " is " + current.data + ", " + current.left.data + " -> " + current.data);
                    queue.add(current.left);
                }
                if(current.right != null){
                    System.out.println("Parent of " + current.right.data + " is " + current.data + ", " + current.right.data + " -> " + current.data);
                    queue.add(current.right);
                }
            }
        }
    }

    static BinaryTree createBinaryTree(){
        BinaryTree tree = new BinaryTree();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.insert(6);
        tree.insert(7);
        return tree;
    }

    static void performBasicOperationsOnBinaryTree(){
        // Basic binary tree operations are implemented here
        System.out.println("\nBinary Tree Operations:");
        BinaryTree tree = createBinaryTree();
        System.out.println("In-order traversal:");
        tree.printInOrder(tree.root);
        System.out.println("\nPre-order traversal:");
        tree.printPreOrder(tree.root);
        System.out.println("\nPost-order traversal:");
        tree.printPostOrder(tree.root);
        System.out.println("\nLevel-order traversal:");
        tree.printLevelOrder();
        System.out.println("\nParent of all nodes:");
        tree.printParentOfNodes();
        return;
    }

    public static void main(String[] args) {
        System.out.println("Trees in Java");
        performBasicOperationsOnTree();
        performBasicOperationsOnBinaryTree();
    }
    
}
