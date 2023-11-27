import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class FileHandlingExample {

    public static void main(String[] args) {
        // Reading from a file
        readFromFile("input.txt");

        // Writing to a file
        writeToFile("output.txt", "Hello, this is a sample text!");

        // Reading from the newly created file
        readFromFile("output.txt");
    }

    // Method to read from a file
    private static void readFromFile(String fileName) {
        try (FileReader fileReader = new FileReader(fileName);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            System.out.println("Reading from file: " + fileName);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }

    // Method to write to a file
    private static void writeToFile(String fileName, String content) {
        try (FileWriter fileWriter = new FileWriter(fileName);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            System.out.println("Writing to file: " + fileName);
            bufferedWriter.write(content);

        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
