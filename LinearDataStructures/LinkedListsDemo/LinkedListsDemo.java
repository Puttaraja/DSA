package LinearDataStructures.LinkedListsDemo;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collections;

public class LinkedListsDemo {
    
    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }

        Node createList(ArrayList<Integer> arr) {
            if( arr==null || arr.size() == 0 ) return null;
            Node head = new Node(arr.get(0));
            Node current = head;
            for(int i=1; i<arr.size(); i++){
                current.next = new Node(arr.get(i));
                current = current.next;
            }
            return head;
        }

        void printList(Node head) {
            Node current = head;
            while(current != null){
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }

        Node reverseList(Node head) {
            // Implementation of reversing a linked list
            Node prev = null, current = head, next = null;
            while(current != null){
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            return prev;
        }

        // Additional linked list operations
        int length(Node head) {
            int count = 0;
            Node current = head;
            while(current != null){
                count++;
                current = current.next;
            }
            return count;
        }

        boolean search(Node head, int key) {
            Node current = head;
            while(current != null){
                if(current.data == key) return true;
                current = current.next;
            }
            return false;
        }

        Node insertAtBeginning(Node head, int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
            return head;
        }

        void insertAtEnd(Node head, int data) {
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                return;
            }
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }

        void deleteNode(Node head, int key) {
            if(head == null) return;
            if(head.data == key){
                Node toDelete = head;
                head = head.next;
                toDelete.next = null; 
                toDelete = null; 
                return;
            }
            Node current = head;
            while(current.next != null && current.next.data != key){
                current = current.next;
            }
            if(current.next != null){
                Node toDelete = current.next;
                current.next = current.next.next;
                toDelete.next = null;
                toDelete = null;
            }
        }
    }

    static void performBasicOperationsUsingNodeForLinkedList() {
        Node node = new Node(0);
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);        
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        Node head = node.createList(arr);
        node.printList(head);
        Node reversedHead = node.reverseList(head);
        System.out.println("Reversed List:");
        node.printList(reversedHead);
        System.out.println("Length of List: " + node.length(reversedHead));
        System.out.println("Search for 30: " + node.search(reversedHead, 30));
        System.out.println("Search for 100: " + node.search(reversedHead, 100));
        reversedHead = node.insertAtBeginning(reversedHead, 5);
        System.out.println("After inserting 5 at beginning:");
        node.printList(reversedHead);   
        node.insertAtEnd(reversedHead, 60);
        System.out.println("After inserting 60 at end:");
        node.printList(reversedHead);
        node.deleteNode(reversedHead, 30);
        System.out.println("After deleting 30:");
        node.printList(reversedHead);
    }

    static void performBasicOperationsUsingJavaLinkedList() {
        LinkedList<Integer> list = new LinkedList<>();

        // Adding elements
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("\nInitial LinkedList: " + list);

        // Accessing elements
        System.out.println("Element at index 1: " + list.get(1));

        // Removing an element
        list.remove(1); // Removes the element at index 1
        System.out.println("After removing element at index 1: " + list);

        // Inserting an element at a specific position
        list.add(1, 15); // Inserts 15 at index 1
        System.out.println("After inserting 15 at index 1: " + list);

        // Traversing the list
        System.out.print("Traversing the LinkedList: ");
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Size of the LinkedList
        System.out.println("Size of LinkedList: " + list.size());

        // Check if the list contains a specific element
        System.out.println("LinkedList contains 20: " + list.contains(20));

        // Reverse the LinkedList
        Collections.reverse(list);
        System.out.println("Reversed LinkedList: " + list); 

        // Clear the LinkedList
        list.clear();
        System.out.println("After clearing, LinkedList: " + list);
    }

    public static void main(String[] args) {
        performBasicOperationsUsingNodeForLinkedList();
        performBasicOperationsUsingJavaLinkedList();
    }
}
