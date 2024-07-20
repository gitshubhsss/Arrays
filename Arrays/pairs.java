public class pairs {
    public static void printPair(int arr[]){
        int n=arr.length;
        int i=0;
        while (i<n) {
            int curr=arr[i];
            for(int j=i+1;j<n;j++){
                System.out.print("("+curr+","+arr[j]+")"+" ");
            }
            System.out.println();
            i++;
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        printPair(arr);
    }
}
