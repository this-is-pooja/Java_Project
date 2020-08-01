import java.util.Scanner;
public class Anton_Danik{
    public static void main(String[] args){
        int count=0;
        int cnt=0;
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        obj.nextLine();
         String s=obj.nextLine();
         
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A') count++;
            else if(s.charAt(i)=='D') cnt++;
        }
        String res="Friendship";
        if(count>cnt) res="Anton";
        else if(count<cnt) res="Danik";
        else res="Friendship";
      obj.close();
      System.out.print(res);
    }
}