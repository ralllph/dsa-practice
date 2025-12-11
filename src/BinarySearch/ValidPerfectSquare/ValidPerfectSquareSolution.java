package src.BinarySearch.ValidPerfectSquare;

public class ValidPerfectSquareSolution {
    public boolean isPerfectSquare(int num) {
        if(num ==1) return true;
        int start = 1;
        int end = num/2;


        while(start<= end){
            int middle = start + ((end-start)/2);
            long middleSquared = (long) middle * middle;
            if(middleSquared > num){
                end = middle -1;
            }else if(middleSquared < num){
                start = middle + 1;
            }else{
                return true;
            }

        }

        return false;
    }

}
