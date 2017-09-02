package ResizableArray;

public class resize_arr_tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.push(1);
		arr.pop();
		arr.push(2);
		arr.push(3);
		arr.push(4);
		arr.pop();
		//System.out.println("-------->>"+arr.pop());
		arr.push(9);
		//System.out.println("-------->>"+arr.pop());
		
		for(Integer a: arr)
		{
			System.out.println(a);
		}

	}

}
