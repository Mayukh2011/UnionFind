package UnionFind;

public class QuickUnion {
public int [] id;
	
	public QuickUnion(int n) {
		id=new int[n];
		//Initializaton:
				for(int i=0;i<n;i++)
					id[i]=i;
				//Initiaization ends
	}
	
	
	public void union(int p,int q)
	{
		
		id[find_root(p)]=find_root(q);
	}	
	
	public int find_root(int n)
	{
		while(id[n]!=n)
		{
			n=id[n];
		}
		return n;
	}
	
	public void find(int p,int q)
	{
		if(find_root(p)==find_root(q))
		{
			System.out.println("conected");
		}
		else
		{
			System.out.println("not connected!!");
		}
	}
	
	public void traverse_id()
	{
		for(int i=0;i<id.length;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("**************************************");
		for(int i=0;i<id.length;i++)
		{
			System.out.print(id[i]+" ");
		}
		System.out.println();
	}
	
}
