import java.util.*;
class Determinant{
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        int[][] A=new int[5][5];
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.println("the element at "+i+" "+j+" is");
                A[i][j]=in.nextInt();
            }
        }
        int ans=deter(A,5);
        System.out.println("the det is "+ans);
    }
    public static int deter(int A[][],int N){
        int det=0;
        if(N==1)
            det=A[0][0];
        else if(N==2)
            det=A[0][0]*A[1][1]-A[0][1]*A[1][0];
        else
        {for(int t=0;t<N;t++){
          int[][] p= new int[N-1][N-1];
          for(int i=1;i<N;i++){
              int k=0;
              for(int j=0;j<N;j++){
                  if(j==t)
                      continue;
                  p[i-1][k]=A[i][j];
                  k++;
              }
          }
          det+=Math.pow(-1,t)*A[0][t]*deter(p,N-1);
        }}
        return det;
    }
    public static void adjoint(int B[][],int N){
        int[][] m= new int[N-1][N-1];
        if(N==1)
            m[0][0]=B[0][0];
        else if(N==2)
        {   m[0][0]=B[1][1];
            m[0][1]=-1*B[0][1];
            m[1][0]=-1*B[1][0];
            m[1][1]=B[0][0];
        }
        else{
            
        }    
            
    }
}