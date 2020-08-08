import java.util.Scanner;
import java.util.Arrays;
public class Boy_and_Girl{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int SIZE = s.length(); 
        char n[] = new char[SIZE];

        for(int i=0; i<SIZE; i++){
            n[i]= s.charAt(i);
        }
        
        for(int j=0;j<n.length;j++){
            for(int k=j+1;k<n.length;k++){
                if(n[j]==n[k]){
                    n[k]='0';
                }
            }
        }
        int count=0;
        for(int l=0;l<n.length;l++){
            if(n[l]!='0'){
            count++;
            }
        }
        
          
        
        if((count%2)!=0){
             System.out.println("IGNORE HIM!");
        }
        else{
              System.out.println("CHAT WITH HER!");
        }        sc.close();
    }
}