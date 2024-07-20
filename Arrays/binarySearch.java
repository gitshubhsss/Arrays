public class binarySearch {

    public static int BinarySearch(int arr[], int key) {
        int size = arr.length;
        int start = 0;
        int end = size;
        while (start < end) {
            int middleElement = (start + end) / 2;
            if (arr[middleElement] == key) {
                return middleElement;
            } else if (key < middleElement) {
                end = middleElement - 1;
            } else {
                start = middleElement + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 100;
        System.out.println(BinarySearch(arr, key));
    }
}
