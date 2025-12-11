package src.BinarySearch.ValidPerfectSquare;

public class ValidPerfectSquareSolution {
    public boolean isPerfectSquare(int num) {
        if(num ==1) return true;
        int start = 1;
        int end = num/2;

        while(start<= end){
            int middle = start + ((end-start)/2);
            if(middle * middle > num){
                end = middle -1;
            }else if(middle * middle < num){
                start = middle + 1;
            }else{
                return true;
            }

        }

        return false;
    }

}
