import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] s = new int[n][3];

    for (int i =0 ; i< n ; i++){
        for(int j=0;j<3;j++){
           s[i][j]=sc.nextInt();
        } 
    }
    int count = 0;
    int c = 0;
    for (int i = 0 ; i < n ; i++){
        c = 0;
        for(int j=0;j<3;j++){
            c +=s[i][j];
        }      
        if(c>=2){
            count++;
        }
    }
    System.out.println(count);  
    sc.close();    


    }
}           