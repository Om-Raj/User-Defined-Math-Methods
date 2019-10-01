public class My_Math

{
    public static double ceil(double n)
    {
        if (n%1==0)
            return (long)n;
        else
            return (long)(n+1);
    }
    public static double floor(double n)
    {
        double var = (long)n;
        return var;
    }
    public static double abs(double n)
    {
        if (n < 0)
            return n*-1;
        else
            return n;
    }
}
