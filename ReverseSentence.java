import java.util.Stack;
import java.util.StringTokenizer;


public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Auto generated stub";
		
		StringTokenizer tok = new StringTokenizer(str, " " );
		Stack<String> stack = new Stack<String>();
		StringBuffer buf = new StringBuffer();
		
		while(tok.hasMoreTokens())
		{
			stack.push(tok.nextToken());
			stack.push(" ");
		}		
		stack.pop();
		while(!stack.empty())
		{
			buf.append(stack.pop());			
		}
		
		System.out.println(buf.toString());

	}

}
