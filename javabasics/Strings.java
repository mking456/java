import java.util.Arrays;
import java.util.Scanner;

public class Strings {
  public static void printletter(String str) {
    for (int i = 0; i < str.length(); i++) {
      System.out.print(str.charAt(i) + " ");
    }
    System.out.println();
  }

  public static boolean ispalidrome(String str) {
    int n = str.length();
    for (int i = 0; i < str.length() / 2; i++) {
      if (str.charAt(i) != str.charAt(n - i - 1)) {
        // not palindrome
        return false;
      }
    }
    return true;
  }

  public static float getShortestpath(String path) {
    int x = 0, y = 0;
    for (int i = 0; i < path.length(); i++) {
      char dir = path.charAt(i);

      // south
      if (dir == 'S') {
        y--;
      } // north
      else if (dir == 'N') {
        y++;
      } // west
      else if (dir == 'W') {
        x--;
      }
      // east
      else if (dir == 'E') {
        x++;
      }
    }
    int x2 = x * x;
    int y2 = y * y;
    return (float) Math.sqrt(x2 + y2);
  }

  public static String substring(String str, int si, int ei) {
    String substr = "";
    for (int i = si; i < ei; i++) {
      substr += str.charAt(i);
    }
    return substr;
  }

  public static String upperCase(String str) {
    StringBuilder sb = new StringBuilder("");
    char ch = Character.toUpperCase(str.charAt(0));
    sb.append(ch);
    for (int i = 1; i < str.length(); i++) {
      if (str.charAt(i) == ' ' && i < str.length() - 1) {
        sb.append(str.charAt(i));
        i++;
        sb.append(Character.toUpperCase(str.charAt(i)));
      } else {
        sb.append(str.charAt(i));
      }
    }
    return sb.toString();
  }

  public static String comprase(String str) {
    StringBuilder sb = new StringBuilder(" ");
    Integer count = 1;
    for (int i = 0; i < str.length(); i++) {
      while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
        count++;
        i++;
      }
      sb.append(str.charAt(i));
      if (count > 1) {
        sb.append(count.toString());
      }
    }
    return sb.toString();

  }

  public static void main(String[] args) {

    String str1 = "earth";
    String str2 = "heart";
    // Convert Strings to lowercase. Why? so thatwe don't have to checkseparately
    // for lower & uppercase
    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();

    // First check - if the lengths are the same
    if (str1.length() == str2.length()) {
      // convert strings into char array
      char[] str1chararray = str1.toCharArray();
      char[] str2chararray = str2.toCharArray();
      // sort the char array
      Arrays.sort(str1chararray);
      Arrays.sort(str2chararray);
      // if the sorted char arrays are sameor identical then the strings are anagram
      boolean result = Arrays.equals(str1chararray, str2chararray);
      if (result) {
        System.out.println(str1 + "and" + str2 + " are anagrams of each other");
      } else {
        System.out.println(str1 + "and" + str2 + " are  not  anagrams of each other");
      }
    } else {
      // case when lengths are not equal
      System.out.println(str1 + "and" + str2 + " are  not  anagrams of each other");
    }
    // String str = new Scanner(System.in).next();
    // int count = 0;
    // for (int i = 0; i < str.length(); i++) {
    // char ch = str.charAt(i);
    // if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
    // count++;
    // }
    // }
    // System.out.println("count of vowels :" + count);

    // String str = "ShradhaDidi";
    // String str1 = "ApnaCollege";
    // String str2 = "ShradhaDidi";
    // System.out.println(str.equals(str1) + " " + str.equals(str2));

    // String str = "aabbbbccddeee";
    // System.out.println(comprase(str));
    // String str = "hi, i am mayur";
    // System.out.println(upperCase(str));

    // String Fruits[] = { "apple", "banana", "mango" };
    // String largest = Fruits[0];
    // for (int i = 1; i < Fruits.length; i++) {
    // if (largest.compareTo(Fruits[i]) < 0) {
    // largest = Fruits[i];
    // }
    // }
    // System.out.println(largest);

    // String Str = "HelloWorld";
    // String path = "WNEENESENNN";
    // String str = "noon";
    // char arr[] = { 'a', 'b', 'c', 'd' };
    // String str = "abcd";
    // String str2 = new String("abcd");
    // System.out.println(str);
    // String fistname = "mayur";
    // String lastname = "patil";
    // String fullname = fistname + " " + lastname;
    // printletter(fullname);
    // System.out.println(ispalidrome(str));
    // System.out.println(getShortestpath(path));
    // System.out.println(substring(Str, 4, 7));
    // System.out.println(Str.substring(0, 5));

  }
}
