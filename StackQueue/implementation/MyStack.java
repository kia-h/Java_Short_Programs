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
	private int availableSpace;
	
	public MyStack(int capacity) {
		if (capacity<=0){
			throw new IllegalArgumentException("Capacity should be a positive integer ");
		}
		data = new ArrayList<Integer>();
		top = Integer.MAX_VALUE ;
		availableSpace= capacity;
		initialCapacity = capacity;
	}

	@Override
	public void push(int e) {
		if (isFull()) {
			throw new MyException("Stack is full!");
		}
		availableSpace--;
		data.add(0,e);		
	}
	
	@Override
	public int pop() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			throw new MyException("Poping Error! Stack is empty!");
		}
		availableSpace++;
		return data.remove(0);
	}	

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return initialCapacity;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return  (availableSpace-initialCapacity ==0 ? true:false);
	}
	
	public boolean isFull() {
		return (availableSpace == 0 ? true: false);
	}

	@Override
	public int peek() {
		// TODO Auto-generated method stub
		
		if (isEmpty()) {
			throw new MyException("Peeking Error! Stack is empty!");
		}
		return data.get(0);
	}
	
//helper methods
	public int getc() {return availableSpace; }
	public int geti() {return initialCapacity; }

}
