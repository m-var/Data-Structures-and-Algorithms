import java.util.Scanner;

public class SortedOrNot {
    static boolean isSorted(int[] arr, int index) {
        if(index == arr.length-1)
            return true;
        if(arr[index]>arr[index+1])
            return false;
        return isSorted(arr, index+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int len = sc.nextInt();
        System.out.println("Enter array elements:");
        int[] arr = new int[len];
        for (int i = 0; i<len; i++){
            arr[i] = sc.nextInt();
        }
        if (isSorted(arr, 0))
            System.out.println("Sorted");
        else
            System.out.println("Unsorted");
        sc.close();
    }
}
