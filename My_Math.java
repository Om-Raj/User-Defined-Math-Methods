public class My_Math

{
    public final double pi = 3.1415926535897932;
    public static double ceil(double n)
    {
        if (n%1==0)
            return (long)n;
        else
            return (long)(n+1);
    }
    public static double floor(double n)
    {
        return (long)n;
    }
    public static double abs(double n)
    {
        if (n < 0)
            return n*-1;
        else
            return n;
    }
}
