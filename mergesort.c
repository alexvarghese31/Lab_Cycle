#include <stdio.h>

void merge(int a[], int lb, int mid, int ub); // Declare the merge function

void mergesort(int a[], int lb, int ub)
{
    if (lb < ub) 
    {
        int mid = (lb + ub) / 2;
 
        mergesort(a, lb, mid);
        mergesort(a, mid + 1, ub);
        merge(a, lb, mid, ub);
    }
}

void merge(int a[], int lb, int mid, int ub)
{
    int i, j, k;
    int s1 = mid - lb + 1;
    int s2 = ub - mid;
 
    int left_a[s1], right_a[s2];
 
    for (i = 0; i < s1; i++)
        left_a[i] = a[lb + i];
    
    for (j = 0; j < s2; j++)
        right_a[j] = a[mid + 1 + j];
 
    i = 0, j = 0;  
    k = lb; 
    while (i < s1 && j < s2) {
        if (left_a[i] <= right_a[j]) {
            a[k] = left_a[i];
            i++;
        }
        else {
            a[k] = right_a[j];
            j++;
        }
        k++;
    }
 
    while (i < s1) {
        a[k] = left_a[i];
        i++;
        k++;
    }
 
    while (j < s2) {
        a[k] = right_a[j];
        j++;
        k++;
    }
}

int main() {
    int arr[] = {12, 11, 13, 5, 6};
    int n = sizeof(arr) / sizeof(arr[0]);

    printf("Original array: ");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }

    mergesort(arr, 0, n - 1);

    printf("\nSorted array: ");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");

    return 0;
}
