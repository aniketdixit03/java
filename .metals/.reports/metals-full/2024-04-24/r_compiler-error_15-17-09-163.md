file:///C:/Users/ANIKET%20DIXIT/OneDrive/Desktop/college/java/Basics.java
### java.util.NoSuchElementException: next on empty iterator

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.3
Classpath:
<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala3-library_3\3.3.3\scala3-library_3-3.3.3.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.12\scala-library-2.13.12.jar [exists ]
Options:



action parameters:
uri: file:///C:/Users/ANIKET%20DIXIT/OneDrive/Desktop/college/java/Basics.java
text:
```scala
import java.util.*;
//.lang is automatically imported
public class Basics {
    public static void main(String[] args) {
        //taking input in java using scanner
        //we will create an object of scanner class
        /*note that scanner is also a non primitive 
        data type in java*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value to be stored:");
        int s = sc.nextInt();
        System.out.println("The entered value is: "+s);
        //getting single string 'token' input
        System.out.println("Enter name:");
        String name = sc.next();
        System.out.println(name);
        System.out.println("Enter full name:");
        //getting multiple string 'tokens' input
        String sentence = sc.nextLine();
        System.out.println(sentence); 
        //nextLong()
        //nextDouble() and more also exist
    }
}
hello

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
	scala.meta.internal.pc.PcCollector.<init>(PcCollector.scala:44)
	scala.meta.internal.pc.PcSemanticTokensProvider$Collector$.<init>(PcSemanticTokensProvider.scala:61)
	scala.meta.internal.pc.PcSemanticTokensProvider.Collector$lzyINIT1(PcSemanticTokensProvider.scala:61)
	scala.meta.internal.pc.PcSemanticTokensProvider.Collector(PcSemanticTokensProvider.scala:61)
	scala.meta.internal.pc.PcSemanticTokensProvider.provide(PcSemanticTokensProvider.scala:90)
	scala.meta.internal.pc.ScalaPresentationCompiler.semanticTokens$$anonfun$1(ScalaPresentationCompiler.scala:110)
```
#### Short summary: 

java.util.NoSuchElementException: next on empty iterator