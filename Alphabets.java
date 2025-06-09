import java.util.*;
class Alphabets
	{	
		public static void main(String args[])
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String s=sc.nextLine().toLowerCase();
		int b[]=new int[26];
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch >='a' && ch <='z')
			{
				b[ch-'a']++;
			}
		}
		int m=0;
		for(int i=0;i<26;i++)
		{
			if(b[i]==0)
			{
				m++;
			}	
		}
		if(m==0)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("enter the sentence");

		}
	}
}

