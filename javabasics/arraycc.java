import java.util.Scanner;
import java.util.*;

public class arraycc {
  public static void update(int marks[]) {
    for (int i = 0; i < marks.length; i++) {
      marks[i] = marks[i] + 1;
    }
  }

  public static int LinearSearch(int number[], int key) {
    for (int i = 0; i < number.length; i++) {
      if (number[i] == key) {
        return i;
      }
    }
    return -1;
  }

  public static int getLargest(int numbers[]) {
    int largest = Integer.MIN_VALUE;
    for (int i = 0; i < numbers.length; i++) {
      if (largest < numbers[i]) {
        largest = numbers[i];
      }
    }
    return largest;
  }

  public static int binarySearch(int numbers[], int key) {
    int start = 0, end = numbers.length - 1;
    while (start <= end) {
      int mid = (start + end) / 2;

      // comparisons
      if (numbers[mid] == key) {
        return mid;
      }
      if (numbers[mid] < key) { // right
        start = mid + 1;
      } else { // left
        end = mid - 1;
      }

    }
    return -1;
  }

  public static int reverse(int number[]) {
    int start = 0, end = number.length - 1;
    while (start < end) {
      // swap
      int temp = number[end];
      number[end] = number[start];
      number[start] = temp;

      start++;
      end--;
    }
    return -1;
  }

  public static void pairsArray(int number[]) {
    int tp = 0;
    for (int i = 0; i < number.length; i++) {
      int current = number[i];
      for (int j = i + 1; j < number.length; j++) {
        System.out.print("(" + current + "," + number[j] + ")");
        tp++;
      }
      System.out.println();
    }
    System.out.println("total number of pair :" + tp);
  }

  public static void subArray(int number[]) {
    int start = 0;
    int end = 0;
    int currsum = 0;
    int max_sum = Integer.MIN_VALUE;
    for (int i = 0; i < number.length; i++) {
      for (int j = i; j < number.length; i++) {
        for (int k = start; k <= end; k++) {
          currsum += number[k];
        }
        System.out.println(currsum);
        if (max_sum < currsum) {
          max_sum = currsum;
        }
      }

    }
    System.out.println("max sum is :" + max_sum);
  }

  public static void kadanes(int number[]) {
    int ms = Integer.MIN_VALUE;
    int cs = 0;

    for (int i = 0; i < number.length; i++) {
      cs += number[i];
      if (cs < 0) {
        cs = 0;
      }
      ms = Math.max(cs, ms);
    }
    System.out.println("OUR MAX SUM ARRy is :" + ms);
  }

  public static int trappedWater(int height[]) {
    int n = height.length;
    // leftmax boundary
    int leftmax[] = new int[n];
    leftmax[0] = height[0];
    for (int i = 1; i < n; i++) {
      leftmax[i] = Math.max(height[i], leftmax[i - 1]);
    }
    // rightmax boundary
    int rightmax[] = new int[n];
    rightmax[n - 1] = height[n - 1];
    for (int i = n - 2; i >= 0; i--) {
      rightmax[i] = Math.max(height[i], rightmax[i + 1]);
    }
    int trappedWater = 0;
    // loop
    for (int i = 1; i < n; i++) {
      // waterlevel = Math.min(leftmax[i],rightmax[i]);
      int waterlevel = Math.min(leftmax[i], rightmax[i]);
      // trappedwater = waterlevel - height[i]
      trappedWater += waterlevel - height[i];
    }
    return trappedWater;
  }

  public static int buySell(int prices[]) {
    int buyPrice = Integer.MAX_VALUE;
    int maxProfit = 0;
    // LOOP
    for (int i = 0; i < prices.length; i++) {
      if (buyPrice < prices[i]) {
        int profit = prices[i] - buyPrice;// today profit
        maxProfit = Math.max(maxProfit, profit);// overall day profit
      } else {
        buyPrice = prices[i];
      }

    }
    return maxProfit;
  }

  public static int binarySearchs(int arr[], int searchvalue) {
    int n = arr.length;
    int si = 0;
    int ei = n - 1;
    while (si <= ei) {
      int mid = (si + ei) / 2;
      if (arr[mid] == searchvalue) {
        return mid;

      } else if (arr[mid] < searchvalue) {
        si = mid + 1;

      } else {
        ei = mid - 1;
      }
    }
    return -1;
  }

  public static void Tripplet(int tripplet[]) {
    int n = tripplet.length;
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; i < n; j++) {
        for (int k = j + 1; k < n; k++) {
          if (tripplet[i] + tripplet[j] + tripplet[k] == 0) {
            System.out.println(tripplet[i] + "," + tripplet[j] + "," + tripplet[k]);
          }
        }
      }
    }
  }

  public static void main(Strings[] args) {
    int tripplet[] = { -1, 1, 2, 2 };
    Tripplet(tripplet);

    // int arr[] = { 10, 15, 17, 19, 21, 31 };
    // int searchvalue = 19;
    // System.out.println(binarySearchs(arr, searchvalue));

    // int nums[] = { 1, 2, 3, 1 };
    // System.out.println(nums);
    // int prices[] = { 7, 1, 5, 3, 6, 4 };// selling price
    // System.out.println(buySell(prices));

    // int height[] = { 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
    // System.out.println(trappedWater(height));

    // int number[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
    // kadanes(number);
    // pairsArray(number);
    // reverse(number);
    // for (int i = 0; i < number.length; i++) {
    // System.out.print(number[i] + " ");
    // }
    // System.out.println();

    // int numbers[] = { 1, 2, 3, 4, 5, 8, 10 };
    // int keys = 25;
    // System.out.println("inderx at " + binarySearch(numbers, keys));
    // // System.out.println("largest number is :" + getLargest(numbers));

    // int number[] = { 1, 2, 3, 5, 8, 10, 6, 7, 9, 15 };
    // int key = 10;
    // int index = LinearSearch(number, key);
    // if (index == -1) {
    // System.out.println("Not found index");
    // } else {
    // System.out.println("index at " + index);
    // }

    // int marks[] = { 98, 99, 87 };
    // update(marks);
    // // print marks
    // for (int i = 0; i < marks.length; i++) {
    // System.out.print(marks[i] + " ");
    // }
    // System.out.println();

    // int marks[] = new int[100];
    // Scanner sc = new Scanner(System.in);
    // marks[0] = sc.nextInt();// physics
    // marks[1] = sc.nextInt();// chemistry
    // marks[2] = sc.nextInt();// math
    // System.out.println("physics :" + marks[0]);
    // System.out.println("chemistry :" + marks[1]);
    // System.out.println("math :" + marks[2]);

    // marks[2] = 100;
    // System.out.println("math :" + marks[2]);
    // int percentage = (marks[0] + marks[1] + marks[2] / 3);
    // System.out.println("percentage :" + percentage);

  }
}
