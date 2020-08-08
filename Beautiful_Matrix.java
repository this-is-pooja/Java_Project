import java.util.Scanner;

//problem here -> https://codeforces.com/contest/263/problem/A

public class Beautiful_Matrix{
    public static void main(String[] args){
        int arr[][]=new int[5][5];
        Scanner obj=new Scanner(System.in);
        int a1=0,a2=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                 arr[i][j]=obj.nextInt();
                if(arr[i][j]==1){
                   a1=i;
                   a2=j;
                }
            }
        }
        int b1=0,b2=0;
        b1=(a1>2)?a1-2:2-a1;
        b2=(a2>2)?a2-2:2-a2;
        System.out.println(b1+b2);
        obj.close();

    }
}