package Percolation_Problem;

import java.util.Random;

import UnionFind.WeightedQuickUnion;

public class Percolation {
	

	int[] b=null;
	int n=0;
	WeightedQuickUnion w=null;
	
	public Percolation(int n)
	{
		w=new WeightedQuickUnion((n+1)*(n+2));
		this.n=n;
		
		b=new int[(n+1)*(n+2)];
		for(int i=1;i<=n;i++)
		{
			w.union( arrayindex(1, i),0);
			w.union( arrayindex(n, i),(n+1)*(n+2)-1);
		}
		
		
		
	}
	
	public int arrayindex(int row,int col)
	{
		return (((n+1)*row)+col);
	}
	
	public boolean check_up(int row,int col)
	{
		if(b[arrayindex(row-1, col)]==1)
		{
			return true;
		}
		return false;
	}
	public boolean check_down(int row,int col)
	{
		if(b[arrayindex(row+1, col)]==1)
		{
			return true;
		}
		return false;
	}
	public boolean check_left(int row,int col)
	{
		if(b[arrayindex(row, col-1)]==1)
		{
			return true;
		}
		return false;
	}
	public boolean check_right(int row,int col)
	{
		if(b[arrayindex(row, col+1)]==1)
		{
			return true;
		}
		return false;
	}
	
	public void open(int row,int col)
	{
		if(!isOpen(row, col)) {
		b[arrayindex(row, col)]=1;
		
		
			if(check_up(row, col))
			{
				
				w.union(arrayindex(row, col), arrayindex(row-1, col));
				
			}
			
			if(check_down(row, col))
			{
			
				w.union(arrayindex(row, col), arrayindex(row+1, col));
				
			}
			if(check_left(row, col))
			{
				
				w.union(arrayindex(row, col), arrayindex(row, col-1));
				
			}
			
			if(check_right(row, col))
			{
				
				w.union(arrayindex(row, col), arrayindex(row, col+1));
				
			}
		}
		
	}
	
	public boolean isOpen(int row,int col)
	{
		if(b[arrayindex(row, col)]==1)
		{
			return true;
		}
		return false;
	}
	
	public boolean percolates()
	{
		if(w.find(0,(n+1)*(n+2)-1 ))
		{
			return true;
		}
		return false;
	}
	
	public int numberofopensite()
	{
		int number=0;
		
		for(int i=0;i<b.length;i++)
		{
			number=number+b[i];
		}
		return number;
	}
	
	
	
	
	
	public static void main(String[] args)
	{
		/*Percolation p=new Percolation(3);
		p.open(1, 1);
		p.open(2, 2);
		p.open(3, 2);
		p.open(2, 3);
		p.open(3, 3);
		p.open(2, 1);
		p.percolates();
		
		System.out.println(p.numberofopensite());*/
		int a=1000;
		Percolation p=new Percolation(a);
		
		while(!p.percolates())
		{
			Random rand = new Random();

			int  row = rand.nextInt(a) + 1;
			int  col = rand.nextInt(a) + 1;
			p.open(row, col);
			
		}
		
		System.out.println(p.numberofopensite());
		double threshold=(double)p.numberofopensite()/(double)(a*a);
		System.out.println("threshold: "+threshold);
		
		
		
	}

}
