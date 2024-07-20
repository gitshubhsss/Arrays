public class sortedArray {
    public static void main(String[] args) {
        int arr[]={2,4,3,6,9,1,8};
        int small;
        int i=0;
        while (i<arr.length) {
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    small=arr[j];
                    arr[j]=arr[i];
                    arr[i]=small;
                }
            }
            System.out.print(arr[i]+" ");
            i++;
        }
    }
}
