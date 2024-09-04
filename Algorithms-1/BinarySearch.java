import java.util.*;
public class BinarySearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements in a sorted manner (ascending):");
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target value:");
        int target = sc.nextInt();
        sc.close();
        binaryS(arr, target);
    }
    public static void binaryS(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        while(start<=end){
            int middle = start + (end-start)/2; //to make ssure the range isn't compromised for integer values
            if(arr[middle] == target){
                System.out.println("Target found at "+middle+" index.");
                break;
            }
            else if(target > arr[middle]){
                start = middle+1;
            }
            else if(target < arr[middle]){
                end = middle-1;
            }
        }
        if(start>end){System.out.println("Target not found.");}
    }
}
