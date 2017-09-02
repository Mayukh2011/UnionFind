package Sort;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] a= {"S","O","R","T","E","X","A","M","P","L","E"};
		
		
		sort(a,7);
		
		for(int x=0;x<a.length;x++)
		{
			System.out.print(a[x]);
		}
		System.out.println();
	
	}
	
	public static void sort(Comparable[]a,int h)
	{
		
		for(int i=0;i<a.length-h;i++)
		{
			
			for(int j=i+h;j>=h;j=j-h)
			{ 
				
				if(a[j].compareTo(a[j-h])<0)
				{
					
					Comparable temp=a[j];
					a[j]=a[j-h];
					a[j-h]=temp;
				}
				
				
			}
			
			
		}
		
	}
}
