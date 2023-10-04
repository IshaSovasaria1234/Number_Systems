import java.util.*;

public class DecToAny
{
    private int num;

    DecToAny(int n) {
        num=n;
    }

    long toBinary() {
        long binNum=0;
        int temp = num, pow=0;
        while(temp > 0)
        {
            int bit = temp%2;
            temp/= 2;
            binNum+= bit*Math.pow(10, pow++);
        }
        return binNum;
    }

    long toOctal() {
        long octNum=0;
        int temp=num,pow=0;

        while(temp>0)
        {
            int bit=temp%8;
            temp/=8;
            octNum+= bit*Math.pow(10,pow++);
        }
        return octNum;
    }

    void showConversion()
    {
        System.out.println("\n"+num+" (Decimal) = "+toBinary()+" (Binary) = "+toOctal()+" (Octal)");
    }

    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an integer in Decimal system to convert to other bases: ");
        int n1=sc.nextInt();
        DecToAny obj=new DecToAny(n1);
        obj.showConversion();
    }
}