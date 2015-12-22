import java.util.LinkedList;

/**
 * @author Leo
 */
public class MinMax
{
	public int getMin(LinkedList<Integer> list)
	{
		if (list.isEmpty())
			return Integer.MAX_VALUE;
		
		// base case 
		if (list.size() == 1)
			return list.getFirst();
		
		LinkedList<Integer> temp = (LinkedList<Integer>) list.clone();
		
		return Math.min(temp.removeFirst(), getMin(temp));
	}
	
	public int getMax(LinkedList<Integer> list)
	{
		if (list.isEmpty())
			return Integer.MAX_VALUE;
		
		if (list.size() == 1)
			return list.getFirst();
		
		LinkedList<Integer> temp = (LinkedList<Integer>) list.clone();
		
		return Math.max(temp.removeFirst(), getMax(temp));
	}
}
