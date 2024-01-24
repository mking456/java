import java.util.Scanner;

public class function {
  public static void printHello() {
    System.out.println("I");
    System.out.println("am");
    System.out.println("Mayur");
  }

  public static int factorial(int n) {
    int f = 1;
    for (int i = 1; i <= n; i++) {
      f = f * i; // f *= i;
    }
    return f;

  }

  public static int binomial(int n, int r) {
    int n_fact = factorial(n);// a
    int r_fact = factorial(r);// b
    int nmr_fact = factorial(n - r);// c
    int binomial = n_fact / (r_fact * nmr_fact);
    return binomial;
  }

  // public static int sum(int a, int b) {
  // return a + b;
  // }

  // public static int sum(int a, int b, int c) {
  // return a + b + c;
  // }
  public static int sum(int a, int b) {
    return a + b;
  }

  public static float sum(float a, float b) {
    return a + b;
  }

  public static boolean isPrime(int n) {
    // corner case
    if (n == 2) {
      return true;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % 2 == 0) {
        return false;
      }
    }
    return true;
  }

  public static void primesInRange(int n) {
    for (int i = 2; i <= n; i++) {
      if (isPrime(i)) { // true
        System.out.print(i + " ");
      }
    }
    System.out.println();
  }

  public static void binaryTodecimal(int binNum) {
    int myNum = binNum;
    int pow = 0;
    int decNum = 0;
    while (binNum > 0) {
      int lastDigit = binNum % 10;
      decNum = decNum + (lastDigit * (int) Math.pow(2, pow));
      pow++;
      binNum = binNum / 10;
    }
    System.out.println("decimal of " + myNum + " = " + decNum);
  }

  public static void decimalTobinary(int decNum) {
    int myNum = decNum;
    int pow = 0;
    int binNum = 0;
    while (decNum > 0) {
      int rem = decNum % 2;
      binNum = binNum + (rem * (int) Math.pow(10, pow));
      pow++;
      decNum = decNum / 2;
    }
    System.out.println("decimal is " + myNum + "=" + binNum);

  }

  public static int getSum(int n) {
    int sum = 0;
    while (n != 0) {
      sum += n % 10;
      n /= 10;
    }
    return sum;
  }

  public static int ispalidrome(int n) {
    int rev = 0;
    int temp = n;
    while (temp != 0) {
      rev = rev * 10;
      rev = rev + (temp % 10);
      temp = temp / 10;
      if (n == rev) {
        System.out.print("Number is palidrome");
      } else {
        System.out.print("Not palidrome");
      }
    }
    return rev;
  }

  public static void main(Strings args[]) {
    // decimalTobinary(7);
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    // int temp = number;
    // int rev = 0;
    // while (temp != 0) {
    // rev = rev * 10;
    // rev = rev + (temp % 10);
    // temp = temp / 10;
    // if (number == rev) {
    // System.out.print("Number is palidrome");
    // } else {
    // System.out.print("Not palidrome");
    // }
    // }

    // System.out.println(getSum(n));

    System.out.println(ispalidrome(n));
  }

}
