package quickSort;

public class Main {
    public static void main(String[] args) {
        int arr[] = {45, 6, 89, 2, 30, 50, 20};
        QuickSort.quickSort(arr, 0, arr.length - 1);
        QuickSort.display(arr);
    }
}
