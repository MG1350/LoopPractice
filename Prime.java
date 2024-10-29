import javax.lang.model.util.ElementScanner6;

public class Prime 
{
    public static void main(String args[])
    {
        System.out.println(countFactors(24));
        System.out.println(isPrime(27));
        System.out.println(isPrime(47));
        System.out.println(countPrimes(24));
        System.out.println(countPrimes(1000));
    }
    public static int countFactors(int n)
    {
        int count = n;
        int factors = 0;
        while(count>0)
        {
            if(n % count == 0)
            {
                factors += 1;
            }
            count -= 1;
        }
        return factors;
    }
    public static boolean isPrime(int n)
    {
        return(countFactors(n) == 2);
    }
    public static int countPrimes(int n)
    {
        int count = n;
        int primes = 0;
        while(count>0)
        {
            if(isPrime(count))
            {
                primes += 1;
            }
            count -= 1;
        }
        return primes;
    }
}
