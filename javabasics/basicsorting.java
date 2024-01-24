import java.util.*;
import java.util.Arrays;
import java.util.Collections;

public class basicsorting {
  public static void bubbleSort(int bubble[]) {
    int n = bubble.length;

    for (int turns = 0; turns < n - 1; turns++) {
      for (int j = 0; j < n - 1 - turns; j++) {
        if (bubble[j] > bubble[j + 1]) {
          // swap
          int temp = bubble[j];
          bubble[j] = bubble[j + 1];
          bubble[j + 1] = temp;
        }
      }
    }
  }

  public static void printbubble(int bubble[]) {
    int n = bubble.length;
    for (int i = 0; i < n; i++) {
      System.out.print(bubble[i] + " ");
    }
  }

  public static void selectionSort(int selection[]) {
    for (int turns = 0; turns < selection.length - 1; turns++) {
      int minsums = turns;
      for (int j = turns + 1; j < selection.length; j++) {
        if (selection[minsums] > selection[j]) {
          minsums = j;
        }
      }
      // swap
      int temp = selection[minsums];
      selection[minsums] = selection[turns];
      selection[turns] = temp;

    }
  }

  public static void printselection(int selection[]) {
    int n = selection.length;
    for (int i = 0; i < n; i++) {
      System.out.print(selection[i] + " ");
    }
  }

  public static void inertionSort(int arr[]) {
    for (int i = 1; i < arr.length; i++) {
      int curr = arr[i];
      int prev = i - 1;
      while (prev >= 0 && arr[prev] > curr) {
        arr[prev + 1] = arr[prev];
        prev--;
      }
      // insertion
      arr[prev + 1] = curr;
    }
  }

  public static void printselectionSort(Integer arr[]) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void CountingSort(int arr[]) {
    int largest = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      largest = Math.max(largest, arr[i]);
    }
    int count[] = new int[largest + 1];
    for (int i = 0; i < arr.length; i++) {
      count[arr[i]]++;
    }
    int j = 0;
    for (int i = 0; i < count.length; i++) {
      while (count[i] > 0) {
        arr[j] = i;
        j++;
        count[i]--;
      }
    }
  }

  public static void printCountingSort(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void main(Strings[] args) {
    int arr[] = { 5, 5, 1, 1, 2, 7 };
    CountingSort(arr);
    // Arrays.sort(arr, Collections.reverseOrder());
    // Arrays.sort(arr);
    // inertionSort(arr);
    printCountingSort(arr);

    // int selection[] = { 5, 4, 3, 2, 1 };
    // selectionSort(selection);
    // printbubble(selection);

    // int bubble[] = { 5, 4, 3, 2, 1 };
    // bubbleSort(bubble);
    // printbubble(bubble);
  }
}
