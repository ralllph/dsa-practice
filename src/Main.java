package src;

import src.BinarySearch.MissingNumberProblem.MissingNumberSolution;
import src.BinarySearch.SqrtProblem.SqrtxSolution;

public class Main {
    public static void main(String[] args) {
        //test Binary search to find square root
        //System.out.println(SqrtxSolution.mySqrt(8));
        //test Binary search to find missing number
        System.out.println(MissingNumberSolution.searchMissingNumber((new int[] {9,6,4,2,3,5,7,0,1})));
    }

}
