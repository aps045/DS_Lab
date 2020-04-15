package githubCode.mergeSort;

public class MyMergeSortMain {
    public static void main(String[] args) {
        int arr[]={20,10,30,13,7,89};
        MyMergeSort obj = new MyMergeSort(arr.length);
        // invocation of the merge sort method
        obj.mergesort(arr,0,arr.length-1);
        for (int i = 0;i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
