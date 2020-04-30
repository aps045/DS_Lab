package githubCode.binaryHeap;

public class BinaryHeapWithArrayMain {
    public static void main(String[] args) {
        BinaryHeapWithArray obj = new BinaryHeapWithArray(5);
        obj.insert(12);
        obj.insert(7);
        obj.insert(6);
        obj.insert(10);
        obj.insert(8);
//        obj.display();
//        System.out.println(obj.getSizeOfTree());
        System.out.println(obj.extract());
        System.out.println(obj.extract());
        System.out.println(obj.extract());
        System.out.println(obj.extract());
        System.out.println(obj.extract());
    }
}
