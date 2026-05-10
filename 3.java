import java.util.*;

public class SelectionSort {

    public static void main(String[] args) {

        int arr[] = {64, 25, 12, 22, 11};

        int n = arr.length;

        // Selection Sort
        for (int i = 0; i < n - 1; i++) {

            int min = i;

            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            // Swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Sorted Array:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}




// # Selection Sort – Theory

// ## Introduction

// Selection Sort is a simple sorting algorithm.

// It works by:

// 1. Finding the smallest element
// 2. Placing it at correct position
// 3. Repeating for remaining array

// ---

// # Main Idea

// ```text id="58zhd0"
// Select minimum element → Swap → Repeat
// ```

// ---

// # Example

// Initial Array:

// ```text id="y7f4dh"
// 64 25 12 22 11
// ```

// ---

// ## Pass 1

// Smallest element = `11`

// Swap with `64`

// ```text id="6q5yb4"
// 11 25 12 22 64
// ```

// ---

// ## Pass 2

// Smallest from remaining array = `12`

// Swap with `25`

// ```text id="3w99qe"
// 11 12 25 22 64
// ```

// ---

// ## Pass 3

// Smallest = `22`

// ```text id="zdmmav"
// 11 12 22 25 64
// ```

// Sorted array obtained.

// ---

// # Main Points of Code

// ---

// # 1. Import Package

// ```java id="pk6z2u"
// import java.util.*;
// ```

// Imports utility classes.

// ---

// # 2. Array Declaration

// ```java id="ujb1fy"
// int arr[] = {64, 25, 12, 22, 11};
// ```

// Input array to sort.

// ---

// # 3. Array Length

// ```java id="3a2lfc"
// int n = arr.length;
// ```

// Stores size of array.

// ---

// # 4. Outer Loop

// ```java id="29h0y0"
// for (int i = 0; i < n - 1; i++)
// ```

// Represents each sorting pass.

// Moves from:

// * First element
// * To second last element

// ---

// # 5. Assume Minimum Element

// ```java id="kjnm7y"
// int min = i;
// ```

// Assumes current element is smallest.

// ---

// # 6. Inner Loop

// ```java id="y7r2yb"
// for (int j = i + 1; j < n; j++)
// ```

// Checks remaining unsorted array.

// ---

// # 7. Find Smaller Element

// ```java id="d4z09d"
// if (arr[j] < arr[min])
// ```

// If smaller element found:

// * Update minimum index

// ```java id="r9jlwm"
// min = j;
// ```

// ---

// # 8. Swap Elements

// ```java id="do3vc1"
// int temp = arr[min];
// arr[min] = arr[i];
// arr[i] = temp;
// ```

// Places smallest element at correct position.

// ---

// # 9. Print Sorted Array

// ```java id="uc5th9"
// System.out.print(arr[i] + " ");
// ```

// Displays sorted array.

// ---

// # Final Output

// ```text id="n0n8h5"
// Sorted Array:
// 11 12 22 25 64
// ```

// ---

// # Working of Selection Sort

// ## Initial

// ```text id="qwb7yc"
// 64 25 12 22 11
// ```

// ---

// ## After Pass 1

// ```text id="39m5ya"
// 11 25 12 22 64
// ```

// ---

// ## After Pass 2

// ```text id="yg1l3k"
// 11 12 25 22 64
// ```

// ---

// ## After Pass 3

// ```text id="b0wjlwm"
// 11 12 22 25 64
// ```

// ---

// ## After Pass 4

// ```text id="px00ef"
// 11 12 22 25 64
// ```

// Sorted.

// ---

// # Time Complexity

// ## Best Case

// ```text id="3i8v7q"
// O(n²)
// ```

// ## Worst Case

// ```text id="klwbtt"
// O(n²)
// ```

// Because nested loops are always used.

// ---

// # Space Complexity

// ```text id="mjlwm1"
// O(1)
// ```

// No extra array used.

// ---

// # Advantages

// * Simple to understand
// * Easy to implement
// * Uses less memory

// ---

// # Disadvantages

// * Slow for large data
// * More comparisons
// * Not efficient compared to quick sort/merge sort

// ---

// # Concepts Used

// | Concept      | Purpose                    |
// | ------------ | -------------------------- |
// | Array        | Store data                 |
// | Nested Loops | Traverse array             |
// | Comparison   | Find minimum               |
// | Swapping     | Rearrange elements         |
// | Sorting      | Arrange in ascending order |

// ---

// # Key Idea

// ```text id="8oqmb9"
// Find smallest element and place it in correct position.
// ```
