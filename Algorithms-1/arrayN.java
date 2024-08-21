import java.util.*;
public class arrayN{
    /*to refresh the concepts of array 
    and to work on simple problems*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        //1D arrays:
        // int[] arr = new int[n];
        // /*another way of giving array definition: 
        // int[] arrN = {1, 2, 3};*/
        // /*obviously the indexing starts from 0
        // therefore, they are called 0 indexed arrays*/
        // for(int i = 0; i < n; i++){
        //     arr[i] = sc.nextInt();
        // }
        // for(int i = 0; i < n; i++){
        //     System.out.println(arr[i]);
    
        //2D arrays:
        int[][] twoD = new int[n][m];
        //n rows and m columns 
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                twoD[i][j] = sc.nextInt();
            }
        } 
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(twoD[i][j]+" ");
            }
            System.out.println();
        }
    }
}
