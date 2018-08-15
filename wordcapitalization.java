import java.util.Scanner;

public class Program {

  static Scanner value = new Scanner (System.in);

    public static String CapitalizeEachWord (String st) {

String result = "";
      st = st.replaceAll("()([A-Z])", "$1 $2");
      String[] words = st.split(" ");
      for (String word:words){
        if (word.length() > 0)
          result += Character.toUpperCase(word.charAt (0)) + word.substring(1) + " ";
      }
      return result;
    }

  public static void main(String[] args){

    String st = value.next();
    st = CapitalizeEachWord(st);
    System.out.println(st);
  }
}
