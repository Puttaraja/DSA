package StandardProblems.Arrays;

import java.util.ArrayList;

import DataStructures.ArraysDemo.ArraysDemo;

public class MoveZeroes {

    // Insert zeroes in between non-zero elements to create a test case for the moveZeroes method
    static ArrayList<Integer> insertZeroesInBetweenNonZeroElements(ArrayList<Integer> arrayList){
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer num : arrayList) {
            result.add(0); // Insert a zero before each non-zero element
            result.add(num);
            result.add(0); // Insert a zero after each non-zero element
        }
        return result;
    }

    // Move all zeroes to the end while maintaining relative order of non-zero elements.
    static void moveZeroes(ArrayList<Integer> arrayList){
        if(arrayList == null || arrayList.size() == 0){
            throw new IllegalArgumentException("ArrayList cannot be null or empty");
        }
        Integer nonZeroIndex = 0; // This index will keep track of the position to place the next non-zero element
        for(int i=0; i<arrayList.size(); i++){
            Integer currentElement = arrayList.get(i);
            if(currentElement != 0){
                if(nonZeroIndex != i){    // Only set if the nonZeroIndex is different from the current index to avoid unnecessary writes
                    arrayList.set(nonZeroIndex, currentElement);
                }
                nonZeroIndex++;
            }
        }
        // Fill the remaining positions with zeroes
        for(int i=nonZeroIndex; i<arrayList.size(); i++){
            arrayList.set(i, 0);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = ArraysDemo.createArrayList(); // this method creates and returns an ArrayList of integers
        ArrayList<Integer> input = insertZeroesInBetweenNonZeroElements(arrayList); // Insert zeroes in between non-zero elements to create a test case for the moveZeroes method
        System.out.println("ArrayList before moving zeroes: ");
        ArraysDemo.printAnArrayList(input); // Print the array list with zeroes to verify its contents
        try{
            moveZeroes(input);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("ArrayList after moving zeroes: ");
        ArraysDemo.printAnArrayList(input); // Print the array list after moving zeroes
    }
}
