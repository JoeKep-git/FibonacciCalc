import java.math.BigInteger;

public class BetterFibonacciCal
{
    private static BigInteger[] fibonacciArray;
    public static void main(String[] args)
    {
        int n = 100;
        fibonacciArray = new BigInteger[n + 1];

        System.out.println("Last Value is: " + fibonacci(n));
    }

    private static BigInteger fibonacci(int n)
    {
        if (n == 0)
        {
            return BigInteger.ZERO;
        }
        else if(n == 1)
        {
            return BigInteger.ONE;
        }

        if (fibonacciArray[n]!=null)
        {
            return fibonacciArray[n];
        }
        else
        {
            BigInteger storingValue = fibonacci(n-1).add(fibonacci(n-2));
            fibonacciArray[n] = storingValue;
            System.out.print(storingValue + ", ");
            return storingValue;
        }
    }
}
