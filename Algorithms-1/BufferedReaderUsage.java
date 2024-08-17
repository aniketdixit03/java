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