public class demo {
    public static void swap(int marks[]){
        int temp=marks[0];
        marks[0]=marks[1];
        marks[1]=temp;
    }
    public static void main(String[] args) {
        int marks[]=new int[5];
        marks[0]=50;
        marks[1]=30;
        System.out.println("marks[0] = "+marks[0]);
        System.out.println("marks[1] = "+marks[1]);
        swap(marks);
        System.out.println("after swapping");
        System.out.println("marks[0] = "+marks[0]);
        System.out.println("marks[1] = "+marks[1]);

    }
}
