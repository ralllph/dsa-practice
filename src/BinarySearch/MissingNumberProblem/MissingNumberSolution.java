package src.BinarySearch.MissingNumberProblem;

public class MissingNumberSolution {

    public static int searchMissingNumber(int[] arrayWithNumbers){
        int arrayLength = arrayWithNumbers.length;
        int start  = 0;
        int end = arrayLength - 1;
        int numberFound = 0;

        for(int i=0; i<arrayLength; i++){

                int target = arrayWithNumbers[i];

                while (start <= end) {
                    int middle = start + ((end - start) / 2);
                    if (middle > target) {
                        end = middle - 1;
                    } else if (middle < target) {
                        start = middle + 1;
                    }else{
                        break;
                    }

                }


             numberFound = i;

        }

        return numberFound;

    }

}