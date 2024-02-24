import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
  public static void swap(ArrayList<Integer> list, int indx1, int indx2) {
    int temp = list.get(indx1);
    list.set(indx1, list.get(indx2));
    list.set(indx2, temp);
  }

  public static int storeWater(ArrayList<Integer> list) {
    int maxWater = 0;
    int lP = 0;
    int rP = list.size() - 1;
    while (lP < rP) {
      // calculate water area
      int ht = Math.min(list.get(lP), list.get(rP));
      int width = rP - lP;
      int currWater = ht * width;
      maxWater = Math.max(maxWater, currWater);
      // update pointer
      if (list.get(lP) < list.get(rP)) {
        lP++;
      } else {
        rP--;
      }
    }
    return maxWater;
  }

  public static boolean pairSum(ArrayList<Integer> list, int target) {
    int lp = 0;
    int rp = list.size() - 1;
    while (lp != rp) {
      // case 1
      if (list.get(lp) + list.get(rp) == target) {
        return true;
      }
      // case 2
      if (list.get(lp) + list.get(rp) == target) {
        lp++;
      }
      // case 2
      else {
        rp--;
      }
    }
    return false;
  }

  public static void main(String[] args) {

    ArrayList<Integer> list = new ArrayList<>();
    int target = 8;
    // 1,8,6,2,5,4,8,3,7
    list.add(1);
    list.add(8);
    list.add(6);
    list.add(2);
    list.add(5);
    list.add(4);
    list.add(8);
    list.add(3);
    list.add(7);
    System.out.println(pairSum(list, target));
    // System.out.println(storeWater(list));

    // ArrayList<Integer> list1 = new ArrayList<>();
    // ArrayList<Integer> list2 = new ArrayList<>();
    // ArrayList<Integer> list3 = new ArrayList<>();

    // for (int i = 0; i < 5; i++) {
    // list1.add(i * 1);
    // list2.add(i * 2);
    // list3.add(i * 3);
    // }
    // list.add(list1);
    // list.add(list2);
    // list.add(list3);

    // System.out.print(list);
    // list.add(3);
    // list.add(4);
    // list.add(list);

    // ArrayList<Integer> list2 = new ArrayList<>();
    // list2.add(8);
    // list2.add(7);
    // list.add(list2);

    // for (int i = 0; i < list.size(); i++) {
    // ArrayList<Integer> cuurlist = list.get(i);
    // for (int j = 0; j < cuurlist.size(); j++) {
    // System.out.print(cuurlist.get(j) + " ");
    // }
    // System.out.println();
    // }
    // System.out.println(list);

    // ArrayList<Integer> list = new ArrayList<>();
    // list.add(2);
    // list.add(5);
    // list.add(9);
    // list.add(3);
    // list.add(6);
    // // int indx1 = 1;
    // // int indx2 = 2;
    // // System.out.println(list);
    // // swap(list, indx1, indx2);
    // // System.out.println(list);
    // Collections.sort(list);
    // System.out.println(list);
    // Collections.sort(list, Collections.reverseOrder());
    // System.out.println(list);
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