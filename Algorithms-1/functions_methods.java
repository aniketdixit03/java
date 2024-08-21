import java.util.Scanner;

public class functions_methods {
    /*format of writing a function:
    returnType funcName(dataType arg1,...){}*/
    /*note that the arguments can be passed by calue or
    by refernce where their original values might get updated*/
    public static int sum(int x, int y){
        return x+y;}
    public static void printMyName(String n){
        System.out.println(n);
        return;
        //to come out of the function we use return keyword
    }
    //by convention java uses CamelCase for identifiers
    public static void main(String[] args) {
    //void is a returnType that means that nothing is returned
    //funcName shouldn't be a java keyword 
    Scanner sc = new Scanner(System.in);
    String n = sc.nextLine();
    //calling the function in main fnc
    printMyName(n);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int sum = sum(x,y);
    System.out.println(sum);
    }
}
