package src.BinarySearch.SqrtProblem;

import java.util.Arrays;

public class SqrtxSolution {

    public static int mySqrt(int sqrtNo) {
        //search square root with binary search
        return binarySearchSqrt(sqrtNo);
    }

    public static  int binarySearchSqrt(int sqrtNo){
        //binary search to find number in array when squared gives target
        int start = 1;
        //square root of a number can't be greater than half the number
        int end = sqrtNo/2;

        while (start<=end){
            int middle = start + ((end -start)/2);
            //handling edge case integer overflow
            long squaredValue = ((long) middle * middle);

            if(squaredValue> sqrtNo){
                end  = middle - 1;
            } else if (squaredValue < sqrtNo) {
                start = middle + 1;
            }else {
                return middle;
            }
        }

        //end holds the closes value to the square root after iteration terminates
        return end;
    }

}


