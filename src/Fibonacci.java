import java.math.BigInteger;

public class Fibonacci
{
    public static void main(String[] args)
    {
        BigInteger n = BigInteger.valueOf(30);
        for (int i = 0; i < n.intValueExact(); i++)
        {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static BigInteger fibonacci(int n)
    {
        if (n == 0 || n == 1)
        {
            return BigInteger.valueOf(n);
        }
        else
        {
            return fibonacci(n - 1).add(fibonacci(n - 2));
        }
    }
}
