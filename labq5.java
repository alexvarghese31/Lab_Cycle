import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class FileStatistics {

    public static void main(String[] args) {
        // Replace this with the actual file path
        String filePath = "sample.txt";

        try {
            displayFileStatistics(filePath);
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }

    private static void displayFileStatistics(String filePath) throws IOException {
        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            int characterCount = 0;
            int lineCount = 0;
            int wordCount = 0;

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // Count characters
                characterCount += line.length();

                // Count lines
                lineCount++;

                // Count words
                StringTokenizer tokenizer = new StringTokenizer(line);
                wordCount += tokenizer.countTokens();
            }

            System.out.println("File Statistics for " + filePath);
            System.out.println("Number of Characters: " + characterCount);
            System.out.println("Number of Lines: " + lineCount);
            System.out.println("Number of Words: " + wordCount);

        } catch (IOException e) {
            // Handle any file-related exceptions
            throw new IOException("Error reading the file: " + e.getMessage(), e);
        }
    }
}
