package githubCode.quickSort;

public class MyQuickSortMain {
    public static void main(String[] args) {
        int arr[]= {8,3,5,98,76,23,35};
        MyQuickSort.quicksort(arr, 0,arr.length-1);
        MyQuickSort.display(arr);
    }
}
