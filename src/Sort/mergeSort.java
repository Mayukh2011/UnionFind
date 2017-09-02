package Sort;

public class mergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {3,2,4,1,7,6,8,9,10};
		sort(a,0,a.length-1);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();

	}

	private static void sort(int[] a,int low,int high) {
		// TODO Auto-generated method stub
		int mid=(low+high)/2;
		int[] aux=new int[a.length];
		if(low>=high) {
	
			return;
		}
		sort(a,low,mid);
		
		sort(a,mid+1,high);
	
		merger(a,aux,low,high);
		
		
		
	}

	private static void merger(int[] a,int[] aux,int low,int high) {
		
		int mid=(low+high)/2;
		int i=0;
		int j=mid+1;
		int k=0;
		for(int x=0;x<a.length;x++)
		{
			aux[x]=a[x];
		}
		
		while(i<mid+1&&j<=a.length-1)
		{
			
			
			
				if(aux[i]<=aux[j])
				{
					a[k]=aux[i];
					i++;
					k++;
				}
				else
				{
					a[k]=aux[j];
					j++;
					k++;
				}
			
				
		}
		
		if(i<=mid+1)
		{
			for(int c=i;c<mid+1;c++)
			{
				a[k]=aux[c];
				k++;
			}
		}
		if(j<a.length-1)
		{
			for(int c=j;c<a.length;c++)
			{
				a[k]=aux[c];
				k++;
			}
		}
		
		
	}
	

}
