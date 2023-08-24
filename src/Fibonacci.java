import java.math.BigInteger;

public class Fibonacci
{
    public static void main(String[] args)
    {
        //BigInteger as the fibonacci numbers get very large
        BigInteger n = BigInteger.valueOf(30);
        for (int i = 0; i < n.intValueExact(); i++)
        {
            System.out.print(fibonacci(i) + " ");
        }
    }

    //Recursive method to calculate fibonacci number
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
