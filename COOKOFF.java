import java.util.*;
class COOKOFF {
    public static void main(String[] args){
        try{
       Scanner in=new Scanner(System.in);
        int k=0,l=0,m=0,n=0,p=0,op=0;
      int T=in.nextInt();
        for(int q=0;q<T;q++){
        int N=in.nextInt();
        String[] str=new String[N];
        for(int i=0;i<N;i++){
        str[i]=in.next();
        if(str[i].equals("cakewalk"))
            k++;
        else if(str[i].equals("simple"))
            l++;
        else if(str[i].equals("easy"))
            m++;
        else if(str[i].equals("easy-medium")) 
            n++;
        else if(str[i].equals("medium"))
            n++;
        else if(str[i].equals("medium-hard")) 
            p++;
        else if(str[i].equals("hard"))
            p++;
         
            }
        
        
        if(k>=1 && l>=1 && m>=1 && n>=1 && p>=1)
            op++;
        if(op==0)
            System.out.println("No");
        else System.out.println("Yes");
        k=0;
        l=0;
        m=0;
        n=0;
        p=0;
        op=0;
        }}catch(Exception e){return;}
    }
}

