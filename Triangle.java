import java.util.*;
class Triangle
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter base");
		int b=sc.nextInt();
		System.out.println("enter height");
		int h=sc.nextInt();
		System.out.println("enter side");
		int s=sc.nextInt();
		double a=0.5*b*h;
		System.out.println("area 0f triangle:"+a);
		double p=s+b+h;
		System.out.println("peremeter 0f triangle:"+p);
	}
}