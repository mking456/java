import java.util.Scanner;

public class conditional {
  public static void main(Strings[] args) {
    /*
     * if - else statement
     * // int age = 16;
     * 
     * // if (age >= 18) {
     * // System.out.println("you are a adult:");
     * // }
     * 
     * // if (age > 13 && age < 18) {
     * // System.out.println("teenagger");
     * // }
     * 
     * // else {
     * // System.out.println("not adult:");
     * // }
     * 
     * // int a = 1;
     * // int b = 3;
     * // if (a >= b) {
     * // System.out.println("A is largest of 2");
     * // } else {
     * // System.out.println("B is largest of 2");
     * // }
     * 
     * // Scanner sc = new Scanner(System.in);
     * // int input = sc.nextInt();
     * // if (input % 2 == 0) {
     * // System.out.println("Number is even");
     * // } else {
     * // System.out.println("Number is odd");
     * // }
     */

    // else if statement
    // int age = 13;
    // if (age >= 18) {
    // System.out.println("adult");
    // } else if (age <= 18) {
    // System.out.println("tennagger");
    // } else {
    // System.out.println("not adult");
    // }

    // Scanner sc = new Scanner(System.in);
    // int income = sc.nextInt();
    // int tax;
    // if (income < 500000) {
    // tax = 0;
    // } else if (income >= 500000 && income < 1000000) {
    // tax = (int) (income * 0.2);
    // } else {
    // tax = (int) (income * 0.3);
    // }
    // System.out.println("tax is :" + tax);

    // print the largest of 3
    // int a = 1;
    // int b = 3;
    // int c = 6;

    // if ((a >= b) && (a >= c)) {
    // System.out.println("A is larger");
    // } else if (b >= c) {
    // System.out.println("B is larger");
    // } else {
    // System.out.println("c is larger");
    // }

    // ternary operator
    // syntax
    // variable = condition?statement1:statement2;

    // int marks = 67;
    // String rc = marks >= 33 ? "PASS" : "FAIL";
    // System.out.println(rc);

    // switch statement
    // int number = 2;
    // switch (number) {
    // case 1:
    // System.out.println("samosa");
    // break;
    // case 2:
    // System.out.println("burger");
    // break;
    // case 3:
    // System.out.println("mango");
    // break;
    // default:
    // System.out.println("wakeup");
    // }

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a :");
    int a = sc.nextInt();
    System.err.println("Enter b :");
    int b = sc.nextInt();
    System.out.println("enter operator :");
    char operator = sc.next().charAt(0);
    switch (operator) {
      case '+':
        System.out.println(a + b);
        break;
      case '-':
        System.out.println(a - b);
        break;
      case '*':
        System.out.println(a * b);
        break;
      case '%':
        System.out.println(a % b);
        break;
      case '/':
        System.out.println(a / b);
        break;

      default:
        System.out.println("wrong calculator");
        break;
    }

  }
}
