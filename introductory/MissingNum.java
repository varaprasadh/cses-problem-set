import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MissingNum {
   public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
      int n=scanner.nextInt();
      Set<Integer> set=new HashSet<>();
      for(int i=0;i<n-1;i++){
         set.add(scanner.nextInt());
      }
      for(int i=1;i<=n;i++){
          if(!set.contains(i)){
              System.out.print(""+i);
          }
      }
   }
}