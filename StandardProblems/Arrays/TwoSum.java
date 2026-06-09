package StandardProblems.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import DataStructures.ArraysDemo.ArraysDemo;

public class TwoSum {

    // Find two indices whose values add up to target.

    static ArrayList<Integer> findTwoSumIndices(ArrayList<Integer> arrayList, long target){
        if(arrayList == null || arrayList.size() < 2){
            throw new IllegalArgumentException("Array List is null or less than 2 elements");
        }
        HashMap<Long, Integer> hashMap = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<arrayList.size(); i++){
            long currentElement = (long) arrayList.get(i);
            if(hashMap.containsKey(target-currentElement)){
                result.add(hashMap.get(target-currentElement));
                result.add(i);
                return result;
            } else {
                hashMap.put(currentElement, i);
            }
        }
        throw new IllegalArgumentException("Two Indexes are not found to get the target sum");
    }

        static ArrayList<Integer> findTwoSumIndicesInSortedArray(ArrayList<Integer> arrayList, long target){
        if(arrayList == null || arrayList.size() < 2){
            throw new IllegalArgumentException("Array List is null or less than 2 elements");
        }
        int low = 0;
        int high = arrayList.size()-1;
        ArrayList<Integer> result = new ArrayList<>();
        while(low<high){
            long currentSum = (long) (arrayList.get(low) + arrayList.get(high));
            if(currentSum == target){
                result.add(low);
                result.add(high);
                return result;
            } else if(currentSum > target){ // Current sum is greater than expected, reduce the sum by moving high to left
                high--;
            } else {
                low++; // Current sum is lesser than expected, increase the sum by moving low to right
            }
        }
        throw new IllegalArgumentException("Two Indexes are not found to get the target sum");
    }

    static long getTarget(ArrayList<Integer> arrayList) {
        if (arrayList == null || arrayList.size() < 2) {
            throw new IllegalArgumentException("ArrayList must have at least 2 elements");
        }
        int size = arrayList.size();
        int index1 = (int) (Math.random() * size);
        int index2;
        do {
            index2 = (int) (Math.random() * size);
        } while (index2 == index1);
        long target = (long) arrayList.get(index1) + arrayList.get(index2);
        return target;
    }

    public static void main(String[] args){
        ArrayList<Integer> arrayList = ArraysDemo.createArrayList();
        ArraysDemo.printAnArrayList(arrayList);
        try{
            long target = getTarget(arrayList);
            System.out.println("Target sum: " + target);
            ArrayList<Integer> targetIndices = findTwoSumIndices(arrayList, target);
            System.out.println("Two Indices are: ");
            ArraysDemo.printAnArrayList(targetIndices);
            Collections.sort(arrayList);
            ArraysDemo.printAnArrayList(arrayList);
            targetIndices = findTwoSumIndicesInSortedArray(arrayList, target);
            System.out.println("Two Indices are in sorted array: ");
            ArraysDemo.printAnArrayList(targetIndices);

        } catch (Exception e){
            System.out.println("Exception occred while getting two sum indices : " + e.getMessage());
        }
    }
    
}
