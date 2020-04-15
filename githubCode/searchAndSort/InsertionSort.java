package githubCode.searchAndSort;

//In insertion sort we take the array and divide it into two parts  i.e sorted  or unsorted

// then we go to the unsorted array and take the first element from it and then we find the exact position  of the

// element in the sorted array and we place it in the sorted array

// after completing this step we  continue doing the same steps till unsorted array is not empty

//after completing all the above steps we will get the sorted array

public class InsertionSort {
    public static void main(String[] args) {
        int val ;
        int j ;
        int arr[] = {30, 10, 50, 20, 90, 40};

        // outer loop that keeps track of how many times the insertion needs to be done

        // here i am initializing the variable i with 1 because  we can insert first value directly into the sorted side of the array directly
        for(int i = 1; i < arr.length; i++)  // from  1st index it needs to compare the values with the values already
        {                                    // available on the sorted side of the array
            val = arr[i];
            j = i - 1;
            // inner loop that takes care of swapping and comparision tasks
            while (j >= 0 && arr[j] > val) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1] = val;
        }

        // loop to display the contents
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
