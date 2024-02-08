import java.io.*;

public class String_Builder {
    public static void main(String[] args) {
        // //declaring string builder
        StringBuilder sb = new StringBuilder("Aniket");
        // //most of the functions of Strings work well with SB as well
        // System.out.println(sb.charAt(0));
        // //there are other exclusive functions in SB as well
        // sb.setCharAt(0, 'B');
        // System.out.println(sb);
        // sb.insert(0, 'A');
        // System.out.println(sb);
        // //deleting a substring using SB
        // sb.delete(1, 2);
        // //ending index is not excluded
        // System.out.println(sb);
        // //appending i.e. to add at the end of a string 
        // sb.append('k');
        // sb.append("et");
        // System.out.println(sb);
        // //reversing a string using SB; time complexity O(n)
        for(int i=0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length() -1 -i;
            char frontC = sb.charAt(front);
            char backC = sb.charAt(back);
            sb.setCharAt(front, backC);
            sb.setCharAt(back, frontC);
        }
        System.out.println(sb);
}}
