import java.util.*;
public class L14_15_16 {
    public static void main(String[] args) {
        //focuses on 4 operations: GET | SET | CLEAR | UPDATE using bitmasking concepts
        //getting the 3rd bit of n = 0101 
        // int n = 5;
        // int pos = 3;
        // int bitMask = 1<<pos;
        // if((bitMask & n) == 0) {
        //     System.out.println("bit was 0");
        // } else {
        //     System.out.println("bit was 1");
        // }
        //rest of the operations can be performed easily as well   
        //3 basic sorting  concepts: 
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x]; 
        for(int a=0; a<x; a++){
            System.out.println("Enter the element at "+a+" position:");
            arr[a] = sc.nextInt();
        }
        //A. Bubble Sort
        // for(int a=0; a<x; a++){
        //     for(int j=0; j<x-1-a; j++){
        //         if(arr[j]>arr[j+1]){
        //             //swap
        //             int temp = arr[j+1];
        //             arr[j+1]=arr[j];
        //             arr[j]=temp;
        //             //explore the concepts of using
        //             //bits to swap the elements in Java
        //         }
        //     }
        // }
        // //B. Selection Sort
        // for(int a=0; a<x; a++){
        //     int l = a;
        //     for(int j=a+1; j<x; j++){
        //         if(arr[j]<arr[l])
        //             l = j;}
        //     int temp = arr[a];
        //     arr[a]=arr[l];
        //     arr[l]=temp;
        //     }
        //C. Insertion Sort
        for(int a=0; a<x; a++){
            int current = arr[a];
            int j = a-1;
            while(j>=0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        } 
        //printint the sorted array
        for(int r=0; r<x; r++){
            System.out.print(arr[r]+" ");
        }
}}
