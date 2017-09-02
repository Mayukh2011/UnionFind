package ResizableArray;

import java.util.Iterator;

public class ArrayList<Items> implements Iterable<Items> {
	
	Items [] arr=null;
	int items_in_array=0;
	int pointer=0;
	public ArrayList()
	{
		arr=(Items[]) new Object[1];
	}
	
	public void push(Items item)
	{
		arr[items_in_array]=item;
		items_in_array=items_in_array+1;
		if(items_in_array==arr.length)
		{
			resize(arr.length*2);
		}
		
	}
	public Items pop()
	{
		
		Items item=arr[items_in_array-1];
		arr[items_in_array]=null;
		if(items_in_array>0&&items_in_array==arr.length/4)
		{
			resize(arr.length/2);
		}
		items_in_array=items_in_array-1;
		return item;
	}

	private void resize(int i) {
		Items[] temp=(Items[]) new Object[i];
		for(int x=0;x<arr.length;x++)
		{
			temp[x]=arr[x];
		}
		arr=temp;
		
	}

	@Override
	public Iterator<Items> iterator() {
		// TODO Auto-generated method stub
		return new List_Array_iterator();
	}
	
	public class List_Array_iterator implements Iterator<Items>
	{

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			if(arr[pointer]!=null)
			{
				return true;
			}
			
				return false;
		}

		@Override
		public Items next() {
			// TODO Auto-generated method stub
			
			Items i=arr[pointer];
			pointer=pointer+1;
			return i;
		}
		
	}
	
	

}
