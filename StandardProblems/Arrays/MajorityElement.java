package StandardProblems.Arrays;

import java.util.ArrayList;
import java.util.Collections;

import DataStructures.ArraysDemo.ArraysDemo;

public class MajorityElement {

    // Find the element appearing more than: n/2 times
    static Integer findMajorityElementUsingMooreVotingMethod(ArrayList<Integer> arrayList){
        if(arrayList == null || arrayList.size() == 0){
            throw new IllegalArgumentException("Array is null or empty");
        }
        Integer candidate = arrayList.get(0), count = 1;
        for(int i=1; i<arrayList.size(); i++){
            Integer num = arrayList.get(i);
            if(count == 0){
                candidate = num; 
                count = 1;
            } else if(candidate == num){
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }

    static ArrayList<Integer> createArrayListForMajorityElement() {
        int size = (int) (Math.random() * 10) + 5; // 5 to 14
        ArrayList<Integer> arrayList = new ArrayList<>();
        int majorityElement = (int) (Math.random() * 20) - 10;
        int majorityCount = size / 2 + 1;
        // Add majority element
        for (int i = 0; i < majorityCount; i++) {
            arrayList.add(majorityElement);
        }
        // Fill remaining positions
        while (arrayList.size() < size) {
            int num;
            do {
                num = (int) (Math.random() * 20) - 10;
            } while (num == majorityElement);

            arrayList.add(num);
        }
        // Shuffle the array
        Collections.shuffle(arrayList);
        return arrayList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = createArrayListForMajorityElement();
        ArraysDemo.printAnArrayList(arrayList);
        try{
            Integer majorityElement = findMajorityElementUsingMooreVotingMethod(arrayList);
            System.out.println("Majority Element in the array is: " + majorityElement);
        } catch(Exception e){
            System.out.println("Exception occured while fetching majority element due to " + e.getMessage());
        }
    }
    
}
