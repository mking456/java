public class backtracking {
  // public static void findAllPaths(int i, int j, int N, int[][] matrix,
  // boolean[][] visited, String pfs) {
  // if( i <= 0 || j <0 || )
  // findAllPaths(i-1, j, N, matrix, visited, pfs +"u");
  // findAllPaths(i+1, j, N, matrix, visited, pfs +"d");
  // findAllPaths(i, j-1, N, matrix, visited, pfs +"l");
  // findAllPaths(i, j+1, N, matrix, visited, pfs +"r");

  // }

  public static void changeArr(int arr[], int i, int val) {

    // basecase
    if (i == arr.length) {
      printArr(arr);
      return;
    }
    // recursion
    arr[i] = val;
    changeArr(arr, i + 1, val + 1);
    arr[i] = arr[i] - 2;
  }

  public static void printArr(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void findSubsets(String str, String ans, int i) {
    // base casee
    if (i == str.length()) {
      if (ans.length() == 0) {
        System.out.println("null");
      } else {
        System.out.println(ans);
        return;
      }
    }

    // recursion
    // yes choice
    findSubsets(str, ans + str.charAt(i), i + 1);
    // no choice
    findSubsets(str, ans, i + 1);
  }

  public static void permutations(String str, String ans) {
    // baae case
    if (str.length() == 0) {
      System.out.println(ans);
      return;
    }
    // recursion O(n*n!)
    for (int i = 0; i < str.length(); i++) {
      char curr = str.charAt(i);
      // "abcde" = "ab" + "de" = "abde"
      String NewStr = str.substring(0, i) + str.substring(i + 1);
      permutations(NewStr, ans + curr);

    }
  }

  public static boolean isSafe(char Board[][], int row, int col) {
    // vertical up
    for (int i = row - 1; i >= 0; i--) {
      if (Board[i][col] == 'Q') {
        return false;
      }
    }
    // diagonal left up
    for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
      if (Board[i][j] == 'Q') {
        return false;
      }
    }
    // diagonal right
    for (int i = row - 1, j = col + 1; i >= 0 && j < Board.length; i--, j++) {
      if (Board[i][j] == 'Q') {
        return false;
      }
    }
    return true;
  }

  public static void nQueens(char Board[][], int row) {
    // base case
    if (row == Board.length) {
      // printBord(Board);
      count++;
      return;
    }
    for (int j = 0; j < Board.length; j++) {
      if (isSafe(Board, row, j)) {
        Board[row][j] = 'Q';
        nQueens(Board, row + 1);// function call
        Board[row][j] = '.';// backtracking
      }
    }
  }

  static int count = 0;

  public static void printBord(char Board[][]) {
    System.out.println("---------chess board----------");
    for (int i = 0; i < Board.length; i++) {
      for (int j = 0; j < Board.length; j++) {
        System.out.print(Board[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static int gridways(int i, int j, int n, int m) {
    if (i == n - 1 && j == m - 1) {
      return 1;
    } else if (i == n || j == m) {
      return 0;
    }
    int w1 = gridways(i + 1, j, n, m);
    int w2 = gridways(i, j + 1, n, m);
    return w1 + w2;
  }

  public static boolean isSafe(int sudoko[][], int row, int col, int digit) {
    // column
    for (int i = 0; i <= 8; i++) {
      if (sudoko[i][col] == digit) {
        return false;
      }
    }

    // row
    for (int j = 0; j <= 8; j++) {
      if (sudoko[row][j] == digit) {
        return false;
      }
    }

    // grid
    int sr = (row / 3) * 3;
    int sc = (col / 3) * 3;
    // 3X3 GRID
    for (int i = sr; i < sr + 3; i++) {
      for (int j = sc; j < sc + 3; j++) {
        if (sudoko[i][j] == digit) {
          return false;
        }
      }
    }
    return true;
  }

  public static boolean sudokoSolver(int sudoko[][], int row, int col) {
    // base case
    if (row == 9) {
      return true;
    }
    int nextRow = row, nextCol = col + 1;
    if (col + 1 == 9) {
      nextRow = row + 1;
      nextCol = 0;
    }
    if (sudoko[row][col] != 0) {
      return sudokoSolver(sudoko, nextRow, nextCol);
    }
    for (int digit = 1; digit <= 9; digit++) {
      if (isSafe(sudoko, row, col, digit)) {
        sudoko[row][col] = digit;
        if (sudokoSolver(sudoko, nextRow, nextCol)) {
          return true;
        }
        sudoko[row][col] = 0;
      }
    }
    return false;
  }

  public static void printsudoko(int sudoko[][]) {
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        System.out.print(sudoko[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {

    int sudoko[][] = { { 0, 0, 8, 0, 0, 0, 0, 0, 0 }, { 4, 9, 0, 1, 5, 7, 0, 0, 2 }, { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
        { 1, 8, 5, 0, 6, 0, 0, 2, 0 }, { 0, 0, 0, 0, 2, 0, 0, 6, 0 }, { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
        { 0, 3, 0, 0, 7, 2, 0, 0, 4 }, { 0, 4, 9, 0, 3, 0, 0, 5, 7 }, { 8, 2, 7, 0, 0, 9, 0, 1, 3 } };
    if (sudokoSolver(sudoko, 0, 0)) {
      System.out.println("solution exists");
      printsudoko(sudoko);
    } else {
      System.out.println("Solution doesnot exit:");
    }
    // int n = 3, m = 3;
    // System.out.println(gridways(0, 0, n, m));
    // int n = 4;
    // char Board[][] = new char[n][n];
    // // intialize
    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < n; j++) {
    // Board[i][j] = '.';
    // }
    // }
    // nQueens(Board, 0);
    // System.out.println("Total no of ways :" + count);
    // String str = "abc";
    // permutations(str, "");
    // findSubsets(str, "", 0);
    // int arr[] = new int[5];
    // changeArr(arr, 0, 1);
    // printArr(arr);

  }
}
