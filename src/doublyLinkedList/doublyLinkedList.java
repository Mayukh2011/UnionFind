package doublyLinkedList;

public class doublyLinkedList {
	
	public Node head=null;
	public Node pointer=null;
	public class Node
	{
		public String item;
		public Node next;
		public Node prev;
		
	}
	
	public boolean is_empty()
	{
		if(head==null)
		{
			return true;
		}
		return false;
	}
	
	public void add(String item)
	{
		if(is_empty())
		{
				
				head=new Node();
				head.item=item;
				pointer=head;
				head.prev=null;
		}
		else
		{
			Node next=new Node();
			next.item=item;
			head.next=next;
			next.prev=head;
			head=next;
			
			
		}
		
		
		
	}
	
	public void get(int i)
	{
		
			/*while(head!=null)
			{
				System.out.println(head.item);
				head=head.prev;
			}
			System.out.println("************************");
			while(pointer!=null)
			{
				System.out.println(pointer.item);
				pointer=pointer.next;
			}*/
			 
			if(i==0)
			{
				System.out.println(pointer.item);
			}
			else {
			pointer=pointer.next;
			i--;
			get(i);
			}
		
		
	}

}
