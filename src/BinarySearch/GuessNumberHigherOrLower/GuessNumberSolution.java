package src.BinarySearch.GuessNumberHigherOrLower;

public class GuessNumberSolution {
    //This problem extends a Guess Game class in leet code
    public int guessNumber(int n){
        int start =  1;
        int end  = n;

        if(end<start){
            return - 1;
        }

        while(start<=end){
            int middle = start + ((end- start)/2);
            //no access to guess  function from leet code
            int guessed = guess(middle);

            if(guessed == 0){
                return middle;
            }
            else if(guessed == -1){
                end =middle - 1;
            }
            else if(guessed == 1){
                start = middle + 1;
            }

        }

        return -1;

    }

    //creating mock guess function
    public int guess(int number){
        if (number % 2 == 0){
            return 0;
        }else if(number%2 == 1){
            return -1;
        }else{
            return 1;
        }
    }

}
