import java.io.*;
import java.util.*;
class ALEXTASK {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        PrintWriter out=new PrintWriter(System.out);
        int t=in.nextInt();
        int n,i,j;
        long a[],min,lcm;
        while(t>0)
        {
            min=Long.MAX_VALUE;
            n=in.nextInt();
            a=new long[n];
            //lcm=new long[(n*(n-1))/2];
            //int k=0;
            for(i=0;i<n;i++)
                a[i]=in.nextLong();
            for(i=0;i<n-1;i++)
            {
                for(j=i+1;j<n;j++)
                {
                  lcm=(a[i]*a[j])/gcd(a[i],a[j]);
                  //out.print("LCM is-"+lcm+"  ");
                  if(min>lcm)
                      min=lcm;
                }
            }
            /*for(long l:lcm)
            {
                if(l<min)
                    min=l;
            }*/
            out.println(min);
            t--;
        }
        in.close();
        out.close();
    }
    static long gcd(long a,long b)
    {
        //long gcd;
        while(b>0)
        {
            long r=a%b;
            a=b;
            b=r;
        }
        return a;
    }
} 