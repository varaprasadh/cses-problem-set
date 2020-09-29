import java.util.Scanner;

public class Repetitions {
   public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        
        int l=1;
        int maxlen=1;
        for(int i=1;i<input.length();i++){
            if(input.charAt(i-1)==input.charAt(i)){
                l++;
                maxlen = Math.max(l, maxlen);
            }else{
                if(l>maxlen){
                    maxlen=l;
                }
                l=1;
            }
        }
        System.out.println(""+maxlen);

    }
}