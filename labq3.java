import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExample {

    public static void main(String[] args) {
        // Replace these with your actual file paths
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        // Reading from a file
        try {
            readAndWriteFile(inputFile, outputFile);
            System.out.println("File reading and writing completed successfully.");
        } catch (IOException e) {
            System.err.println("Error handling file: " + e.getMessage());
        }
    }

    private static void readAndWriteFile(String inputFileName, String outputFileName) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream(inputFileName);
             FileOutputStream fileOutputStream = new FileOutputStream(outputFileName)) {

            System.out.println("Reading from file: " + inputFileName);

            // Reading from the input file
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                // Writing to the output file
                fileOutputStream.write(buffer, 0, bytesRead);
            }

            System.out.println("Writing to file: " + outputFileName);

        } catch (IOException e) {
            // Handle any file-related exceptions
            throw new IOException("Error handling file: " + e.getMessage(), e);
        }
    }
}
