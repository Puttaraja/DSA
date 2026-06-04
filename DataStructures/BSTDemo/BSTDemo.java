package DataStructures.BSTDemo;

import java.util.LinkedList;
import java.util.Queue;

public class BSTDemo {

    static class Node {
        int data;
        Node left, right;

        public Node(int value){
            data = value;
            left = right = null;
        }

        Node insert(Node root, int value){
            if(root == null){
                return new Node(value);
            }
            if(value < root.data){
                root.left = insert(root.left, value);
            } else {
                root.right = insert(root.right, value);
            }
            return root;
        }

        void printInorder(Node root){
            if(root != null){
                printInorder(root.left);
                System.out.print(root.data + " ");
                printInorder(root.right);
            }
        }

        void printPreorder(Node root){
            if(root != null){
                System.out.print(root.data + " ");
                printPreorder(root.left);
                printPreorder(root.right);
            }
        }

        void printPostorder(Node root){
            if(root != null){
                printPostorder(root.left);
                printPostorder(root.right);
                System.out.print(root.data + " ");
            }
        }

        void printLevelOrder(Node root){
            if(root == null) return;
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            // prints level by level in new line
            while(!queue.isEmpty()){
                int levelSize = queue.size();
                for(int i=0; i<levelSize; i++){
                    Node currentNode = queue.poll();
                    System.out.print(currentNode.data + " ");
                    if(currentNode.left != null) queue.add(currentNode.left);
                    if(currentNode.right != null) queue.add(currentNode.right);
                }
                System.out.println(); // New line after each level
            }
        }

        void printParentChildRelationships(Node root){
            if(root != null){
                String parent = "Parent: " + root.data;
                String leftChild = "Left Child: " + (root.left != null ? root.left.data : "null");
                String rightChild = "Right Child: " + (root.right != null ? root.right.data : "null");
                System.out.println(parent + ", " + leftChild + ", " + rightChild);
                printParentChildRelationships(root.left);
                printParentChildRelationships(root.right);
            }
        }

        int findMin(Node root){
            if(root.left == null){
                return root.data;
            }
            return findMin(root.left);
        }

        int findMax(Node root){
            if(root.right == null){
                return root.data;
            }
            return findMax(root.right);
        }

        boolean search(Node root, int value){
            if(root == null){
                return false;
            }
            if(root.data == value){
                return true;
            }
            if(value < root.data){
                return search(root.left, value);
            } else {
                return search(root.right, value);
            }
        }

        Node delete(Node root, int value){
            if(root == null){
                return root;
            }
            if(root.data > value){
                root.left = delete(root.left, value);
            } else if(root.data < value){
                root.right = delete(root.right, value);
            } else {
                // Node with only one child or no child
                if(root.left == null && root.right == null){
                    return null;
                }
                if(root.left == null){
                    return root.right;
                } else if(root.right == null){
                    return root.left;
                }
                // Node with two children: Get the inorder successor (smallest in the right subtree)
                int successor = findMin(root.right);
                // Copy the inorder successor's data to this node
                root.data = successor;
                // Delete the inorder successor
                root.right = delete(root.right, successor);
            }
            return root;
        }

    }

    static int generateRandomNumber(int lower, int upper){
        return (int)(Math.random() * (upper - lower + 1)) + lower;
    }

    static Node createBST(){
        Node root = new Node(generateRandomNumber(1, 100));
        root = root.insert(root, generateRandomNumber(1, 100));
        root = root.insert(root, generateRandomNumber(1, 100));        
        root = root.insert(root, generateRandomNumber(1, 100));
        root = root.insert(root, generateRandomNumber(1, 100));
        root = root.insert(root, generateRandomNumber(1, 100));
        root = root.insert(root, generateRandomNumber(1, 100));
        root = root.insert(root, generateRandomNumber(1, 100));
        root = root.insert(root, generateRandomNumber(1, 100));        
        root = root.insert(root, generateRandomNumber(1, 100));
        root = root.insert(root, generateRandomNumber(1, 100));
        root = root.insert(root, generateRandomNumber(1, 100));
        root = root.insert(root, generateRandomNumber(1, 100));
        return root;
    }

    static void performBasicOperationsOnBST(Node root){
        System.out.println("Inorder Traversal of the BST: ");
        root.printInorder(root);
        System.out.println("\nPreorder Traversal of the BST: ");
        root.printPreorder(root);   
        System.out.println("\nPostorder Traversal of the BST: ");
        root.printPostorder(root);
        System.out.println("\nLevel Order Traversal of the BST: ");
        root.printLevelOrder(root);
        System.out.println("\nParent-Child Relationships in the BST: ");
        root.printParentChildRelationships(root);
        System.out.println("Minimum value in the BST: " + root.findMin(root));
        System.out.println("Maximum value in the BST: " + root.findMax(root));
        int searchValue = generateRandomNumber(1, 100);
        System.out.println("Searching for " + searchValue + " in the BST: " + root.search(root, searchValue));
        int deleteValue = generateRandomNumber(1, 100);
        System.out.println("BST before deletion:");
        root.printInorder(root);
        System.out.println("\nDeleting " + deleteValue + " from the BST...");
        root = root.delete(root, deleteValue);
        System.out.println("\nBST after deletion:");
        root.printInorder(root);
    }

    public static void main(String[] args) {
        Node root = createBST();
        performBasicOperationsOnBST(root);
    }
    
}
