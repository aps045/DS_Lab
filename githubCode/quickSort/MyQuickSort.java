package githubCode.quickSort;

// Quick sort
// This algorithm is similar to merge sort algorithm
// it is also based on divide and conquer strategy
// concept of quick stort algorithm is
// At each step it finds "pivot" mand then make sure that all the smaller elements
// are at left side of the pivot and all the bigger elements are at right side of the
// pivot.
// it does it recursively until the entire array is sorted
// unlike merge sort it does not require esternal space


public class MyQuickSort {

    public static void  quicksort(int[] arr, int start, int end)
    {
        if(start<end)
        {
            int pivot = partition(arr,start,end);
            // Recursive Call to the quick sort method
            //  for left part
            quicksort(arr,start, pivot-1);
            //  for right part
            quicksort(arr, pivot+1,end);
        }

    }

    // Main logic of quick sort Algorithm
    // where we find the appropriate place of pivot element and partition the array
    public static int partition (int arr[], int p, int q)
    {
        int pivot = q;
        int i = p-1;
        for(int j = p ;j<=q;j++)
        {
            if(arr[j]<= arr[pivot])
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]= temp;
            }
        }
        return i ;
    }
    public static void display(int arr[])
    {
        for(int i =0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
