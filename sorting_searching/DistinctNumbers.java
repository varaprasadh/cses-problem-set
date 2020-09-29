import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DistinctNumbers {
  public static void main(String[] args) {
      Set<String> vals=new HashSet();
      Scanner scanner=new Scanner(System.in);
      scanner.nextLine();
      String input=scanner.nextLine();
      String[] chars=input.trim().split(" ");
      for(String ch:chars){
        vals.add(ch);
      }
      System.out.println(vals.size()+"");
  }
}