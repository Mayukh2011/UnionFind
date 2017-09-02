package binarySearch;

public class binarysearch_normal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {1,2,3,4,5};
		int low=0;
		int high=a.length-1;
		int key=4;
		while(low!=high)
		{
			int mid=(low+high)/2;
			if(a[mid]==key)
			{
				System.out.println("found it");
				break;
			}
			else if(a[mid]>key)
			{
				low=0;
				high=mid-1;
			}
			else if(a[mid]<key)
			{
				low=mid+1;
				high=a.length-1;
			}
		}

	}

}
