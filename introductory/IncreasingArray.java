import java.util.Scanner;

public class IncreasingArray {
   public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       int n=scanner.nextInt();
       int num;
       long ans = 0;
       long max=0;
       for(int i=0;i<n;i++){
           num=scanner.nextInt();
           max=Math.max(max,num);
           ans+=max-num;
       }
       System.out.println(""+ans);
   }
}