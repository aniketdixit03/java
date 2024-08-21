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

