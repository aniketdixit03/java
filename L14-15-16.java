import java.util.*;
public class L14-15-16 {
    public static void main(String[] args){
        //focuses on 4 operations: GET | SET | CLEAR | UPDATE using bitmasking concepts
        //getting the 3rd bit of n = 0101 
        int n = 5;
        int pos = 3;
        int bitMask = 1<<pos;
        if((bitMask & n) == 0) {
            System.out.println("bit was 0");
        } else {
            System.out.println("bit was 1");
        }
        //rest of the operations can be performed easily as well
}}

