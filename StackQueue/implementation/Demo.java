package implementation;

import abstraction.IStack;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		IStack ss = new MyStack(3);
		System.out.println ("size : "+ss.size());
		System.out.println ("current : "+ ss.getc());
		System.out.println ("inital : "+ ss.geti()+"\n"+"-------------------");
		
		
		System.out.println ("pushing 1");
		ss.push(1);
		System.out.println ("size : "+ss.size());
		System.out.println ("current : "+ ss.getc());
		System.out.println ("inital : "+ ss.geti()+"\n"+"-------------------");
		
		System.out.println ("pushing 1");
		ss.push(2);
		System.out.println ("size : "+ss.size());
		System.out.println ("current : "+ ss.getc());
		System.out.println ("inital : "+ ss.geti()+"\n"+"-------------------");
		
		System.out.println ("pushing 1");
		ss.push(3);
		System.out.println ("size : "+ss.size());
		System.out.println ("current : "+ ss.getc());
		System.out.println ("inital : "+ ss.geti()+"\n"+"-------------------");
		
		System.out.println ("4...here we should have full stack");
		ss.push(4);
//		ss.push(1);
//		ss.push(1);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println (e.getMessage());
		}
	}

}
