package githubCode.mergeSort;

public class MyMergeSort {

    int arr1[];

    public MyMergeSort(int size) {
        arr1 = new int[size];
    }

    public void mergesort(int arr[], int lowerBound, int upperBound) {
        if(lowerBound < upperBound) {
            int mid = (lowerBound + upperBound) / 2;
            // left side array
            mergesort(arr, lowerBound, mid);
            // right side array
            mergesort(arr, mid + 1, upperBound);
            merge(arr, lowerBound,mid , upperBound);
        }
    }   // end of the merge sort method

    public void merge(int arr[], int lowerBound, int mid, int upperBound) {
        int i = lowerBound;
        int j = mid + 1;
        int k = lowerBound;

        while (i <= mid && j <= upperBound) {
            if (arr[i] <= arr[j]) {
                arr1[k] = arr[i];
                i++;
            } else {
                arr1[k] = arr[j];
                j++;
            }
            k++;
        }   // end of while loop

        if (i > mid) {
            while (j <= upperBound) {
                arr1[k] = arr[j];
                j++;
                k++;
            }
        } else {
            while (i <= mid) {
                // here i mistakely mention arr instead of arr1
                arr1[k] = arr[i];
                i++;
                k++;
            }
        }// end of else block

        for(k = lowerBound; k <= upperBound; k++) {
            arr[k]= arr1[k];
        }
    }
}
