import java.util.ArrayList;
import java.util.List;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<Integer>();
		
		int key = 3;
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		int low =0;
		int high = list.size()-1;
		
		while (low<=high)
		{
			int middle = (high+low)/2; 
			
			if(list.get(middle) == key)
			{
				System.out.println("found");
				break;
			}
			else if (list.get(middle) > key)
			{
				high = middle -1;
			}
			else if (list.get(middle) < key)
			{
				low = middle +1;
			}
		}
		
		
	}

}
