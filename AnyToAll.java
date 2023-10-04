import java.util.*;
public class AnyToAll
{
    private long num;
    private int base;
    
    AnyToAll(long n,int b)
    {
        num= n;
        base= b;
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

    long toBinary()
    {
        long temp= toDenary(), binNum= 0;
        int pow=0;
        while(temp > 0)
        {
            binNum+= (temp%2)*Math.pow(10, pow++);
            temp/=2;
        }
        return binNum;
    }

    long toOctal()
    {
        long temp= toDenary(), octNum=0;
        int pow= 0;
        while(temp>0)
        {
            octNum+= (temp%8)*Math.pow(10,pow++);
            temp/=8;
        }
        return octNum;
    }

    void showConversion()
    {
        System.out.println("\n"+toBinary()+" (Base 2) = "+toOctal()+" (Base 8) = "+
            toDenary()+" (Base 10)");
    }

    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an integer to convert to other numbers systems: ");
        long n=sc.nextLong();
        System.out.print("Enter base: ");
        int base=sc.nextInt();
        
        AnyToAll obj=new AnyToAll(n,base);
        obj.showConversion();
    }
}