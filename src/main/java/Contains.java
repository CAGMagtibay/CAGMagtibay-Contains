

public class Contains {

    /**
     * This method should search an array to see if that array contains some value.
     * You will need to use a for loop to check every value of the array to see if it matches the target value.
     *
     * @param arr array to be manipulated.
     * @param target the value that the method should be searching for.
     * @return true if arr contains target, false otherwise.
     */
    public boolean arrayContains(int[] arr, int target){
        boolean contains = false;                           // initialize boolean to be returned
        
        for (int i = 0; i < arr.length; i++) {              // iterate through array
            if (arr[i] == target) {                         // if any array element matches target value
                contains = true;
                break;
            }
        }
        
        return contains;
    }
}