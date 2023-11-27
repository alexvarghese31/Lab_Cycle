import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DisplayFileWithLineNumbers {

    public static void main(String[] args) {
        // Replace this with the actual file path
        String filePath = "sample.txt";

        try {
            displayFileWithLineNumbers(filePath);
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }

    private static void displayFileWithLineNumbers(String filePath) throws IOException {
        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            System.out.println("Displaying file with line numbers: " + filePath);

            String line;
            int lineNumber = 1;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(lineNumber + ": " + line);
                lineNumber++;
            }

        } catch (IOException e) {
            // Handle any file-related exceptions
            throw new IOException("Error reading the file: " + e.getMessage(), e);
        }
    }
}
