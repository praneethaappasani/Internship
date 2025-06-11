import java.util.*;
public class ReverseList
{
	public static void main(String[] args) 
	{
        	Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        	List<Integer>list=new ArrayList<>();
        	for(int i=0;i<n;i++)
	 	{
            		list.add(sc.nextInt());
        	}
		int left=0,right=list.size()-1;
        	while(left<right)
 		{
            		int temp=list.get(left);
            		list.set(left,list.get(right));
            		list.set(right,temp);
            		left++;
            		right--;
        	}
		for(int i=0;i<list.size();i++)
		{
            		if(i>0) 
				System.out.print(" ");
            			System.out.print(list.get(i));
        	}
		sc.close();
    	}
}
