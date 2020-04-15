package quickSort;

public class QuickSort {

    /*
    * Some error is occured now
    * After resolving code will updated
    * Resolving means matching with github from Neeraj Sir repository
     */
    public static void quickSort(int arr[], int start, int end) {
        if (start < end) {
            int pivot = partition(arr, start, end);
            //  for left side
            quickSort(arr, start, pivot - 1);
            //  for right side
            quickSort(arr, pivot + 1, end);
        }
    }

    public static int partition(int arr[], int p, int q) {
        int pivot = q;
        int i = p - 1;
        int temp;
        for (int j = p; j <= q; j++) {
            // I mistakely mentioned here arr[j]<arr[pivot]
            // i forget to write = sign after that condition
            // kindly correct it at your end
            if (arr[j] <= arr[pivot]) {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }   //  end of loop
        return i;
    }

    public static  void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
