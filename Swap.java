class Swap
{
    public static void main(String[] args)
    {
        System.out.println("Swap");
        int a,b,t;
        a=4;b=3;
        System.out.println("a="+a+" b="+b);
        t=a;
        a=b;
        b=t;
        System.out.println("after");
        System.out.println("a="+a+" b="+b);
    }
}