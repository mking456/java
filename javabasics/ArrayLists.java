import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
  public static void swap(ArrayList<Integer> list, int indx1, int indx2) {
    int temp = list.get(indx1);
    list.set(indx1, list.get(indx2));
    list.set(indx2, temp);
  }

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(2);
    list.add(5);
    list.add(9);
    list.add(3);
    list.add(6);
    // int indx1 = 1;
    // int indx2 = 2;
    // System.out.println(list);
    // swap(list, indx1, indx2);
    // System.out.println(list);
    Collections.sort(list);
    System.out.println(list);
    Collections.sort(list, Collections.reverseOrder());
    System.out.println(list);
    // operations
    // 1)Add element O(1)
    // list.add(1);
    // list.add(2);
    // list.add(3);
    // list.add(4);
    // list.add(1, 9);// O(n)
    // // 2) Get element O(1)
    // System.out.println(list);
    // int element = list.get(2);
    // System.out.println(element);

    // // 3) Remove element O(n)-- liner time
    // list.remove(2);
    // System.out.println(list);

    // // 4) Set Element at index O(n)
    // list.set(2, 5);
    // System.out.println(list);

    // // 5) Contains element O(n)
    // System.out.println(list.contains(1));
    // System.out.println(list.contains(11));

    // print array list
    // for (int i = 0; i < list.size(); i++) {
    // System.out.print(list.get(i));
    // }
    // System.out.println();

    // reverse print -- O(n)
    // for (int i = list.size() - 1; i >= 0; i--) {
    // System.out.print(list.get(i) + " ");
    // }
    // System.out.println();

    // find max in ArrayList
    // int max = Integer.MIN_VALUE;
    // for (int i = 0; i < list.size(); i++) {
    // max = Math.max(max, list.get(i));
    // }
    // System.out.println("max element is " + max);

    // swap 2 Numbers

  }
}
