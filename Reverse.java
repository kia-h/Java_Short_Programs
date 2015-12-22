package reverseString;

public class Reverse {

	public static String reverseV1 (String input) {
		StringBuilder reversed = new StringBuilder(input.length());
		for (int i=input.length()-1; i>=0 ;i--) {
			reversed.append(input.charAt(i));
		}
		return reversed.toString();
	}
	
	public static String reverseV2 (String input) {
		String reversed ="";
		for (int i=input.length()-1; i>=0;i--) {
			reversed = reversed + input.charAt(i);
		}
		return reversed;
	}
	
	public static void main(String[] args) {
		
		System.out.println ("\"super\" in reverse (using V1): " + reverseV1("super"));
		System.out.println ("\"super\" in reverse (using V2): " + reverseV2("super"));
	}

}
