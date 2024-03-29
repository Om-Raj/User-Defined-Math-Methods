public class My_Math

{
    /* Global Constant Declaration */
    public final double PI = 3.1415926535897932;
    /* Equivalent to Math.ceil() */
    public static double ceil(double n)
    {
        if (n%1==0)
            return (long)n;
        else
            return (long)(n+1);
    }
    /* Equivalent of Math.floor() */
    public static double floor(double n)
    {
        return (long)n;
    }
    /* Equivalent of Math.abs() */
    public static double abs(double n)
    {
        if (n < 0)
            return n*-1;
        else
            return n;
    }
    /* Equivalent of Math.min() */
    public static long min(long a, long b)
    {
        return a<b?a:b;
    }
    /* Equivalent of Math.min() */
    public static double min(double a, double b)
    {
        return a<b?a:b;
    }
    /* Equivalent of Math.max() */
    public static long max(long a, long b)
    {
        return a>b?a:b;
    }
    /* Equivalent of Math.max() */
    public static double max(double a, double b)
    {
        return a>b?a:b;
    }

}
