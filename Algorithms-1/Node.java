import java.util.*;
public class Node{
    char item;
    Node next;
}
public class stacks {
        stacks(){

        }

        void push(char s){

        }

        String pop(){
            char item = first
        }

        boolean isEmpty(){

        }

        int size(){

        }

        public static void main(String[] args) {
        stacks stacks = new stacks();
        Scanner sc = new Scanner(System.in);
        while (!stacks.isEmpty()) {
            char s = sc.next().charAt(0); //pay attention to this line
            if("o".equals(s)) stacks.pop(); 
            else stacks.push(s);
        }

    }
}
