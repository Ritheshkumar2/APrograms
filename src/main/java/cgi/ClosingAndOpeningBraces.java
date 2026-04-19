package cgi;

import java.util.Stack;

public class ClosingAndOpeningBraces {

	public static void main(String[] args) {
		String input = "{()}";
        System.out.println(isBalanced(input));

	}

	private static boolean isBalanced(String input) {
		Stack<Character> c=new Stack<>();
		
		for(char c1:input.toCharArray()) {
			if(c1 == '(' || c1 == '{' || c1 == '[') {
				c.push(c1);
			}else if(c1 == ')' || c1 == '}' || c1 == ']') {
				if(c.isEmpty()) return false;

                char top = c.pop();

                if((c1 == ')' && top != '(') ||
                   (c1 == '}' && top != '{') ||
                   (c1 == ']' && top != '[')) {
                    return false;	
			}
		}
		
	}
		return c.empty();
}

}
