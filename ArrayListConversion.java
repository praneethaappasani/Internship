import java.util.*;
public class ArrayListConversion 
{
    	public static void main(String[] args) 
	{
        	Scanner sc=new Scanner(System.in);
        	int n=sc.nextInt();
        	Integer[] arr=new Integer[n];
        	for(int i=0;i<n;i++) 
		{
            		arr[i]=sc.nextInt();
        	}
		List<Integer>list=new ArrayList<>(Arrays.asList(arr));
        	Integer[] newArray=list.toArray(new Integer[0]);
		for(int i=0;i<list.size();i++)
 		{
            		if(i>0) 
				System.out.print(" ");
            			System.out.print(list.get(i));
        	}
		System.out.println();
		for(int i=0;i<newArray.length;i++)
 		{
            		if(i>0) 
				System.out.print(" ");
            			System.out.print(newArray[i]);
		}
		sc.close();
    	}
}
