public class My_Math

{
    public final double PI = 3.1415926535897932;
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
    public static long min(long a, long b)
    {
        return a<b?a:b;
    }
    public static double min(double a, double b)
    {
        return a<b?a:b;
    }
    public static long max(long a, long b)
    {
        return a>b?a:b;
    }
    public static double max(double a, double b)
    {
        return a>b?a:b;
    }
}
