public class S{
    public static void main(String[] args){
              for(int i=0;i<=6;i++){
                  
            for( int j=0;j<2;j++){
                for(int  k=6;k>i;k-=1){
                    System.out.print(" ");
                }
                for( int l=0;l<i;l++){
                    System.out.print("*");
                }
                System.out.print("\n");
            }
        }
        
    }
}

