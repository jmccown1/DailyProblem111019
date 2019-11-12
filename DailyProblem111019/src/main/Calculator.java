package main;

import java.util.List;

public class Calculator {
	
    public static void sort(List<Integer> arr, int low, int high) 
    {
    	// if array is empty, move on
        if (arr == null || arr.isEmpty()){
            return;
        }
        
        // move on if made it to middle of the list
        if (low >= high){
            return;
        }
 
        // get the middle 
        int middle = low + (high - low) / 2;
        int middleVal = arr.get(middle);
 
        int i = low, j = high;
        while (i <= j) 
        {
        	//move towards middle
            while (arr.get(i) < middleVal) 
            {
                i++;
            }
            while (arr.get(j) > middleVal) 
            {
                j--;
            }
            //swap when in wrong order
            if (i <= j) 
            {
                swap (arr, i, j);
                i++;
                j--;
            }
        }
        if (low < j){
            sort(arr, low, j);
        }
        if (high > i){
            sort(arr, i, high);
        }
    }
     
    // swap two elements in the list
    public static void swap (List<Integer> array, int x, int y)
    {
        int temp = array.get(x);
        array.set(x, array.get(y));
        array.set(y, temp);
    }
	
    // find the lowest missing positive number in a list
	protected Integer getLowestMissingPositiveNum (List<Integer> array) {
		Integer missingNum = 1;
		for(Integer i=0; i<array.size(); i++) {
			if(array.get(i)>0) {
				if(!array.get(i).equals(missingNum)) {
					return missingNum;
				}
				missingNum++;
			}
		}
		return missingNum;
	}
}
