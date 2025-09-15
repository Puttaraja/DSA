package LinearDataStructures.ArraysDemo;
import java.util.ArrayList;
import java.util.Collections;

public class ArraysDemo {

    static void printAnArrayList(ArrayList<Integer> arrayList){
        System.out.print("ArrayList elements: ");
        for (int num : arrayList) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    static void basicsOfArrays(){
        int[] arr = new int[5]; // Declaration and instantiation
        arr[0] = 10; // Initialization
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        // Accessing elements
        System.out.println("\nElement at index 2: " + arr[2]);

        // Traversing the array
        System.out.print("Array elements: ");
        for (int i = 0; i < arr.length; i++) {   // length property to get the size of the array
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //using arrayList and enhanced for loop
    static void arrayListAndEnhancedForLoop(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);

        // Accessing elements using enhanced for loop
        System.out.print("\nArrayList elements: ");
        for (int num : arrayList) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    //perform basic operations on arrayList
    static void basicOperationsOnArrayList(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        // Accessing elements
        System.out.println("\nElement at index 1: " + arrayList.get(1));

        // Removing an element
        arrayList.remove(1); // Removes the element at index 1
        printAnArrayList(arrayList);

        arrayList.remove(Integer.valueOf(40));  // removes by value
        printAnArrayList(arrayList);

        //Modifying an element
        arrayList.set(1, 25); // Sets the element at index 1 to 25
        printAnArrayList(arrayList);

        // Size of the ArrayList
        System.out.println("Size of ArrayList: " + arrayList.size());

        // Checking if an element exists
        if (arrayList.contains(25)) {
            System.out.println("25 is in the list!");
        } else {
            System.out.println("25 is not in the list!");
        }

        System.out.println("ArrayList elements using enhanced for loop: ");
        for (int num : arrayList) {
            System.out.print(num + " ");
        }
    }

    //Collection to sort
    static void performBasicOperationsOnArrayListUsingCollection() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(30);
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(50);
        arrayList.add(40);

        System.out.println("\n\nArrayList before sorting: ");
        printAnArrayList(arrayList);

        // Sorting the ArrayList
        Collections.sort(arrayList);

        System.out.print("ArrayList after sorting: ");
        printAnArrayList(arrayList);

        // Searching for an element (binary search requires sorted list)
        int index = Collections.binarySearch(arrayList, 30); 
        if(index >= 0) {
            System.out.println("Element 30 found at index: " + index);
        } else {
            System.out.println("Element 30 not found in the list.");
        }

        // Sort in descending order using Comparator
        Collections.sort(arrayList, Collections.reverseOrder());
        System.out.print("ArrayList sorted in descending order: ");
        printAnArrayList(arrayList);

        // Reversing the ArrayList
        Collections.reverse(arrayList);
        System.out.print("ArrayList after reversing: ");
        printAnArrayList(arrayList);

        // Finding the maximum and minimum elements
        int max = Collections.max(arrayList);
        int min = Collections.min(arrayList);
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);

        // Shuffling the ArrayList
        Collections.shuffle(arrayList);
        System.out.print("ArrayList after shuffling: ");
        printAnArrayList(arrayList);

        // Swapping elements
        Collections.swap(arrayList, 0, arrayList.size() - 1);
        System.out.print("ArrayList after swapping first and last elements: ");
        printAnArrayList(arrayList);

        // Frequency of an element
        int frequency = Collections.frequency(arrayList, 20);
        System.out.println("Frequency of 20: " + frequency);

        // Copying the ArrayList
        ArrayList<Integer> copyList = new ArrayList<>(arrayList);
        System.out.print("Copied ArrayList: ");
        printAnArrayList(copyList);

        // Filling the ArrayList with a specific value
        Collections.fill(arrayList, 100);   // Fills all elements with 100      
        System.out.print("ArrayList after filling with 100: ");
        printAnArrayList(arrayList);

        // Example with String ArrayList
        ArrayList<String> names = new ArrayList<>();
        names.add("Raja");
        names.add("Amit");
        names.add("Zara");
        names.add("John");

        // Sort alphabetically
        Collections.sort(names);
        System.out.println("\nSorted names: " + names);

        // Reverse
        Collections.reverse(names);
        System.out.println("\nReversed names: " + names);

        // Array of ArrayList
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            matrix.add(new ArrayList<>());
            for (int j = 0; j < 3; j++) {
                matrix.get(i).add(i + j);
            }
        }
        
        System.out.println("\n2D ArrayList: " + matrix);

    }

    public static void main(String[] args) {
        basicsOfArrays();
        arrayListAndEnhancedForLoop();
        basicOperationsOnArrayList();
        performBasicOperationsOnArrayListUsingCollection();
    }

}
