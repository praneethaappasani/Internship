import java.util.*;
public class SecondLargest 
{
	public static void main(String[] args) 
	{
        	Scanner sc=new Scanner(System.in);
        	System.out.print("Enter number of elements: ");
        	int n=sc.nextInt();
		if(n<2)
	 	{
            		System.out.println("At least two elements are required");
            		return;
        	}
		List<Integer>list=new ArrayList<>();
        	for(int i=0;i<n;i++) 
		{	
            		list.add(sc.nextInt());
        	}
		Collections.sort(list,Collections.reverseOrder());
		int first=list.get(0);
        	int secondLargest=Integer.MIN_VALUE;
		for(int i=1;i<list.size();i++) 
		{
            		if(list.get(i)!=first) 
			{
                		secondLargest=list.get(i);
                		break;
            		}
        	}
		if(secondLargest==Integer.MIN_VALUE) 
		{
            		System.out.println("No second largest element(all elements may be equal)");
        	}else{
            		System.out.println("Second largest element: "+secondLargest);
        	}
		sc.close();
    	}	
}	
