public class ReverseArr {
    public static void reverse(int arr[]){
        int size=arr.length;
        int n=size;
        // int end=n/2;
        int end=n;
        int temp;
        int i=0;
        while(i<end){
           temp=arr[i];
           arr[i]=arr[n-1-i];
           arr[n-1-i]=temp;
           i++;
           end--;
        }
        for(int idx=0;idx<n;idx++){
            System.out.print(arr[idx]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,4,85,8,58,4};
        reverse(arr);
    }
}
