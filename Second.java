import java.util.*;
class Second
{
    	public static void main(String[] args)
	{
        	List<Integer> l=Arrays.asList(10,20,30,40,50);
        	Collections.sort(l);
        	System.out.println("Second Largest:"+l.get(l.size()-2));
    	}
}