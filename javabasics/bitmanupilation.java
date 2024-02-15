public class bitmanupilation {
  public static void oddOreven(int n) {
    int bitmask = 1;
    if ((n & bitmask) == 0) {
      System.out.println("number is even");
    } else {
      System.out.println("number is odd");
    }
  }

  public static int ithbitwise(int n, int i) {
    int bitwise = 1 << i;
    if ((n & bitwise) == 0) {
      return 0;
    } else {
      return 1;
    }
  }

  public static int setbit(int n, int i) {
    int bitmask = 1 << i;
    return n | bitmask;

  }

  public static int clearithbit(int n, int i) {
    int bitmask = ~(1 << i);
    return n & bitmask;
  }

  public static int updateith(int n, int i, int newBit) {
    if (newBit == 0) {
      return clearithbit(n, i);
    } else {
      return setbit(n, i);
    }
  }

  public static boolean isPower(int n) {
    return (n & (n - 1)) == 0;
  }

  public static int countSetbits(int n) {
    int count = 0;
    while (n > 0) {
      if ((n & 1) != 0) {
        count++;
      }
      n = n >> 1;
    }
    return count;
  }

  public static void main(String[] args) {
    System.out.println(countSetbits(16));
    // System.out.println(isPower(16));
    // System.out.println(updateith(4, 2, 0));
    // System.out.println(clearithbit(10, 1));
    // System.out.println(setbit(3, 3));
    // oddOreven(4);
  }

}
