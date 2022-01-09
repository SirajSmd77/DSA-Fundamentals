package Day10;

public class checkParenthisis {

	public static void main(String[] args) {
		String s = "((){})";
		
		int top = -1;
		char[] a = new char[s.length()];
		
		for(int i = 0;i<s.length();i++) {
			if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
				top++;
				a[top] = s.charAt(i);
			}
			else if((s.charAt(i) == ')' && a[top] == '(') || (s.charAt(i) == '}' && a[top] == '{') || 
					(s.charAt(i) == ']' && a[top] == '[')) {
				top--;
			}
			else {
				continue;
			}
		}
		
		if(top == -1) {
			System.out.println("Valid pair of peranthasis");
		}
		else {
			System.out.println("Invalid pair of peranthasis");
		}
	}

}
