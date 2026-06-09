package StandardProblems.Arrays;

import java.util.ArrayList;
import java.util.Collections;

import DataStructures.ArraysDemo.ArraysDemo;

public class MissingNumber {
    
    // Given an array containing numbers from: 0 to n, with one number missing, find the missing number.
    static Integer findMissingNumberUsingCyclicSortApproach(ArrayList<Integer> arrayList){
        if(arrayList == null || arrayList.isEmpty()){
            throw new IllegalArgumentException("ArrayList cannot be null or empty");
        }
        int i=0;
        while(i< arrayList.size()){
            Integer currentElement = arrayList.get(i); // Place the currentElement in its correctPosition
            if(currentElement<arrayList.size() && currentElement != arrayList.get(currentElement)){
                Collections.swap(arrayList, i, currentElement);
            }
            else{ // If its in correct position move forward by one step and explore the array
                i++;
            }
        }
        System.out.println("Array after positioning its elements in correct place");
        ArraysDemo.printAnArrayList(arrayList);
        for(i=0;i<arrayList.size();i++){
            if(i != arrayList.get(i)){
                return i;
            }
        }
        return arrayList.size();
    }

    // A more efficient approach to find the missing number is to use the formula for the sum of the first n natural numbers, which is n*(n+1)/2. We can calculate the expected sum for numbers from 0 to n and then subtract the actual sum of the elements in the array from it to find the missing number.
    static Integer findMissingNumberUsingSumFormula(ArrayList<Integer> arrayList){
        if(arrayList == null || arrayList.isEmpty()){
            throw new IllegalArgumentException("ArrayList cannot be null or empty");
        }
        int n = arrayList.size(); // Since one number is missing, the size of the array list will be n instead of n+1
        int expectedSum = n * (n + 1) / 2; // Sum of first n natural numbers
        int actualSum = 0;
        for (Integer num : arrayList) {
            actualSum += num;
        }
        return expectedSum - actualSum; // The difference will give us the missing number
    }

    // Using XOR method: The idea is to XOR all the numbers from 0 to n and then XOR the result with all the numbers in the array. The final result will be the missing number.
    static Integer findMissingNumberUsingXOR(ArrayList<Integer> arrayList){
        if(arrayList == null || arrayList.isEmpty()){
            throw new IllegalArgumentException("ArrayList cannot be null or empty");
        }
        int n = arrayList.size(); // Since one number is missing, the size of the array list will be n instead of n+1
        int xorAllNumbers = 0;
        for (int i = 0; i <= n; i++) {
            xorAllNumbers ^= i; // XOR all numbers from 0 to n
        }
        int xorArrayElements = 0;
        for (Integer num : arrayList) {
            xorArrayElements ^= num; // XOR all elements in the array list
        }
        return xorAllNumbers ^ xorArrayElements; // The result will be the missing number
    }


    // Create an array of size n with numbers from 0 to n, with one number missing, and test the findMissingNumber method.
    static ArrayList<Integer> createArrayWithMissingNumber(){
        Integer n = (int) (Math.random() * 10) + 1; // Generate a random number between 1 and 100 for the size of the array
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0; i<=n; i++){
            arrayList.add(i);
        }
        // Remove a random number from the array list to create a test case for the findMissingNumber method
        int missingIndex = (int) (Math.random() * arrayList.size()); 
        arrayList.remove(missingIndex);
        return arrayList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = createArrayWithMissingNumber();
        try {
            System.out.println("ArrayList with missing number: " + arrayList);
            Integer missingNumberUsingSumFormula = findMissingNumberUsingSumFormula(arrayList);
            Integer missingNumberUsingXORMethod = findMissingNumberUsingXOR(arrayList);
            Integer missingNumberUsingCyclicSortApproach = findMissingNumberUsingCyclicSortApproach(new ArrayList<>(arrayList));
            System.out.println("Missing number using sum formula: " + missingNumberUsingSumFormula);
            System.out.println("Missing Number using XOR method: " + missingNumberUsingXORMethod);
            System.out.println("Missing Number Using Cyclic Sort Approach: " + missingNumberUsingCyclicSortApproach);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
