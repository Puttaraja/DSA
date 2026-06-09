package StandardProblems.Arrays;

import java.util.ArrayList;

import DataStructures.ArraysDemo.ArraysDemo;

public class FindSecondLargestElement {
    
    static ArrayList<Integer> findLargestAndSecondLargest(ArrayList<Integer> arrayList){
        if(arrayList == null || arrayList.size() < 2){
            throw new IllegalArgumentException("ArrayList must contain at least two elements");
        }
        Integer largest = arrayList.get(0);
        Integer secondLargest = null;
        for(int i=1; i<arrayList.size(); i++){
            Integer num = arrayList.get(i);
            if(num > largest){
                secondLargest = largest; // Update second largest before updating largest
                largest = num;
            } else if(num < largest && (secondLargest == null || num > secondLargest)){ // will handle duplicate largest elements as well
                secondLargest = num; // Update second largest if num is between largest and current second largest
            }
        }
        if(secondLargest == null){
            throw new IllegalArgumentException("No second distinct largest element exists");
        }
        ArrayList<Integer> result = new ArrayList<>();
        result.add(largest);
        result.add(secondLargest);
        return result;
    }
    
    public static void main(String[] args) {
        // Implementation for finding the second largest element in an array will go here
        ArrayList<Integer> arrayList = ArraysDemo.createArrayList(); 
        ArraysDemo.printAnArrayList(arrayList); // Print the array list to verify its contents
        try {
            ArrayList<Integer> largestAndSecondLargest = findLargestAndSecondLargest(arrayList);
            System.out.println("The largest element in the array is: " + largestAndSecondLargest.get(0));
            System.out.println("The second largest element in the array is: " + largestAndSecondLargest.get(1));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
