package StandardProblems.Arrays;

import java.util.ArrayList;
import java.util.Collections;

import DataStructures.ArraysDemo.ArraysDemo;

public class FindLargestElement {

    // Brute Force 
    static Integer findLargestBruteForce(ArrayList<Integer> arrayList){
        if(arrayList == null || arrayList.size() == 0){
            throw new IllegalArgumentException("ArrayList cannot be null or empty");
        }
        Integer largest = arrayList.get(0); // Initialize largest with the first element
        for (Integer num : arrayList) {
            if (num != null && (largest == null || num > largest)) {
                largest = num;
            }
        }
        return largest;
    }

    static Integer findLargestUsingCollections(ArrayList<Integer> arrayList){
        if(arrayList == null || arrayList.size() == 0){
            throw new IllegalArgumentException("ArrayList cannot be null or empty");
        }
        return Collections.max(arrayList);
    }

    // Sorting O(nlogn) approach can also be used but it is not efficient for this problem as we only need the largest element and not the sorted order of the array.
    static Integer findLargestUsingSorting(ArrayList<Integer> arrayList){
        if(arrayList == null || arrayList.size() == 0){
            throw new IllegalArgumentException("ArrayList cannot be null or empty");
        }
        Collections.sort(arrayList);
        return arrayList.get(arrayList.size() - 1); // The largest element will be at the end of the sorted list
    }


    public static void main(String[] args) {
        ArrayList<Integer> arrayList = ArraysDemo.createArrayList(); // this method creates and returns an ArrayList of integers
        ArraysDemo.printAnArrayList(arrayList); // Print the array list to verify its contents
        Integer largestBruteForce = null;
        Integer largestUsingCollections = null;
        Integer largestUsingSorting = null;
        try {
            largestBruteForce = findLargestBruteForce(arrayList);
            largestUsingCollections = findLargestUsingCollections(arrayList);
            largestUsingSorting = findLargestUsingSorting(arrayList);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("The largest element in the array is: " + largestBruteForce);
        System.out.println("The largest element in the array using Collections.max is: " + largestUsingCollections);
        System.out.println("The largest element in the array using sorting is: " + largestUsingSorting);
    }

}

