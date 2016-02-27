import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateNumbers {
	
	public static final int VALUE = 100;
	
	public DuplicateNumbers() {
	
		//VALUE = 33; //Compilation error if you try to change.
		
	}

	public static final void main(String... args) {
		// TODO Auto-generated method stub
		
		List<Integer>arr = new ArrayList<Integer>();
		
		arr.add(4);
		arr.add(4);
		arr.add(1);
		arr.add(3);
		arr.add(3);
		arr.add(2);
		
		Set<Integer> set = new HashSet<Integer>();
		
		set.addAll(arr);
		
		for(int i : set)
		{
			System.out.println(i);
		}

	}

}
