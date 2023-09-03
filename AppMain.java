import java.util.ArrayList;
import java.util.List;

public class AppMain {

  public static boolean leap(int x) {
    String value = String.valueOf(x);
    if (
      value.charAt(2) == '1' ||
      value.charAt(2) == '3' ||
      value.charAt(2) == 5 ||
      value.charAt(2) == '7' ||
      value.charAt(2) == '9'
    ) {
      if (
        value.charAt(3) == '2' || value.charAt(3) == '6'
      ) return true; 
      else return false;
    } else {
      if (value.charAt(2) == '0' && value.charAt(3) == '0') {
        return false;
      }
      if (
        value.charAt(3) == '0' ||
        value.charAt(3) == '4' ||
        value.charAt(3) == '8'
      ) return true;
    }
    return false;
  }

  public static void lengthy(List<Object> words) {
    int count = 0;
    String longestWord = "";
    for (Object wordObj : words) {
      String wordStr = wordObj.toString();
      if (wordStr.length() > 5) ++count;
      if (wordStr.length() > longestWord.length()) longestWord = wordStr;
    }
    System.out.println(count);
  }

  public static void main(String[] args) {
    List<Object> list = new ArrayList<>();
    for (int i = 1; i < args.length; i++) {
      list.add(args[i]);
    }
    int data = Integer.parseInt(args[0]);
    if (leap(data)) {
      lengthy(list);
    } else {
      System.out.println("Not a leap");
    }
  }
}
