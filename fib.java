public class Fib
{
    public static void main (String []args)
    {
        long startTime = 0;

        System.out.println("------------------");
        System.out.println("F I B O N A C C I ");
        System.out.println("    J A V A       ");
        System.out.println("------------------");

        int i = 0;
        startTime = System.currentTimeMillis();
        for (i = 0; i<31; i++)
        {
            System.out.println(i + "\t" + fib(i));
        }

        System.out.println("The process took: " + (System.currentTimeMillis() - startTime) + "ms");
    }

    public static int fib(int n)
    {
        if (n<=2)
            return 1;
        else
            return fib(n-1) + fib(n-2);
    }
}