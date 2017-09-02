package binarySearch;

public class bin_Search_recurssion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {1,2,3,4,5};
		bin_Search_rec(a,5,0,4);

	}

	private static void bin_Search_rec(int[] a, int key, int low, int high) {
		// TODO Auto-generated method stub
		int mid=(low+high)/2;
		
		if(a[mid]==key)
		{
			System.out.println( mid);
		}
		else if(a[mid]<key)
		{
			if(low==high)
			{
				System.out.println("doesnot exist");
			}else
			bin_Search_rec(a,key,mid+1,high);
		}
		else if(a[mid]>key) {
			if(low==high)
			{
				System.out.println("doesnot exist");
			}else
			bin_Search_rec(a,key,low,mid-1);
		}
		
		
	}

}
