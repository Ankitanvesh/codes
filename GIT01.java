import java.util.*;
class GIT01{
    public static void main(String []args){
        try{
        Scanner in=new Scanner(System.in);
        int T=in.nextInt();
        for(int a=0;a<T;a++){
         int N=in.nextInt();
         int M=in.nextInt();
         int t1=0;
         int s1=0;
         int t2=0;
         int s2=0;
         int j;
         int p;
         int sum1=0;
         int sum2=0;
         char[][] A= new char[N][M];
         String[] B=new String[N];
         in.nextLine();
         for(int i=0;i<N;i++){
             B[i]=in.nextLine();
         
             for(j=0;j<M;j++){
                 A[i][j]=B[i].charAt(j);
             }
                 
         }
       for(int i=0;i<N;i++){
           for(j=0;j<M;j++){
               p=(i+j);
               if(p%2==0)
               {if(A[i][j]!='R')
                   t1++;
               else
                   s1++;
                   }
               else{
                   if(A[i][j]!='G')
                       t2++;
                   else
                       s2++;
               }
           }
           sum1= (t1*3)+(t2*5);
           sum2= (s1*5)+(s2*3);
           
           
           }
       if(sum1>sum2)
               System.out.println(sum2);
           else System.out.println(sum1);
       } }catch(Exception e){return;}    
    }
       
    
}