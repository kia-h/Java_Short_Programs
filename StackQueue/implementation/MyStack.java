/**
 * 
 */

package implementation;
import abstraction.IStack;
import java.util.ArrayList;

/**
 * @author Kia
 *
 */
public class MyStack implements IStack
{
	
//instance variables
	private int top;
	private ArrayList<Integer> data;
	private int initialCapacity;
	private int currentCapacity;
	
	public MyStack(int capacity) {
		if (capacity<=0){
			throw new IllegalArgumentException("Capacity should be a positive integer ");
		}
		data = new ArrayList<Integer>();
		top = Integer.MAX_VALUE ;
		currentCapacity= capacity;
		initialCapacity = capacity;
	}

	@Override
	public void push(int e) {
		if (isFull()) {
			throw new MyException("Stack is full!");
		}
		currentCapacity--;
		data.add(0,e);
		
	}
	
	@Override
	public int pop() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			throw new MyException("Stack is empty!");
		}
		currentCapacity++;
		return 1;
	}	

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return currentCapacity;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return  (currentCapacity-initialCapacity ==0 ? true:false);
	}
	
	public boolean isFull() {
		return (currentCapacity == 0 ? true: false);
	}

	@Override
	public int peek() {
		// TODO Auto-generated method stub
		return -1;
	}
	
//helper methods
	public int getc() {return currentCapacity; }
	public int geti() {return initialCapacity; }

}
