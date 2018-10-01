public class My_Math

{
    public static double ceil(double n)
    {
        double x= n%1;
        double var;
        if (x==0)
            var=(long)n;
        else
            var=(long)(n+1);
        return var;
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
