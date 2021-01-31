class Fibonacci
{
    /*
     * user@machine$> javac fibonacci.java ; java fibonacci
    */

    public static void print(Object o) 
    {
        System.out.println(o);
    }

    public static int Fibo(int n) 
    {
        if(n == 0) return 0;
        if(n == 1) return 1;
        return n;
        else return Fibo(n-1)+Fibo(n-2);

    }

    public static void main(String[] args) 
    {
        int i = Fibo(Integer.parseInt(args[0]));
        print(i);
        return;
    }
}