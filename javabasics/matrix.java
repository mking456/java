import java.util.Scanner;

public class matrix {
  public static boolean search(int matrix[][], int key) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[i][j] == key) {
          System.out.println("Found at cell  (" + i + "," + j + ")");
          return true;
        }
      }
    }
    System.out.println("key not found");
    return false;
  }

  public static void spiralMatrix(int spiralMatrix[][]) {
    int n = spiralMatrix.length, m = spiralMatrix[0].length - 1;
    int startRow = 0;
    int startCol = 0;
    int endRow = n - 1;
    int endCol = m - 1;
    while (startRow <= endRow && startCol <= endCol) {
      // top
      for (int j = startCol; j <= endCol; j++) {
        System.out.print(spiralMatrix[startRow][j] + " ");
      }
      // right
      for (int i = startRow + 1; i <= endRow; i++) {
        System.out.print(spiralMatrix[i][endCol] + " ");
      }

      // bottom
      for (int j = endCol - 1; j >= startCol; j--) {
        if (startRow == endRow) {
          break;
        }
        System.out.print(spiralMatrix[endRow][j] + " ");
      }

      // left
      for (int i = endRow - 1; i >= startRow + 1; i--) {
        if (startCol == endCol) {
          break;
        }
        System.out.print(spiralMatrix[i][startCol] + " ");
      }
      startCol++;
      startRow++;
      endCol--;
      endRow--;
    }
    System.out.println();
  }

  public static int diagonalSum(int spiralMatrix[][]) {
    int sum = 0;
    // for (int i = 0; i < spiralMatrix.length; i++) {
    // for (int j = 0; j < spiralMatrix[0].length; j++) {
    // if (i == j) { // primary diagonal
    // sum += spiralMatrix[i][j];
    // } else if (i + j == spiralMatrix.length - 1) { // secondary diagonal
    // sum += spiralMatrix[i][j];
    // }
    // }
    // }
    // return sum;
    for (int i = 0; i < spiralMatrix.length; i++) { // primary diagonal
      sum += spiralMatrix[i][i];
      if (i != spiralMatrix.length - 1 - i)// secondary diagonal
        sum += spiralMatrix[i][spiralMatrix.length - 1 - i];
    }
    return sum;
  }

  public static void main(Strings[] args) {
    int spiralMatrix[][] = { { 1, 2, 3, 4 },
        { 5, 6, 7, 8 },
        { 9, 10, 11, 12 },
        { 13, 14, 15, 16 } };
    System.out.println(diagonalSum(spiralMatrix));
    // spiralMatrix(spiralMatrix);

    // int matrix[][] = new int[3][3];
    // int n = matrix.length, m = matrix[0].length;
    // Scanner sc = new Scanner(System.in);
    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < m; j++) {
    // matrix[i][j] = sc.nextInt();
    // }
    // }
    // // output
    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < m; j++) {
    // System.out.print(matrix[i][j] + " ");
    // }
    // System.out.println();
    // }
    // search(matrix, 5);
  }

}
