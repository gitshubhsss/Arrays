public class leanear {
    public static int LeanearSearch(int arr[],int key){
        int index=0;
        int size=arr.length;
        while (index<size) {
                if(arr[index]==key){
                    return index;
                }
            index++;
        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12,14};
        int key=10;
        System.out.println(LeanearSearch(arr, key));;
    }
}
