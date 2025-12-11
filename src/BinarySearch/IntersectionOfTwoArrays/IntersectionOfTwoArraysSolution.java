package src.BinarySearch.IntersectionOfTwoArrays;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoArraysSolution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //binary search by value approach
        if(nums1.length > nums2.length){
            Arrays.sort(nums1);
            return arrayIntersection(nums1,nums2);
        }else{
            Arrays.sort(nums2);
            return arrayIntersection(nums2,nums1);
        }

    }

    public int[] arrayIntersection(int[] larger, int[] smaller){
        ArrayList<Integer> arrayIntersection = new ArrayList<Integer>();

        for(int i = 0;  i<smaller.length; i++){
            int start = 0;
            int end = larger.length - 1;
            while(start<=end){
                int middle = start + ((end -start)/2);

                if(smaller[i] > larger[middle]){
                    start =middle + 1;
                }else if(smaller[i] < larger[middle]){
                    end = middle - 1;
                }else{
                    arrayIntersection.add(smaller[i]);
                    break;
                }

            }

        }

        return copyArrayListToArray(arrayIntersection);
    }

    public int[] copyArrayListToArray(ArrayList<Integer> arrayToConvert){
        return arrayToConvert.stream()
                .distinct()
                .mapToInt(Integer::intValue)
                .toArray();
    }

}
