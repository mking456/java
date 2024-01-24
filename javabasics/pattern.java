import java.util.Scanner;

public class pattern {

  public static void hollow_Rectangle(int rows, int colums) {
    // outer loop
    for (int i = 1; i <= rows; i++) {
      // inner loop
      for (int j = 1; j <= colums; j++) {
        // cell(i,j)
        if (i == 1 || i == rows || j == 1 || j == colums) {
          // boundary cells
          System.out.print(" * ");
        } else {
          System.out.print("   ");
        }
      }
      System.out.println();
    }
  }

  public static void inverted_pyramid(int n) {
    // outer loop --> row
    for (int i = 1; i <= n; i++) {
      // inner loop
      for (int j = 1; j <= n - i; j++) {
        // space
        System.out.print("  ");
      }
      // star
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  public static void inverted_number_pyramid(int n) {

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i + 1; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }

  public static void flyoid_traingle(int n) {
    int count = 1;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(count + " ");
        count++;
      }
      for (int j = 1; j < n - i + 1; j++) {
        System.out.print(" ");
      }
      System.out.println();
    }
  }

  public static void zero_one_traiangle(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        if ((i + j) % 2 == 0) {// even
          System.out.print("1");
        } else {
          System.out.print("0");
        }
      }
      System.out.println();
    }
  }

  public static void butter_fly(int n) {
    // 1st-half
    for (int i = 1; i <= n; i++) {
      // star
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      // space
      for (int j = 1; j <= 2 * (n - i); j++) {
        System.out.print("  ");
      }
      // star
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }

    // 2nd half
    for (int i = n; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      for (int j = 1; j <= 2 * (n - i); j++) {
        System.out.print("  ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  public static void rhombus(int n) {
    for (int i = 1; i <= n; i++) {
      // space
      for (int j = 1; j <= n - i; j++) {
        System.out.print("  ");
      }
      for (int j = 1; j <= n; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  public static void hollow_rhombus(int n) {
    for (int i = 1; i <= n; i++) {
      // space
      for (int j = 1; j <= n - i; j++) {
        System.out.print("  ");
      }
      // hollow rectangle
      for (int j = 1; j <= n; j++) {
        if (i == 1 || i == n || j == 1 || j == n) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }

  public static void diamond(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print("  ");
      }
      for (int j = 1; j <=

          (2 * i) - 1; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    for (int i = n; i >= 1; i--) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print("  ");
      }
      for (int j = 1; j <= (2 * i) - 1; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  public static void main(Strings srgs[]) {
    // System.out.println("****");
    // System.out.println("***");
    // System.out.println("**");
    // System.out.println("*");
    // }
    // char ch = 'A';
    // int n = 4;
    // for (int i = 1; i <= n; i++)// outer loop
    // {
    // // inner looop
    // for (int j = 1; j <= i; j++) {
    // System.out.print(ch);
    // ch++;
    // }
    // System.out.println();
    // }
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // int star = 1;
    // int sp = n - 1;
    // int number_of_lines = 1;
    // while (number_of_lines <= n) {
    // // print star
    // for (int j = 0; j < star; j++) {
    // System.out.print(" * ");
    // }
    // // print number of space
    // for (int j = 0; j <= sp; j++) {
    // System.out.print(" ");
    // }
    // // prepare for next line
    // System.out.println();
    // star++;
    // sp--;
    // number_of_lines++;
    // int number_of_lines = 1;
    // int star = n;
    // int space = n - 2;
    // while (number_of_lines <= n - 1) {
    // if (number_of_lines == 1 || number_of_lines == n - 1) {

    // // PRINt n star
    // for (int i = 0; i < star; i++) {
    // System.out.print("* ");
    // }
    // } else {
    // // print on star
    // System.out.print("* ");
    // // print space
    // for (int i = 0; i <= space; i++) {
    // System.out.print(" ");
    // }
    // // print one star
    // System.out.print("* ");
    // }
    // System.out.println();
    // number_of_lines++;
    // }

    // int number_of_lines = 1;
    // int star = 1;
    // int space = 2 * n - 2;
    // while (number_of_lines <= 2 * n) {

    // // print star
    // for (int i = 0; i < star; i++) {
    // System.out.print("* ");
    // }

    // // print space
    // for (int i = 0; i < space; i++) {
    // System.out.print(" ");
    // }

    // // print star
    // for (int i = 0; i < star; i++) {
    // System.out.print("* ");
    // }
    // // next line
    // if (number_of_lines < n) {
    // star++;
    // space -= 2;
    // } else if (number_of_lines > n) {
    // star--;
    // space += 2;
    // }
    // System.out.println();
    // number_of_lines++;
    // }

    // int number_of_lines = 1;
    // int star = 1;
    // int space = n - 1;
    // while (number_of_lines <= 2 * n - 1) {
    // // print space
    // for (int i = 0; i < space; i++) {
    // System.out.print(" ");
    // }
    // // print star
    // for (int i = 0; i < star; i++) {
    // System.out.print("* ");
    // }
    // // next line
    // if (number_of_lines < n) {
    // star += 2;
    // space--;
    // } else {
    // star -= 2;
    // space++;
    // }
    // System.out.println();
    // number_of_lines++;
    // }

    // int inner_space = n - 1;
    // int outer_space = n - 2;
    // int number_of_lines = 1;
    // while (number_of_lines <= n) {
    // if (number_of_lines == 1 || number_of_lines == n) {
    // for (int i = 0; i < outer_space; i++) {
    // System.out.print(" ");
    // }
    // for (int i = 0; i < n; i++) {
    // System.out.print("* ");
    // }
    // } else {
    // // print outer space
    // for (int i = 0; i < outer_space; i++) {
    // System.out.print(" ");
    // }
    // // print star
    // System.out.print("* ");
    // // print inner space
    // for (int i = 0; i < inner_space; i++) {
    // System.out.print(" ");
    // }
    // // print star
    // System.out.print("* ");
    // }
    // // print nextline
    // System.out.println();
    // outer_space--;
    // number_of_lines++;
    // }

    // hollow_Rectangle(7, 4);
    // inverted_pyramid(4);
    // inverted_number_pyramid(4);
    // flyoid_traingle(5);
    // zero_one_traiangle(5);
    // butter_fly(4);
    // rhombus(6);
    // hollow_rhombus(4);
    diamond(4);

  }
}