package githubCode.binaryHeap;

//  min heap
public class BinaryHeapWithArray {
    int arr[];              //instance variable
    int sizeOfTree;         // instance variable
    public BinaryHeapWithArray(int size) // parameterised constructor
    {
        arr = new int[size+1];
        sizeOfTree = 0;
    }

    public int sizeOfArray() {
        return arr.length;
    }

    public int getSizeOfTree() {
        return sizeOfTree;
    }

    public void deleteHeapTree() {
        arr = null;
        System.out.println("heap deleted");
    }

    public boolean isHeapEmpty() {
        if (sizeOfTree == 0)
            return true;
        else
            return false;
    }

    public void peekInHeap() {
        if (sizeOfTree == 0)
            System.out.println("Heap Empty");
        else
            System.out.println(arr[1]);
    }

    public void insert(int value) {
        arr[sizeOfTree + 1] = value;
        sizeOfTree++;
        heapify(sizeOfTree);
    }

    public void heapify(int index) {
        int parent = index / 2;
        if (index <= 1)
            return;
        if (arr[index] < arr[parent]) {
            int temp = arr[index];
            arr[index] = arr[parent];
            arr[parent] = temp;
        }
        heapify(parent);
    }

    public void display() {
        for(int i =1; i <= sizeOfTree; i++)
            System.out.println(arr[i]);
    }

    public int extract() {
        if(sizeOfTree == 0) {
            System.out.println("heap is empty");
            return -1;
        }
        else
        {
            int result = arr[1];
            arr[1] = arr[sizeOfTree];
            sizeOfTree--;
            heapifyExtract(1);
            return result;
        }
    }

    /*
    * the only element that can be extracted from a heap i.e root
    * we cannot extract other element that is the property of heap
    * if we extract root element then we need some adjustment
    * so the last element in the heap will always be considered as root
    * after promoting the last element at root we will check it satisfies the min heap property
    * if not then we swap the values (after comparing the left and right side values)
    * and we will implement this recursively
     */

    public void heapifyExtract(int index) {
        int left = index *2;
        int right = (index*2)+1;
        int smallestChild= 0;

        if(sizeOfTree < left)
            return;
        else if(sizeOfTree == left) {
            if(arr[index] > arr[left]) {
                int temp = arr[index];
                arr[index] = arr[left];
                arr[left] = temp;
            }
            return;
        } else {
            if(arr[left] < arr[right])
                smallestChild = left;
            else
                smallestChild = right;
            if(arr[index] > arr[smallestChild]) {
                int temp = arr[index];
                arr[index]= arr[smallestChild];
                arr[smallestChild] = temp;
            }
        }
        heapifyExtract(smallestChild);
    }
}
