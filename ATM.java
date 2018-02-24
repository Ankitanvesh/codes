import java.util.*;
class ATM{
    public static void main(String []args){
        Scanner in= new Scanner(System.in);
        int X;
        X=in.nextInt();
        float Y;
        Y=in.nextFloat();
        if(((X+.5)<=Y)&&(X%5==0))
            Y=Y-X-.50f;
        System.out.printf("%.2f",Y);
    }
    }
    
