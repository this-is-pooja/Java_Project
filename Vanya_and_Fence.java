import java.util.Scanner;
public class Vanya_and_Fence{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
       
        int n=obj.nextInt();
        int h=obj.nextInt();
          int count=0,a;
      
        for(int i=0;i<n;i++){
           a=obj.nextInt();
           if(a<=h){
            count+=1;
        }
         else if(a>=h){
            count+=2;
        }
        }
        System.out.println(count);
    }
}