package StandardProblems.Arrays;

import java.util.ArrayList;

import DataStructures.ArraysDemo.ArraysDemo;

public class StockBuyAndSell {
    
    // Perform one buy and one sell operation to maximize profit.
    static Integer getMaximumProfit(ArrayList<Integer> arrayList) throws Exception {
        if(arrayList == null || arrayList.size() < 2){
            throw new IllegalArgumentException("Array list is null or empty or min 2 elements are not present");
        }
        Integer minPrice = arrayList.get(0), maxProfit = 0;
        for(int i=1; i<arrayList.size(); i++){
            Integer num = arrayList.get(i);
            Integer currentProfit = num - minPrice;
            maxProfit = Integer.max(currentProfit, maxProfit);
            minPrice = Integer.min(minPrice, num);
        }
        return maxProfit;
    }

    public static void main(String[] args){
        ArrayList<Integer> arrayList = ArraysDemo.createArrayList();
        ArraysDemo.printAnArrayList(arrayList);
        try{
            Integer maxProfit = getMaximumProfit(arrayList);
            System.out.println(maxProfit);
        } catch(Exception e){
            System.out.println("Exception occured while getting the maximum profit: "+ e.getMessage());
        }
    }

}
