package StandardProblems.Arrays;

import java.util.ArrayList;

import DataStructures.ArraysDemo.ArraysDemo;

import java.util.Collections;

public class RemoveDuplicates {

    // Removes duplicates from an sorted array list and returns number of uniques elements in the array list. 
    // The unique elements are moved to the beginning of the array list.
    static Integer removeDuplicates(ArrayList<Integer> arrayList){
        if(arrayList == null || arrayList.size() == 0){
            throw new IllegalArgumentException("ArrayList cannot be null or empty");
        }
        int uniqueIndex = 0; // Start from the second element in iteration as the first element is always unique
        for(int i=1; i<arrayList.size(); i++){
            if(!arrayList.get(i).equals(arrayList.get(uniqueIndex))){ // Compare current element with the uniqueElement, if they are not equal then we have found a unique element
                uniqueIndex++; // Increment uniqueIndex for the next unique element
                if(uniqueIndex != i){ // Only set if the uniqueIndex is different from the current index to avoid unnecessary writes
                    arrayList.set(uniqueIndex, arrayList.get(i));
                }
            }
        }
        return uniqueIndex+1; // The number of unique elements in the array list
    }

    
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = ArraysDemo.createArrayList();   
        ArrayList<Integer> copy = new ArrayList<>(arrayList); // Create a copy of the original array list to avoid modifying it
        // Add both arrays arrayList and copy so that we can compare the original array list with the one after removing duplicates
        ArrayList<Integer> combined = new ArrayList<>();
        combined.addAll(arrayList);
        combined.addAll(copy);
        Collections.sort(combined); // Sort the combined list to bring duplicates together
        System.out.println("Combined ArrayList before removing duplicates: ");
        ArraysDemo.printAnArrayList(combined); // Print the combined array list to verify its contents
        Integer uniqueCount = removeDuplicates(combined);
        ArrayList<Integer> uniqueElements = new ArrayList<>(combined.subList(0, uniqueCount));
        System.out.println("ArrayList after removing duplicates: ");
        ArraysDemo.printAnArrayList(uniqueElements);
    }
}
