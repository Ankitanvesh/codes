import java.util.*;
 class BUGCAL {
 public static void main(String []args){
  try {
     Scanner in=new Scanner(System.in);
  int T=in.nextInt();
  for(int j=0;j<T;j++){
  int n=in.nextInt();
  in.nextLine();
  String str=in.nextLine();
  int[] a=new int[n];
  for(int i=0;i<n;i++)
  {a[i]=in.nextInt();}
  if(n==1 && str=="Dee")
  {   if((a[0]%2)==0)
      System.out.println("Dee");
  else System.out.println("Dum");
  }
  else
      System.out.println("Dum");
  }
 }catch(Exception e){return;}
 }
 }

