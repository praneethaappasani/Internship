import java.util.*;
class Node 
{
	int data;
    	Node next;
    	Node(int data) 
	{
        	this.data=data;
        	this.next=null;
    	}
}
class DetectCycleUserInput
{
	public static boolean hasCycle(Node head) 
	{
        	Node slow=head;
        	Node fast=head;
		while(fast!=null&&fast.next!=null) 
		{
            		slow=slow.next;
            		fast=fast.next.next;
            		if(slow==fast) 
				return true;
        	}
		return false;
    	}
	public static void main(String[] args)
	{
        	Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); 
        	Node head=null,tail=null;
        	List<Node>nodes=new ArrayList<>();
		for(int i=0;i<n;i++) 
		{
            		int val=sc.nextInt();
            		Node newNode=new Node(val);
            		if(head==null)
	 		{
                		head=newNode;
                		tail=newNode;
            		}else{
                		tail.next=newNode;
                		tail=newNode;
            		}
            		nodes.add(newNode);
        	}
		int pos=sc.nextInt(); 
        	if(pos>=0&&pos<nodes.size()) 
		{
            		tail.next=nodes.get(pos);
        	}
		boolean result=hasCycle(head);
        	System.out.println(result ? "Cycle detected" : "No cycle");
		sc.close();
    }
}
