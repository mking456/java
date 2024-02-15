public class divideconquer {
  public static void printArr(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void mergeSort(int arr[], int si, int ei) {
    if (si >= ei) {
      return;
    }
    int mid = si + (ei - si) / 2;
    mergeSort(arr, si, mid);
    mergeSort(arr, mid + 1, ei);

    merge(arr, si, mid, ei);// mergecall
  }

  public static void merge(int arr[], int si, int mid, int ei) {
    // left(0,3)= 4 right(4,6)=3 temp[]= 6-0+1= 7
    int temp[] = new int[ei - si + 1];
    int i = si; // iteration for left side
    int j = mid + 1;// iteration for right side
    int k = 0;// iteration for temp arr
    while (i <= mid && j <= ei) {
      if (arr[i] < arr[j]) {
        temp[k] = arr[i];
        i++;
      } else {
        temp[k] = arr[j];
        j++;
      }
      k++;
    }
    while (i <= mid) {// for leftover element of 1st sorted part
      temp[k++] = arr[i++];
    }
    while (j <= ei) {// for leftover element of 2nd sorted part
      temp[k++] = arr[j++];
    }

    // copy temp array to original array
    for (k = 0, i = si; k < temp.length; k++, i++) {
      arr[i] = temp[k];
    }
  }

  public static void quickSort(int arr[], int si, int ei) {
    if (si >= ei) {
      return;
    }
    // last elemnent
    int pIdx = partion(arr, si, ei);
    quickSort(arr, si, pIdx - 1);// left
    quickSort(arr, pIdx + 1, ei);// right

  }

  public static void swap(int arr[], int i, int j) {
    int temp = arr[j];
    arr[j] = arr[i];
    arr[i] = temp;

  }

  public static int partion(int arr[], int si, int ei) {
    int pivot = arr[ei];
    int i = si - 1;// to make place to insert small element which are less than pivot to left

    for (int j = si; j < ei; j++) {
      if (arr[j] <= pivot) {
        i++;
        // sswap
        swap(arr, i, j);
      }
    }
    i++;
    int temp = pivot;
    arr[ei] = arr[i];
    arr[i] = temp;
    return i;
  }

  public static int search(int arr[], int tar, int si, int ei) {
    // kaam
    if (si > ei) {
      return -1;
    }
    int mid = si + (ei - si) / 2;
    if (arr[mid] == tar) {
      return mid;
    }

    // line on line 1
    if (arr[si] <= mid) {
      // case a : left
      if (arr[si] <= tar && tar <= arr[mid]) {
        return search(arr, tar, si, mid - 1);
      } else {
        // case b: right
        return search(arr, tar, mid + 1, ei);
      }
    }

    // mid line 2
    else {
      // case c : right
      if (arr[mid] == tar && tar <= arr[ei]) {
        return search(arr, tar, mid + 1, ei);
      } else {
        // case d : left
        return search(arr, tar, si, mid - 1);
      }
    }
+
  }

  public static void main(String[] args) {
    int arr[] = { 6, 3, 9, 8, 2, 5 };
    int target = 0;
    int tarIdx = search(arr, target, 0, arr.length - 1);
    System.out.println(tarIdx);
    // quickSort(arr, 0, arr.length - 1);
    // // mergeSort(arr, 0, arr.length - 1);
    // printArr(arr);
  }
}
