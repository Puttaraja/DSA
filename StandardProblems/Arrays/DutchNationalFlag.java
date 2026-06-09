package StandardProblems.Arrays;

import java.util.ArrayList;
import java.util.Collections;

import DataStructures.ArraysDemo.ArraysDemo;

public class DutchNationalFlag {
    
    // Sort an array containing only: 0, 1, 2
    static ArrayList<Integer> sortAnArrayUsingDutchNationalFlagAlgo(ArrayList<Integer> arrayList){
        if(arrayList == null || arrayList.size() == 0){
            throw new IllegalArgumentException("Array List is null or empty");
        }
        int low = 0, mid = 0, high = arrayList.size()-1;
        while(mid<=high){
            int num = arrayList.get(mid);
            if(num == 0){
                Collections.swap(arrayList, low, mid);
                low++; mid++;
            } else if(num == 1){
                mid++;
            } else {
                Collections.swap(arrayList, mid, high);
                high--;
            }
        }
        return arrayList;
    }

    static ArrayList<Integer> createAnArrayListContainingOnly012(){
        int size = (int) (Math.random() * 20) * 10;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            int num = (int) (Math.random() * 3);
            arrayList.add(num);
        }
        return arrayList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = createAnArrayListContainingOnly012();
        ArraysDemo.printAnArrayList(arrayList);
        try{
            ArrayList<Integer> copy = new ArrayList<>(arrayList);
            ArrayList<Integer> result = sortAnArrayUsingDutchNationalFlagAlgo(copy);
            System.out.println("After sorting the elements are: ");
            ArraysDemo.printAnArrayList(result);
        } catch(Exception e){
            System.out.println("Exception occured while sorting the arraydue to, " + e.getMessage());
        }
    }
    
}
