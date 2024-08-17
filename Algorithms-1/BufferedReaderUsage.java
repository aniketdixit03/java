import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//More suitable for reading large chunks of data or entire lines of text at once.
//Commonly used when you need to read from files or network streams where you can process data line by line.
//Scanner is more suitable for interactive user input from the console or parsing data with specific patterns. 

public class BufferedReaderUsage {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Reading a string
            System.out.print("Enter a string: ");
            String str = reader.readLine();
            System.out.println("You entered: " + str);

            // Reading an integer
            System.out.print("Enter an integer: ");
            int num = Integer.parseInt(reader.readLine());
            System.out.println("You entered: " + num);

            // Reading a double
            System.out.print("Enter a double: ");
            double dbl = Double.parseDouble(reader.readLine());
            System.out.println("You entered: " + dbl);

            // Reading a character
            System.out.print("Enter a character: ");
            char ch = (char) reader.read();
            // Clear the buffer
            reader.readLine(); // Consume the newline character
            System.out.println("You entered: " + ch);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/*To read text from a file using BufferedReader, we do the following: 
    String fileName = "example.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
*/

/*The hasNext() method in the Scanner class is used to check 
if there is another token available in the input. 
A token is a sequence of characters that can be separated by delimiters 
(such as spaces, newlines, etc.). */

/*

System.out.println("Enter some words (type 'exit' to stop):");
        
        // Loop continues while there are more tokens available
        while (sc.hasNext()) {
            String input = sc.next();  // Read the next token
            
            if ("exit".equalsIgnoreCase(input)) {
                break;  // Exit the loop if 'exit' is entered
            }
            
            System.out.println("You entered: " + input);
        }

Variants of hasNext()

hasNextInt(): Checks if the next token is an integer.
hasNextDouble(): Checks if the next token is a double.
hasNextLine(): Checks if there is another line available.
 
 */

/*
Note the following code to convert an array of characters to a string:

  @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = first;
        while (current != null) {
            sb.append(current.item).append(" ");
            current = current.next;
        }
        return sb.toString();
    }

*/