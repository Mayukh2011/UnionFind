package Sort;

public class selectionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {6,0,3,1,2,4,7,5};
		
		for(int i=0;i<a.length;i++)
		{
			int j=find_min(a, i);
			if(a[i]>a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}
	
	private static int find_min(int[] a,int k)
	{
		int min=k;
		for(int i=k+1;i<a.length;i++)
		{
			if(a[i]<a[min])
			{
				min=i;
			}
		}
		return min;
	}

}
