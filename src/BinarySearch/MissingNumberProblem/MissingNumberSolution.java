package src.BinarySearch.MissingNumberProblem;

import java.util.Arrays;

public class MissingNumberSolution {

    public static int searchMissingNumber(int[] arrayWithNumbers){
        //using binary search by boundary
        //sort array
        Arrays.sort(arrayWithNumbers);
        int start = 0;
        int end = arrayWithNumbers.length;

        while(start <end){
            int middle = start + ((end - start)/2);
            if(arrayWithNumbers[middle] > middle){
                //check left for previous occurrence, check from middle value to left for
                // possible previous occurrence
                end = middle;
            }else{
                //the number isn't greater than index  meaning first occurrence of +1 change
                // is to the right
                start = middle + 1;
            }
        }

        //s At this point start == end. so start index and end index points to the same number
        // that was first incremented by 1
        return start;
    }

}