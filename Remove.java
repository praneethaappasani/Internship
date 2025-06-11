import java.util.*;
class Remove
{
	
        public static void main(String[] args)
	{
        	List<Integer> l=Arrays.asList(10,20,30,10,40,20,50);
        	List<Integer> n=new ArrayList<>();
        	for(Integer num:l)
		{
            		if(!n.contains(num))
			{
                		n.add(num);
           		}
        	}
        
        	System.out.println(n);
    	}
}