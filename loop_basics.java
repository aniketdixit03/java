import java.util.*;
//if else, if else if, switch decision making statements
public class loop_basics {
    public static void main(String[] args) {
        /*Buffered reader reduces the 
        execution time of code*/
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        //basic odd-even to use if else
        if(x%2==0){
            System.out.println("Even");}
        else{
            System.out.println("Odd");
            }
        if(a == b){
            System.out.println("equal");
        } else if(a > b){
            System.out.println("a is greater");
        }
        else{
            System.out.println("a is lesser");
        }
        /*if(C1) else if(C2) else works in a way that if C1 is true 
        then C2 is not even checked, else gets executed 
        only when C1 and C2 are both false*/
        //if(); implies that there is a null statement after if
        //using switch
        switch(x){
            case 23:
            System.out.println("Entered number is 23.");
            break;
            //fall through occurs without this 'break' keyword
            default: //optional 
            System.out.println("Unknown number entered.");
        }
    }
}
