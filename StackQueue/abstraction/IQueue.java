package abstraction;

public interface IQueue {
	public void enqueue(int i); 
	public int dequeue();
	public int size();
	public boolean isEmpty();
	public int front();
}
