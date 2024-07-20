public class subArray {
    public static void main(String[] args) {
        int arr[]={2,4,6,8};
        int n=arr.length;
        int start=0;
        while (start<n) {
            for(int i=start;i<n;i++){
                for(int j=start;j<=i;j++){
                    System.out.print("["+arr[j] +"]");
                }
            }
            System.out.println();
            start++;
        }
    }
}
