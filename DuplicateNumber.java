import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DuplicateNumber {
	
    public void findDuplicateNumber(List<Integer> numbers){
        
       /* int highestNumber = numbers.size() - 1;
        int total = getSum(numbers);
        int duplicate = total - (highestNumber*(highestNumber+1)/2);*/
    	
    	Collections.sort(numbers);
        int m=0;
        int j;
    	for(int i =0; i <numbers.size()-1; i++)
    	{
    		if(i==0)
    		{
    			m = numbers.get(0);
    		}
    		else
    		{
    			if(m == numbers.get(i))
    			{
    				System.out.println("number " + m + " is duplicate");
    			}
    			m=numbers.get(i);
    		}
    	}
    }
     
    public int getSum(List<Integer> numbers){
         
        int sum = 0;
        for(int num:numbers){
            sum += num;
        }
        return sum;
    }
     
    public static void main(String a[]){
        List<Integer> numbers = new ArrayList<Integer>();
        for(int i=1;i<30;i++){
            numbers.add(i);
        }
        //add duplicate number into the list
        numbers.add(28);
        numbers.add(24);
        DuplicateNumber dn = new DuplicateNumber();
        dn.findDuplicateNumber(numbers);
       // System.out.println("Duplicate Number: "+dn.findDuplicateNumber(numbers));
    }

}
