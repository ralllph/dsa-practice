package src.BinarySearch.FirstBadVersion;

public class FirstBadVersionSolution {
    public int firstBadVersion(int n) {
        int start  = 0;
        int end = n;

        while(start < end){
            int middle = start + ((end-start)/2);
            //error here due to lack of access of class extended for function isBadVerion  on leetcode
            if(isBadVersion(middle) ){
                end = middle;
            }else{
                start = middle + 1;
            }
        }

        return start;

    }

    //creating random function for isBad to prevent error
    public static boolean isBadVersion(int num){
        return num > 5;
    }

}
