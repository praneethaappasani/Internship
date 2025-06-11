import java.util.*;
public class MergeSortedLists 
{
	public static void main(String[] args) 
	{
        	Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
        	List<Integer>list1=new ArrayList<>();
        	for(int i=0;i<n1;i++) 
		{
            		list1.add(sc.nextInt());
        	}
		int n2=sc.nextInt();
        	List<Integer>list2=new ArrayList<>();
        	for(int i=0;i<n2;i++) 
		{
            		list2.add(sc.nextInt());
        	}
		List<Integer>merged=new ArrayList<>();
        	int i=0,j=0;
		while(i<list1.size()&&j<list2.size()) 
		{
            		if(list1.get(i)<=list2.get(j)) 
			{
                		merged.add(list1.get(i++));
            		}else{
                		merged.add(list2.get(j++));
            		}
        	}
		while(i<list1.size())
			merged.add(list1.get(i++));
        		while(j<list2.size()) 
				merged.add(list2.get(j++));
				for(int k=0;k<merged.size();k++) 
				{
            				if(k>0) 
						System.out.print(" ");
            					System.out.print(merged.get(k));
        			}
				sc.close();
    	}
}
