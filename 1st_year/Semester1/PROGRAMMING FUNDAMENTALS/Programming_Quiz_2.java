import java.util.Scanner;

public class Programming_Quiz_2 {
  final static int START = -1, Finish = 9, Path = 1, Mark = 2;
  static int M, N;
  public static void main(String[] args) {
    String colsAndRows;
    String rowData;
    Scanner sc = new Scanner(System.in);
    colsAndRows = sc.nextLine();
    M = Integer.parseInt(colsAndRows.split(" ")[0]);
    N = Integer.parseInt(colsAndRows.split(" ")[1]);

    int[][] arr = new int[N][M];
    for (int i = 0; i < N; i++) {
      rowData = sc.nextLine();
      String[] rowDataSplitted = rowData.split(" ");
      for (int j = 0; j < rowDataSplitted.length; j++) {
        arr[i][j] = Integer.parseInt(rowDataSplitted[j]);
      }
    }

    int startIndex[] = indexSearch(arr, START);
    if (solve(arr, startIndex[0], startIndex[1]))
      System.out.println("Yes");
    else
      System.out.println("No");
    sc.close();
  }

  public static int[] indexSearch(int arr[][], int key) {
    int index[] = { -1, -1 };
    for (int row = 0; row < arr.length; row++) {
      for (int col = 0; col < arr.length; col++) {
        if (arr[row][col] == key) {
          index[0] = row;
          index[1] = col;
          return index;
        }
      }
    }
    return index;
  }

  public static boolean isWithinRange(int arr[][], int row, int col) {
    return (row >= 0 && row < N && col >= 0 && col < M);
  }

  public static boolean isSafe(int arr[][], int row, int col) {
    return (isWithinRange(arr, row, col) && (arr[row][col] == Path || arr[row][col] == START));
  }

  public static boolean solve(int arr[][], int row, int col) {
    boolean success = false;

    if (isWithinRange(arr, row, col) && arr[row][col] == Finish)
      success = true;
    else if (isSafe(arr, row, col)) {
      arr[row][col] = Mark;
      success = solve(arr, row - 1, col);
      if (!success)
        success = solve(arr, row, col + 1);
      if (!success)
        success = solve(arr, row, col - 1);
      if (!success)
        success = solve(arr, row + 1, col);
    }
    return success;
  }
}
