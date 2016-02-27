import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> sort = Arrays.asList(1,4,3,5,7,9,8);
		
		Collections.sort(sort);
		
		for(Integer ss : sort)
		{
			System.out.println(ss.toString());
		}
		
		List<Integer> sort1 = Arrays.asList(1,4,3,5,7,9,8);
		
		
		Collections.sort(sort1,Collections.reverseOrder());
		
		for(Integer ss : sort1)
		{
			System.out.println(ss.toString());
		}

		
	}

}
