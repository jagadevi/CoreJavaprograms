import java.util.ArrayList;
import java.util.List;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 int []  list = {1,4,3,2,6,8,5,7};
		
		int key = 3;
		
		/*list.add(1);
		list.add(4);
		list.add(3);
		list.add(2);
		
		list.add(6);
		list.add(5);*/
		
		for(int i=0;i<list.length; i++)
		{
			for (int j=i; j < list.length; j++)
			{
				if(list[i] > list[j])
				{
					System.out.println( "chagning " + list[i] +"and " + list[j]);
					int temp = list[i];
					list[i]=list[j];
					list[j]=temp;					
				}
			}
		}
		
		for(int n : list)
		{
			System.out.println(n);
		}
			
		
		

	}

}
