public class largest {
    public static int largestNum(int arr[]){
        int index=0;
        int size=arr.length;
        int largest=0;
        int smallest=Integer.MAX_VALUE;
        while (index<size) {
            if(arr[index]<smallest){
                smallest=arr[index];
            }

            index++;
        }
        return smallest;
    }
    public static void main(String[] args) {
        int arr[]={1,2,8,6,8,45,59,5,25,4};
        System.out.println(largestNum(arr));
    }
}
