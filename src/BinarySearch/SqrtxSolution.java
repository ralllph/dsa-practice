package src.BinarySearch;

import java.util.Arrays;

public class SqrtxSolution {

    public static int mySqrt(int sqrtNo) {
        //edge case
        if(sqrtNo ==0) return 0;
        //form array in ascending form up to the desired square root number
        int[] searchArray = new int[sqrtNo];
        for(int i=0; i<sqrtNo; i++){
            searchArray[i] = i+1;
        }

        //search square root with binary search
        return binarySearchSqrt(searchArray,sqrtNo);
    }

    public static  int binarySearchSqrt(int[] searchArray, int sqrtNo){
        //binary search to find number in array when squared gives target
        int start = 0;
        int end = searchArray.length - 1;


        while (start<=end){
            int middle = start + ((end -start)/2);
            //handling edge case integer overflow
            long squaredValue = ((long) searchArray[middle] * searchArray[middle]);

            if(squaredValue> sqrtNo){
                end  = middle - 1;
            } else if (squaredValue < sqrtNo) {
                start = middle + 1;
            }else {
                return searchArray[middle];
            }
        }

        //end holds the closes value to the squaree root after iteration terminates
        return searchArray[end];
    }
}


