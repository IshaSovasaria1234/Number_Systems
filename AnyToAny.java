import java.util.*;

public class AnyToAny
{
    private long num;
    private int base;

    AnyToAny(long nu,int ba)
    {
        num=nu;
        base=ba;
    }

    boolean isCompatible()
    {
        long temp=num;
        while(temp>0)
        {
            int digit = (int)(temp%10);
            temp/=10;
            if(digit >= base)
                return false;
        }
        return true;
    }

    long toDenary()
    {
        long denNum=0, temp= num;
        int pow=0;
        while(temp>0)
        {
            denNum+= (temp%10)*Math.pow(base,pow++);
            temp/=10;
        }
        return denNum;
    }

    long toBaseX(int x)
    {
        long xNum=0, temp=toDenary();
        int pow=0;
        while(temp > 0)
        {
            xNum+= (temp%x)*Math.pow(10, pow++);
            temp/= x;
        }
        return xNum;
    }

    void display()
    {
        System.out.print("\n"+num+" (Base "+base+")");
    }

    void showConversion(int x)
    {
        if(isCompatible())
        {
            display();
            System.out.print(" = ");
            AnyToAny obj = new AnyToAny(toBaseX(x),x);
            obj.display();
        }
        else
            System.out.println("\nNot compatible");
    }

    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n=sc.nextLong();
        System.out.print("Enter base: ");
        int b=sc.nextInt();
        AnyToAny obj=new AnyToAny(n,b);
        System.out.print("Enter base to which number has to be converted:");
        int x=sc.nextInt();
        obj.showConversion(x);
    }
}