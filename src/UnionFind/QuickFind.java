package UnionFind;



public class QuickFind {

	public int [] id;
	
	public QuickFind(int n) {
		id=new int[n];
		//Initializaton:
				for(int i=0;i<n;i++)
					id[i]=i;
				//Initiaization ends
	}
	public void union(int p,int q)
	{
		int p_id=id[p];
		int q_id=id[q];
		for(int i=0;i<id.length;i++)
		{
			if(id[i]==p_id)
			{
				id[i]=q_id;
			}
		}
		
		
	}
	
	public void find(int p,int q)
	{
		if(id[p]==id[q])
		{
			System.out.println(p+" and "+q+" are connected!!");
		}
		else
		{
			System.out.println(p+" and "+q+" are NOT connected!!");
		}
	}
	
	
	
	

}
