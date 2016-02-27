import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClosestToZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(-1);
		list.add(-2);
		list.add(3);
		list.add(6);
		list.add(16);
		list.add(11);
		list.add(33);
		list.add(44);
		list.add(66);
		
		
		int Mynumber = 0;
		
		int cidst = Math.abs(list.get(0) - Mynumber); //1
		int find=list.get(0);
		for(int n : list)
		{			
			if(cidst >Math.abs((n-Mynumber)))
			{
				cidst = Math.abs(Mynumber- (n));
				find = Math.abs(n);
			}
			
		}
		
		System.out.println(find);
	}

}
