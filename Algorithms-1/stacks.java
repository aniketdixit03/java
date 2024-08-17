import java.util.*;

//a linked list based implementation for a stack of characters in java
/*an array implementation of a stack generates only a fixed sized stack, and while it is easy to design,
it is therefore not advised to use array (or, use resizing array) for creation of a stack*/

public class stacks {
    private Node first = null;
    //private inner class, visible only within its enclosing class
    private class Node{
        char item;
        Node next;
    }

    public boolean isEmpty(){
        return first==null;
    }

    public void push(char s){
        Node oldFirst = first;
        first = new Node();
        first.item = s;
        first.next = oldFirst;
    }

    public char pop(){
        if (isEmpty()) {
            throw new NoSuchElementException("Stack underflow");
        }
        char item = first.item;
        first = first.next;
        return item;
    }
    public static void main(String[] args) {
        stacks stacks = new stacks();
        Scanner sc = new Scanner(System.in);
        stacks.push(sc.next().charAt(0));
        while (!stacks.isEmpty()) {
            char s = sc.next().charAt(0); //pay attention to this line
            if('o' == s) System.out.println(stacks.pop()); 
            else stacks.push(s);
        }
        sc.close();
    }}
/*in a standard java environment for every object there's 16 bytes of overhead; 
there's some extra overhead, 8 bytes, because it's an inner class and around 8 bytes of an overhead for each instance's creation
*/

/*Loitering in Java is a case in array implementation of stack where the reference to an unuseful object still exists in memory despite its deletion
  and, to deal with this scenario we have the following code:

  public String pop(){
  String item = s[--N];
  s[N] = null; //deletes the reference to the old item and due to a lack of a new reference, the garbage collector reclaims the memory
  return item;}

*/