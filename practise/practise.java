import java.util.Scanner;

public class practise {

  public static double average(double a, double b, double c) {

    return (a + b + c) / 3;

  }

  public static boolean isEven(int n) {
    if (n % 2 == 0) {
      return true;
    } else {
      return false;
    }
  }

  public static void bubbleSort(int arr[]) {
    int n = arr.length;
    for (int turns = 0; turns < n - 1; turns++) {
      for (int j = 0; j < n - 1 - turns; j++) {
        if (arr[j] < arr[j + 1]) {
          // swap
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }

  public static void selectionSort(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      int minpos = i;
      for (int j = i + 1; j < n; j++) {
        if (arr[j] > arr[minpos]) {
          minpos = j;
        }
      }
      int temp = arr[minpos];
      arr[minpos] = arr[i];
      arr[i] = temp;
    }
  }

  public static void printarr(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void countingSort(int arr[]) {
    int largest = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      largest = Math.max(largest, arr[i]);
    }
    int count[] = new int[largest + 1];
    for (int i = 0; i < arr.length; i++) {
      count[arr[i]]++;
    }
    int j = 0;
    for (int i = count.length - 1; i >= 0; i--) {
      while (count[i] > 0) {
        arr[j] = i;
        j++;
        count[i]--;
      }
    }

  }

  public static int allOccurence(int arr[], int i, int key) {
    if (arr[i] == arr.length) {
      return 1;
    }
    if (arr[i] == key) {
      return i;
    }
    return allOccurence(arr, i + 1, key);
  }

  public static void main(Strings[] args) {
    int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
    int key = 2;
    allOccurence(arr, 0, key);
    System.out.println();

    // int[][] nums = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
    // int sum = 0;
    // // sum of 2nd row of element
    // for (int j = 0; j < nums[0].length; j++) {
    // sum += nums[0][j];
    // }
    // System.out.println("sum of nums is" + sum);

    // int[][] array = { { 4, 7, 8 }, { 8, 8, 7 } };
    // int count7 = 0;
    // for (int i = 0; i < array.length; i++) {
    // for (int j = 0; j < array[0].length; j++) {
    // if (array[i][j] == 7) {
    // count7++;
    // }
    // }
    // System.out.println("coont of 7 is: " + count7);
    // }
    // int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
    // countingSort(arr);
    // // selectionSort(arr);
    // // bubbleSort(arr);
    // printarr(arr);
  }
}
// System.out.println("the average is " + average(5, 5, 5));
// average of this number
// int a = 2;
// int b = 2;
// int c = 2;
// int average = (2 + 2 + 2) / 3;
// System.out.println("Average is :" + average);

// find the area of square
// int a = 5;
// int b = 10;
// int square = a * b;
// System.out.println("The area of square is:" + square);

// Scanner sc = new Scanner(System.in);
// float pencil = sc.nextFloat();
// float pen = sc.nextFloat();
// float eraser = sc.nextFloat();
// float cost = pencil + pen + eraser;
// System.out.println("The bill is :" + cost);
// // add on 18% tax
// float newcost = cost + (0.18f * cost);
// System.out.println("Bill with tax:" + newcost);
// Scanner sc = new Scanner(System.in);
// int number = sc.nextInt();
// System.out.println(number);
// if (number >= 0) {
// System.out.println("number is positive");
// } else {
// System.out.println("number is negative");
// }

// double temp = 99;
// if (temp > 100) {
// System.out.println("fever");
// } else {
// System.out.println("not fever");
// }

// Scanner sc = new Scanner(System.in);
// System.out.println("enter a day:");
// int day = sc.nextInt();

// switch (day) {
// case 1:
// System.out.println("monday");
// break;
// case 2:
// System.out.println("Tuesday");
// break;
// case 3:
// System.out.println("wenday");
// break;
// case 4:
// System.out.println("thursday");
// break;
// case 5:
// System.out.println("friday");
// break;
// case 6:
// System.out.println("saturday");
// break;
// case 7:
// System.out.println("sunday");
// break;

// default:
// System.out.println("invalid enter");
// }

// Write a programthatreadsasetofintegers,andthenprintsthesumoftheeven and odd
// integers

// Scanner sc = new Scanner(System.in);
// int number;
// int choice;
// int evenSum = 0;
// int oddSum = 0;
// do {
// System.out.println("enter the number");
// number = sc.nextInt();
// if (number % 2 == 0) {
// evenSum += number;
// } else {
// oddSum += number;
// }
// System.out.println("Do you want to continue? press 1 or 0");
// choice = sc.nextInt();
// } while (choice == 1);
// System.out.println("Sum of even numbers is:" + evenSum);
// System.out.println("Sum of even numbers is:" + oddSum);

// Write a program to find the factorialof any number entered by the user

// Scanner sc = new Scanner(System.in);
// int num;
// int fact = 1;
// System.out.println("enter the positive integer:");
// num = sc.nextInt();
// for (int i = 1; i <= num; i++) {
// fact *= i;
// }
// System.out.println("factorial :" + fact);
// }

// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the number :");
// int n = sc.nextInt();
// for (int i = 1; i <= 10; i++) {
// System.out.println(n + " * " + i + " = " + n * i);
// }
