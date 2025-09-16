package LinearDataStructures.LinkedListsDemo;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collections;

public class DoublyLinkedListsDemo {

    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }

        Node createList(ArrayList<Integer> arr) {
            if( arr==null || arr.size() == 0 ) return null;
            Node head = new Node(arr.get(0));
            Node current = head;
            for(int i=1; i<arr.size(); i++){
                Node newNode = new Node(arr.get(i));
                current.next = newNode;
                newNode.prev = current;
                current = newNode;
            }
            return head;
        }

        void printList(Node head) {
            Node current = head;
            while(current != null){
                System.out.print(current.data + " <-> ");
                current = current.next;
            }
            System.out.println("null");
        }

        Node reverseList(Node head) {
            // Implementation of reversing a doubly linked list
            Node prev = null, current = head, next = null;
            while(current != null){
                next = current.next;
                current.next = prev;
                current.prev = next;
                prev = current;
                current = next;
            }
            return prev;
        }

        // Additional doubly linked list operations
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
            if(head != null){
                newNode.next = head;
                head.prev = newNode;
            }
            return newNode;
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
            newNode.prev = current;
        }

        void deleteNode(Node head, int key) {
            if(head == null) return;
            if(head.data == key){
                Node toDelete = head;
                head = head.next;
                if(head != null) head.prev = null;
                toDelete.next = null;
                toDelete.prev = null;
                toDelete = null;
                return;
            }
            Node current = head;
            while(current != null && current.data != key){
                current = current.next;
            }
            if(current != null){
                Node toDelete = current;
                if(current.next != null) current.next.prev = current.prev;
                if(current.prev != null) current.prev.next = current.next;
                toDelete.next = null;
                toDelete.prev = null;
                toDelete = null;
            }
        }
    }

    static void performBasicOperationsUsingNodeForDoublyLinkedList(){
        // Implementation of basic operations on doubly linked list
        Node node = new Node(0);
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);        
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        Node head = node.createList(arr);
        node.printList(head);
        head = node.reverseList(head);
        System.out.println("Reversed List:");
        node.printList(head);
        System.out.println("Length: " + node.length(head));
        System.out.println("Search 30: " + node.search(head, 30));  
        head = node.insertAtBeginning(head, 5);
        System.out.println("After inserting 5 at beginning:");
        node.printList(head);
        node.insertAtEnd(head, 60);
        System.out.println("After inserting 60 at end:");
        node.printList(head);
        node.deleteNode(head, 30);
        System.out.println("After deleting 30:");
        node.printList(head);
    }

    static void performBasicOperationsUsingJavaLinkedList(){
        // Implementation of basic operations on doubly linked list
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("Original List:");
        System.out.println(list);
        Collections.reverse(list);
        System.out.println("Reversed List:");
        System.out.println(list);
        System.out.println("Length: " + list.size());
        System.out.println("Search 30: " + list.contains(30));
        list.addFirst(5);
        System.out.println("After inserting 5 at beginning:");
        System.out.println(list);
        list.addLast(60);
        System.out.println("After inserting 60 at end:");
        System.out.println(list);
        list.remove(Integer.valueOf(30));
        System.out.println("After deleting 30:");
        System.out.println(list);
        System.out.println("LinkedList contains 20: " + list.contains(20));
        // Clear the LinkedList
        list.clear();   
        System.out.println("After clearing, LinkedList: " + list);
    }

    public static void main(String[] args) {
        performBasicOperationsUsingNodeForDoublyLinkedList();
        performBasicOperationsUsingJavaLinkedList();
    }
    
}
