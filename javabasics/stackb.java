import java.util.*;

public class stackb {
  // public class Stack {
  // static ArrayList<Integer> list = new ArrayList<>();

  // public static boolean isempty() {
  // return list.size() == 0;
  // }

  // // push
  // public static void push(int data) {
  // list.add(data);
  // }

  // // pop
  // public static int pop() {
  // int top = list.get(list.size() - 1);
  // list.remove(list.size() - 1);
  // return top;
  // }

  // // peek
  // public static int peek() {
  // return list.get(list.size() - 1);
  // }
  // }
  public static void pushAtbottom(Stack<Integer> s, int data) {
    if (s.isEmpty()) {
      s.push(data);
      return;
    }
    int top = s.pop();
    pushAtbottom(s, data);
    s.push(top);
  }

  public static boolean isValid(String s) {
    Stack<Character> st = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (ch == '(') {
        st.push(ch);
      } else {
        if (st.isEmpty()) {
          return false;
        }
      }
      if (st.peek() == '(' || ch == ')') {
        return true;
      } else {
        return false;
      }
    }
    if (st.isEmpty()) {
      return true;
    } else {
      return false;
    }
  }

  public static int largestRectangleArea(int[] heights) {
    int largestRectangleArea = 0;
    int nsr[] = new int[heights.length];
    int nsl[] = new int[heights.length];
    // nsr
    Stack<Integer> s = new Stack<>();
    for (int i = heights.length - 1; i >= 0; i--) {
      while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
        s.pop();
      }
      if (s.isEmpty()) {
        nsr[i] = heights.length;
      } else {
        nsr[i] = s.peek();
      }
      s.push(i);
    }
    // nsl
    s = new Stack<>();
    for (int i = 0; i < heights.length; i++) {
      while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
        s.pop();
      }
      if (s.isEmpty()) {
        nsl[i] = -1;
      } else {
        nsl[i] = s.peek();
      }
      s.push(i);
    }

    // area
    for (int i = 0; i < heights.length; i++) {
      int height = heights[i];
      int width = nsr[i] - nsl[i] - 1;
      int currArea = height * width;
      largestRectangleArea = Math.max(currArea, largestRectangleArea);
    }
    return largestRectangleArea;
  }

  public static void main(String[] args) {
    // Stack s = new Stack();
    // Stack<Integer> s = new Stack<>();
    // s.push(1);
    // s.push(2);
    // s.push(3);
    // pushAtbottom(s, 4);
    // while (!s.isEmpty()) {
    // System.out.println(s.pop());

    // }

    // int arr[] = { 6, 10, 11, 2, 3 };
    // Stack<Integer> s = new Stack<>();
    // int nextGreater[] = new int[arr.length];

    // for (int i = arr.length - 1; i >= 0; i--) {
    // // while is empty
    // while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
    // s.pop();
    // }
    // // if - else
    // if (s.isEmpty()) {
    // nextGreater[i] = -1;
    // } else {
    // nextGreater[i] = arr[s.peek()];
    // }
    // // push
    // s.push(i);
    // }
    // for (int i = 0; i < nextGreater.length; i++) {
    // System.out.print(nextGreater[i] + " ");
    // }
    // System.out.println();
    // String s = "(]";
    // System.out.println(isValid(s));
    int[] heights = { 2, 1, 5, 6, 2, 3 };
    System.out.println("Max area in histogram is" + largestRectangleArea(heights));
  }
}
