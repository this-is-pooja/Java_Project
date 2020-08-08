import java.util.Scanner;
import java.util.Arrays;
public class Is_your_horseshoe_on_the_other_hoof{
    public static void main(String[] args){
      Scanner obj=new Scanner(System.in);
     
      int arr[]=new int[4];
      
        for(int i=0;i<4;i++){
            arr[i]=obj.nextInt();
        }
        int cnt=0;
        Arrays.sort(arr);
        for(int j=0;j<3;j++){
           if(arr[j]==arr[j+1]){
            cnt++;
           }
        }
         System.out.println(cnt);
        obj.close();
    }
}