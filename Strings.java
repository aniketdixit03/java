import java.util.*;
public class Strings {
    public static void main(String[] args) {
        //basic string usage:
        String a = "ani";
        String b = "123";
        String x = a+"@"+b;//valid usage of strings
        System.out.println(x); 
        System.out.println(x.length());//prints length of string
        /*compareTo prints: based on ascii values +ve if s1>s2, 
        -ve if s1<s2 and 0 if both are equal*/
        System.out.println(a.compareTo(b));//b is a parameter sent in compareTo function
        //more in-built strings functions in DSA bookmarks' folder
        //we can also create as: new String("Ani")
        /* == can be used but it fails in a lot of cases like when 
        declaring using new and comparing as Strings are objects 
        and not regular primitive datatypes, therefore use compareTo()*/

        //Note that 'Strings in Java are immutable'
    } 
}