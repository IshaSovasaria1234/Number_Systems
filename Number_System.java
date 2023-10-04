import java.util.*;

public class Number_System
{
    static int minBase(int a)
    {
        int min_base=0;
        while(a>0)
        {
            if(a%10>min_base)
                min_base=a%10;
            a/=10;
        }
        return (min_base+1);
    }

    static int toDecimal(int a,int base)
    {
        int pow=0, dec=0;
        while(a>0)
        {
            dec+= (a%10)*(int)Math.pow(base,pow++);
            a/=10;
        }
        return dec;
    }

    static void findBases(int x, int y) {
        int minx= minBase(x), miny= minBase(y), minBY= miny;
        for(; minx<=10; minx++)
            for(miny=minBY; miny<=10; miny++)
                if(toDecimal(x,minx) == toDecimal(y,miny)) {
                    System.out.println("\n"+x+" (Base "+minx+") = "+y+" (Base "+miny+")");
                    return;
                }
        System.out.println("\n"+x+" is not equal to "+y+" in any base from 2 - 10!");
    }

    public static void main()
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("INPUT:");
        System.out.print("X=");
        int x=sc.nextInt();
        System.out.print("Y=");
        int y=sc.nextInt();
        
        findBases(x, y);
    }
}