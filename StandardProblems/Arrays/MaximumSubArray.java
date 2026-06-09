package StandardProblems.Arrays;

import java.util.ArrayList;

import DataStructures.ArraysDemo.ArraysDemo;

public class MaximumSubArray {

    // Find the contiguous subarray having maximum sum.
    static Integer findContiguousMaxSubarraySum(ArrayList<Integer> arrayList){
        if(arrayList == null || arrayList.size() == 0){
            throw new IllegalArgumentException("Array list is null or empty");
        }
        Integer currentSum = arrayList.get(0), maxSum = arrayList.get(0);
        for(int i=1; i<arrayList.size(); i++){
            Integer num = arrayList.get(i);
            currentSum = Integer.max(num, currentSum+num);
            maxSum = Integer.max(currentSum, maxSum);
        }
        return maxSum;
    }

    // FInd the indexes of maxSubArraySum
    static ArrayList<Integer> findIndexesOfMaxSubArraySum(ArrayList<Integer> arrayList){
        if(arrayList == null || arrayList.size() == 0){
            throw new IllegalArgumentException("Array list is null or empty");
        }
        ArrayList<Integer> res = new ArrayList<>();
        int startIndex = 0, endIndex = 0, tempStart = 0, currentSum = arrayList.get(0), maxSum = arrayList.get(0);
        for(int i=1; i<arrayList.size(); i++){
            int num = arrayList.get(i);
            if(currentSum + num < num){
                currentSum = num;
                tempStart = i;
            } else {
                currentSum += num;
            }
            if(maxSum < currentSum){
                maxSum = currentSum;
                startIndex = tempStart;
                endIndex = i;
            }
        }
        res.add(startIndex);
        res.add(endIndex);
        return res;
    }

    // Adding Ngative elements in between
    static ArrayList<Integer> createArrayListWithNegatives() {
        int size = (int) (Math.random() * 10) + 5;
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-((int) (Math.random() * 20) + 1));
        for (int i = 1; i < size; i++) {
            int num = (int) (Math.random() * 41) - 20;
            arrayList.add(num);
        }
        return arrayList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = createArrayListWithNegatives();
        ArraysDemo.printAnArrayList(arrayList);
        try{
            Integer sum = findContiguousMaxSubarraySum(arrayList);
            System.out.println("Maximum Contiguous Subarray sum is: " + sum);
            ArrayList<Integer> indices = findIndexesOfMaxSubArraySum(arrayList);
            System.out.println("Array Indices ");
            ArraysDemo.printAnArrayList(indices);
        } catch(Exception e){
            System.out.println("Exception occured while getting the max subarray sum: " + e.getMessage());
        }
    }
}
