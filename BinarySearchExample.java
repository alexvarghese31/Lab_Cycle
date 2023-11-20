import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the sorted array
        System.out.print("Enter sorted numbers (space-separated): ");
        String input = scanner.nextLine();
        String[] strArray = input.split(" ");
        int[] sortedArray = Arrays.stream(strArray)
                                   .mapToInt(Integer::parseInt)
                                   .toArray();

        // Get the number to search
        System.out.print("Enter the number to search: ");
        int target = scanner.nextInt();

        // Perform binary search
        int result = binarySearch(sortedArray, target);

        // Display the result
        if (result != -1) {
            System.out.println("Number " + target + " found at index " + result);
        } else {
            System.out.println("Number " + target + " not found in the array");
        }

        // Close the scanner
        scanner.close();
    }

    // Binary search algorithm
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if the target is present at the mid index
            if (arr[mid] == target) {
                return mid;
            }

            // If the target is greater, ignore the left half
            if (arr[mid] < target) {
                low = mid + 1;
            }

            // If the target is smaller, ignore the right half
            else {
                high = mid - 1;
            }
        }

        // If we reach here, then the element was not present
        return -1;
    }
}
