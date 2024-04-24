file:///C:/Users/ANIKET%20DIXIT/OneDrive/Desktop/college/java/L14_15_16.java
### java.util.NoSuchElementException: next on empty iterator

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.3
Classpath:
<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala3-library_3\3.3.3\scala3-library_3-3.3.3.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.12\scala-library-2.13.12.jar [exists ]
Options:



action parameters:
offset: 0
uri: file:///C:/Users/ANIKET%20DIXIT/OneDrive/Desktop/college/java/L14_15_16.java
text:
```scala
@@import java.util.*;
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

```



#### Error stacktrace:

```
scala.collection.Iterator$$anon$19.next(Iterator.scala:973)
	scala.collection.Iterator$$anon$19.next(Iterator.scala:971)
	scala.collection.mutable.MutationTracker$CheckedIterator.next(MutationTracker.scala:76)
	scala.collection.IterableOps.head(Iterable.scala:222)
	scala.collection.IterableOps.head$(Iterable.scala:222)
	scala.collection.AbstractIterable.head(Iterable.scala:933)
	dotty.tools.dotc.interactive.InteractiveDriver.run(InteractiveDriver.scala:168)
	scala.meta.internal.pc.MetalsDriver.run(MetalsDriver.scala:45)
	scala.meta.internal.pc.HoverProvider$.hover(HoverProvider.scala:34)
	scala.meta.internal.pc.ScalaPresentationCompiler.hover$$anonfun$1(ScalaPresentationCompiler.scala:368)
```
#### Short summary: 

java.util.NoSuchElementException: next on empty iterator