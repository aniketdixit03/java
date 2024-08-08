//package Algorithms-1;

import java.io.*;
import java.util.Scanner;

public class UnionFind {
    /*for the dynamic connectivity problem, the algorithm maintains a list of connected components, and the union command
    basically modifies itself by adding the connected components of the new members and connected command just checks if the 
    two members are present in the same connected components' list or not*/
    
    //solving the above problem with the help of quick find algorithm:
    /*
    Quick Find Algorithm makes sure that upon connection the objects that are initially stored with their index values in the array
    change their index value based on the value of the second element in the operation, further if the two elements are already stored 
    in two separate lists of connected components, and they are joined together they'll have the operation as all the connected components
    associated with the first element change their values based on the value of the second element.
     */

    static private int[] id;
    //the same is used for QuickUnion as well
    public static void  QuickFindUF(int N){
        id = new int[N];
        for(int i = 0; i<N; i++){
            id[i] = i;
        }
    }

    //for the optimization of the union operation or the QuickUnion algorithm, we perform the following set of operations
    private static int root(int i){
        while(i != id[i]) i=id[i];
        return i;
    }

    //this operation is done to find if the two elements are connected or not
    public static boolean connected(int p, int q){
        return id[p] == id[q];
    }

    public static void union(int p, int q){
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }

    /*public static void union(int p, int q){
        int pid = id[p];
        int qid = id[q];
        //we traverse the entire array and convert all values equal to the first argument to the value of the second
        for(int i = 0; i<id.length; i++){
            if(id[i]==pid){
                id[i]=qid;
            }
        }
    }*/

    // public static void main(String[] args) {
    //     int N = StdIn.redInt();
    //     UnionFind uf = new UnionFind(N);
    //     while(!StdIn.isEmpty()){
    //         int p = StdIn.readInt();
    //         int q = StdIn.readInt();
    //         if(!uf.connected(p,q)){
    //             uf.union(p,q);
    //             StdOut.println(p+" "+q); 
    //         }
    //     }
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        QuickFindUF(N);
        union(3,2);
        System.out.println(connected(0,1));
    }
}

/*To improve upon the inefficiency of the union operation in QuickFind, we move to the QuickUnion algorithm.
Here, each array element is considered to be a tree, the idea is that upon every union operation, the value changes to the
root of the 2nd element, that is if we perform union(2,3) then the value at 2nd index becomes 3 (or, the root of 3). For the find 
operation, we just check if the two elements' roots are same or not.
 */

/*One of the main issues with QuickUnion is that the trees get too tall and therefore, the time increases a lot
and to resolve this issue we use a method called Weighted QuickUnion where we keep a check on the size of the trees and 
make sure that the larger trees aren't connected to the smaller trees, and the vice versa takes place instead
 */

 /*the modified code for the union operation is given as follows:
   public static void union(int p, int q){
        int i = root(p);
        int j = root(q);
        if(i==j) return;
        if(sz[i]<sz[j]){
        id[i]=j; sz[j]+=sz[i];}
        else{
        id[j]=i; sz[i]+=sz[j];
        }
    }
//note that in the data structure, we will keep a modification as we maintain an extra sz[i] to count number of objects in the tree rooted at i
  */

/*
Another method that can reduce the above costs is to utilize the concept of path compression where to find the root of each object, we make the change as follows:

//every node in path point to its grandparent (thereby having path lengths)
private int root(int i){
while(i!=id[i])
{
id[i]=id[id[i]];
i = id[i];
}
return i;
}

*/
//How to perform implementation of weighted quick union and path compression in Java to solve dynamic connectivity problems?


