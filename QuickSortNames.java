import java.util.Scanner;

public class QuickSortNames {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of names
        System.out.print("Enter the number of names: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Get the names
        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name #" + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        // Print the unsorted array
        System.out.println("\nUnsorted Names:");
        printArray(names);

        // Sort the array using QuickSort
        quickSort(names, 0, names.length - 1);

        // Print the sorted array
        System.out.println("\nSorted Names:");
        printArray(names);

        // Close the scanner
        scanner.close();
    }

    // QuickSort algorithm
    public static void quickSort(String[] arr, int low, int high) {
        if (low < high) {
            // Find the partition index such that elements smaller than arr[partitionIndex]
            // are on the left, and elements greater are on the right.
            int partitionIndex = partition(arr, low, high);

            // Recursively sort the sub-arrays
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    // Helper method to partition the array
    public static int partition(String[] arr, int low, int high) {
        String pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to the pivot
            if (arr[j].compareToIgnoreCase(pivot) <= 0) {
                i++;

                // Swap arr[i] and arr[j]
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and arr[high] (pivot)
        String temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // Helper method to print an array
    public static void printArray(String[] arr) {
        for (String element : arr) {
            System.out.println(element);
        }
    }
}
