import java.util.Map;

public class recursionbasics {

  public static void printDec(int n) {
    if (n == 1) {
      System.out.println(n);
      return;
    }
    System.out.print(n + " ");
    printDec(n - 1);
  }

  public static void printAsc(int n) {
    if (n == 1) {
      System.out.print(1 + " ");
      return;
    }
    printAsc(n - 1);
    System.out.print(n + " ");
  }

  public static int factorial(int n) {
    if (n == 0) {
      return 1;
    }
    int fnm = factorial(n - 1);
    int fac = n * factorial(n - 1);
    return fac;
  }

  public static int sum(int n) {
    if (n == 1) {
      return 1;
    }
    int snm1 = sum(n - 1);
    int sums = n + sum(n - 1);
    return sums;
  }

  public static int nthFib(int n) {
    if (n == 0 || n == 1) {
      return n;
    }
    int fnm1 = nthFib(n - 1); // fn = fn-1 + fn-2 formula to calculate fibonacci
    int fnm2 = nthFib(n - 2);
    // int fn = fnm1 + fnm2;
    return fnm1 + fnm2;
  }

  public static boolean isSorted(int arr[], int i) {
    if (arr[i] == arr.length - 1) {
      return true;
    }
    if (arr[i] > arr[i + 1]) {
      return false;
    }

    return isSorted(arr, i + 1);
  }

  public static int firstoccurence(int arr[], int i, int key) {
    if (arr[i] == arr.length - 1) {
      return -1;
    }
    if (arr[i] == key) {
      return i;
    }
    return firstoccurence(arr, i + 1, key);
  }

  public static int lastOcuurence(int arr[], int i, int key) {
    if (i == arr.length) {
      return -1;
    }
    int isFound = lastOcuurence(arr, i + 1, key);
    if (isFound == -1 && arr[i] == key) {
      return i;
    }
    return isFound;
  }

  public static int power(int x, int n) {
    if (n == 0) { // base class
      return 1;
    }
    return x * power(x, n - 1); // x^n = x^n-1; // 2^10 = 2 * 2^10-1;
  }

  public static int optimizedPower(int x, int n) {// O(logn) time complexity
    if (n == 0) {
      return 1;
    }
    // n is even
    int halfPower = optimizedPower(x, n / 2);
    int halfOptimizedsq = halfPower * halfPower;

    // n is odd
    if (n % 2 != 0) {
      halfOptimizedsq = x * halfOptimizedsq;
    }
    return halfOptimizedsq;

  }

  public static int tilesProblem(int n) {
    // base class
    if (n == 0 || n == 1) {
      return 1;
    }
    // kaam
    // vertical tiling
    int fnm1 = tilesProblem(n - 1);
    // horixontal tiling
    int fnm2 = tilesProblem(n - 2);
    // total ways
    int totalWays = fnm1 + fnm2;
    return totalWays;
    // return tilesProblem(n - 1) + tilesProblem(n - 2);

  }

  public static void removeDuplicate(String str, int idx, StringBuilder newStr, boolean map[]) {
    // base case
    if (idx == str.length()) {
      System.out.println(newStr);
      return;
    }
    // kaam
    char currChar = str.charAt(idx);
    if (map[currChar - 'a'] == true) {
      // dupicate
      removeDuplicate(str, idx + 1, newStr, map);
    } else {
      map[currChar - 'a'] = true;
      removeDuplicate(str, idx + 1, newStr.append(currChar), map);
    }

  }

  public static int friendsPairing(int n) {
    if (n == 1 || n == 2) {
      return n;
    }
    // int fnm1 = friendsPairing(n - 1);
    // int fnm2 = friendsPairing(n - 2) * fnm1;
    // return fnm1 + fnm2;
    return friendsPairing(n - 1) + (n - 1) * friendsPairing(n - 2);
    // single choice //total no of pairs // pairs choice
  }

  public static void printBiStringsI(int n, int lastPlace, String str) {
    if (n == 0) {
      System.out.println(str);
      return;
    }
    // kaam
    printBiStringsI(n - 1, 0, str + "0");
    if (lastPlace == 0) {
      printBiStringsI(n - 1, 1, str + "1");
    }
  }

  public static void allOccurence(int arr[], int i, int key) {
    if (i == arr.length) {
      return;
    }
    if (arr[i] == key) {
      System.out.println(i + "");
    }
    allOccurence(arr, i + 1, key);
  }

  static String digits[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

  public static void printDigits(int n) {
    if (n == 0) {
      return;
    }
    int lastDigits = n % 10;
    printDigits(n / 10);
    System.out.print(digits[lastDigits] + " ");
  }

  public static int lengthOfstr(String str) {
    if (str.length() == 0) {
      return 0;
    }
    return lengthOfstr(str.substring(1)) + 1;
  }

  public static int sumFind(int n) {
    if (n == 1) {
      return 1;
    }
    return n + sum(n - 1);
  }

  public static int fibfind(int n) {
    if (n == 0 || n == 1) {
      return n;
    }
    return fibfind(n - 1) + fibfind(n - 2);
  }

  public static void main(String[] args) {
    System.out.println(fibfind(4));
    // System.out.println(sum(4));
    // String str = "abcde";
    // System.out.println(lengthOfstr(str));
    // printDigits(1234);

    // int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
    // int key = 2;
    // allOccurence(arr, 0, key);
    // System.out.println();

    // printBiStringsI(3, 0, "");

    // System.out.println(friendsPairing(3));
    // String str = "apnacollege";
    // removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
    // System.out.println(tilesProblem(3));
    // System.out.println(optimizedPower(2, 10));
    // System.out.println(power(2, 10));
    // int arr[] = { 1, 2, 3, 4, 5, 6, 7, 5, 9 };
    // System.out.println(lastOcuurence(arr, 0, 5));
    // System.out.println(firstoccurence(arr, 0, 10));
    // System.out.println(isSorted(arr, 0));
    // int n = 5;
    // printDec(n);
    // printAsc(n);
    // System.out.println(factorial(n));
    // System.out.println(sum(n));
    // System.out.println(nthFib(n));
  }
}
