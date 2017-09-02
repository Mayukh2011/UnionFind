package Main;



import java.util.ArrayList;

import UnionFind.QuickFind;
import UnionFind.QuickUnion;
import UnionFind.WeightedQuickUnion;

public class main_tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			ArrayList<Integer> timelog=new ArrayList<Integer>();
			
			/*QuickFind uf=new QuickFind(10);
			uf.union(3, 2);
			uf.union(2, 5);
			uf.union(0, 1);
			uf.find(1,5);*/
		
		//social networking probem.
			
		WeightedQuickUnion qu=new WeightedQuickUnion(7);
		qu.union(0, 1);
		timelog.add(10);	
		qu.union(2, 4);
		timelog.add(11);
		qu.union(2, 0);
		timelog.add(12);
		qu.union(1, 2);
		timelog.add(13);
		qu.union(4, 3);
		timelog.add(14);
		qu.union(1, 5);
		timelog.add(15);
		qu.union(4, 0);
		timelog.add(15);
		qu.union(5, 1);
		timelog.add(16);
		qu.union(5, 0);
		timelog.add(17);
		qu.union(5, 6);
		timelog.add(18);
		qu.union(5, 2);
		timelog.add(19);
		
		
		System.out.println("time when all friends were connected:   "+timelog.get(qu.get_count()));
		
		
		

			

		}

	

}
