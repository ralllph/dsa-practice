package src.BinarySearch.MissingNumberProblem;

public class MissingNumberSolution {

    public static int searchMissingNumber(int[] arrayWithNumbers){
        //changing attempt , sorting array first
        int arrayLength = arrayWithNumbers.length;
        int numberFound = 0;
        boolean isFound = false;
        boolean inArrayWithNums = false;


        for(int i=0; i<=arrayLength; i++){
            int start  = 0;
            int end = arrayLength-1 ;


            if(i < arrayLength){
                //int target = arrayWithNumbers[i];

                while (start <= end) {
                    int middle = start + ((end - start) / 2);
                    if (i > arrayWithNumbers[middle]) {
                        start = middle + 1;
                    } else if (i < arrayWithNumbers[middle]) {
                        end = middle - 1;
                    }else{
                        inArrayWithNums = true;
                        break;
                    }
                    inArrayWithNums = false;
                }


                if(!inArrayWithNums) return i;

            }else{
                isFound = true;
            }



                if(isFound) numberFound = i;

        }

        return numberFound;

    }

}