import java.util.Scanner;


public class Permutations {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int n=scanner.nextInt();
      if(n==1){
          System.out.println(""+1);
          return;
      }
      if(n==2 || n==3){
          System.out.println("NO SOLUTION");
          return;
      }
      StringBuilder even = new StringBuilder("");
      StringBuilder odd = new StringBuilder("");
      for (int i = 1; i <= n; i ++) {
          if(i%2==0){
              even.append(i+" ");
          }else{
              odd.append(i+" ");
          }
      }
      System.out.println(even.toString()+odd.toString());

  }
}