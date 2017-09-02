package UnionFind;

public class WeightedQuickUnion {
public boolean connected=false;	
private int count=0;
public int [] id;
public int [] size;	
	public WeightedQuickUnion(int n) {
		id=new int[n];
		size=new int[n];
		//Initializaton:
				for(int i=0;i<n;i++) {
					id[i]=i;
					size[i]=1;
				}
				//Initiaization ends
				
				
	}
	
	
	public void union(int p,int q)
	{
		int root_p=find_root(p);
		int root_q=find_root(q);
		
		if(size[root_p]>size[root_q])
		{
			id[root_q]=root_p;
			size[root_p]=size[root_p]+size[root_q];
		}
		else
		{
			id[root_p]=root_q;
			size[root_q]=size[root_q]+size[root_p];
		}
		connected=areall_connected();
		
			if(!connected)
			{
				count++;
			}
		
		
	}	
	
	public int find_root(int n)
	{
		while(id[n]!=n)
		{
			n=id[n];
		}
		return n;
	}
	
	public boolean find(int p,int q)
	{
		if(find_root(p)==find_root(q))
		{
			return true;
		}
		return false;
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
	
	public void traverse_size()
	{
	
		for(int i=0;i<size.length;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("----------------------------------------------------");
		for(int i=0;i<size.length;i++)
		{
			System.out.print(size[i]+" ");
		}
		System.out.println();
	}
	public int get_count()
	{
		if(connected)
		return count;
		else
			return 999;
	}
	
	public boolean areall_connected()
	{
		boolean istrue=false;
		int root=id[0];
		for(int i=1;i<id.length;i++)
		{
			if(find_root(id[i])==root)
			{
				istrue=true;
			}
			else
			{
				istrue=false;
			}
		}
		return istrue;
	}

}
