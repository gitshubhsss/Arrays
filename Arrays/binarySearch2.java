public class binarySearch2 {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12,14,16};
        int key=16;
        int size=arr.length;
        int start=0;
        int end=arr.length-1;

        while (start<=end) {
            int middle=(start+end)/2;
            if(arr[middle]==key){
                System.out.println(middle);
                break;
            }
            else if(key<middle){
                end=middle-1;
            }
            else{
                start=middle+1;
            }
        }
    }
}
