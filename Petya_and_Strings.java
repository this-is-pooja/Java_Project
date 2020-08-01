import java.util.Scanner;
public class Petya_and_Strings{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
       
        String first=obj.nextLine();
       
        String second=obj.nextLine();
        
        int r=first.compareToIgnoreCase(second);
               if(r<0){ System.out.println("-1");}
               if(r>0){ System.out.println("1");}
               if(r==0){ System.out.println("0");}
            
        
    }
}