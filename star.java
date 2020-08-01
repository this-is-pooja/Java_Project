 class Star{
     public static void main(String[] args){
         for(int i=0;i<10;i++){
           if((i==4)&&(i==6)&&(i==8)){i+=2;}
                 if(i==3||i==5||i==7||i==9){i+=1;}
            for(int j=1;j<3;j++){
                for(int k=10;k>i;k-=2){
                 System.out.print(" ");
                 } 
                 String r="*";
                 
                 for(int l=0;l<i;l++){
                   
                   System.out.print(r);
                 } 
                  System.out.print("\n");
            } 
               
         }   
     }
 }