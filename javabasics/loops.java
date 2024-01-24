import java.util.Scanner;

public class loops {
  public static void main(Strings[] args) {
    // while loop
    // syntax -- > while(condition){
    // do something
    // }
    // int counter = 0;
    // while (counter < 100) {
    // System.out.println("hello disha");
    // counter++;
    // }
    // System.out.println("printed HD 100x times");

    // int counter = 1;
    // while (counter <= 10) {
    // System.out.print(counter + " ");
    // counter++;
    // }
    // System.out.println();

    // Scanner sc = new Scanner(System.in);
    // System.out.println("enter a number :");
    // int number = sc.nextInt();
    // int counter = 1;
    // while (counter <= number) {
    // System.out.print(counter + " ");
    // counter++;
    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int sum = 0;
    // int i = 1;
    // while (i <= a) {
    // sum += i;
    // i++;
    // }
    // System.out.println(sum);

    // for loop -- > for(intialisation;condition;updation){
    // do something
    // }

    // for (int i = 0; i <= 10; i++) {
    // System.out.println("hello world");
    // }

    // for( int i = 1; i <= 4; i++){
    // System.out.println("****");
    // }

    // REVERSE the number
    // int n = 100599;
    // while (n > 0) {
    // int lastDigit = n % 10;
    // System.out.print(lastDigit);
    // n /= 10;
    // }
    // System.out.println();

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    // do {
    // System.out.print("enter the number:");
    // int n = sc.nextInt();
    // if (n % 10 == 0) {
    // break;
    // }
    // System.out.println(n);
    // } while (true);
    // }
    if (n == 2) {
      System.out.println("n is prime");
    } else {
      boolean isPrime = true;
      for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) {
          isPrime = false;
        }
      }
      if (isPrime == true) {
        System.out.println("n is prime");
      } else {
        System.out.println("n is not prime");
      }

    }

  }
}
