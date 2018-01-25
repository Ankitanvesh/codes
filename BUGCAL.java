import java.util.*;
 class BUGCAL {
 public static void main(String []args){
  Scanner in=new Scanner(System.in);
  int T=in.nextInt();
  for(int j=0;j<T;j++){
  int a=in.nextInt();
  int b=in.nextInt();        
     int num=0,i=0;
  while(a!=0 || b!=0){
     num=num+((((a%10)+(b%10))%10)*(int)(Math.pow(10,i))) ;
    a=a/10;
    b=b/10;
    i++;
  }
  System.out.println(num);
 }}
 } 