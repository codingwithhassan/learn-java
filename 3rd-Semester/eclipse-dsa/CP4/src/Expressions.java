import java.util.Stack;

public class Expressions {

	public static boolean isBalanced(String expression) {
		int length = expression.length();
		char nextChar;
		Stack<Character> stack = new Stack<Character>();
		
		for(int index = 0; index < length; index++) {
			nextChar = expression.charAt(index);
			
			if(nextChar == '(' || nextChar == '{' || nextChar == '[') {
				stack.push(nextChar);
			}else if(nextChar == ')' || nextChar == '}' || nextChar == '}'){
				if(stack.isEmpty()) {
					return false;
				}
				
				if(!isOpenAndCloseBracketExists(stack.pop(), nextChar)) {
					return false;
				}
			}
		}
		if(!stack.isEmpty()) {
			return false;
		}
		return true;
	}
	
	public static boolean isOpenAndCloseBracketExists(char open, char close) {
		return (open == '(' && close == ')') || (open == '{' && close == '}') || (open == '[' && close == ']');
	}
	
	private static int prec(char c) {
	    if(c == '^') {
	        return 3;
	    }
	    else if(c == '*' || c == '/') {
	        return 2;
	    }
	    else if(c == '+' || c =='-') {
	        return 1;
	    }
	    else {
	        return -1;
	    }
	}

	public static String infixToPostfix(String expression)
	{
	    Stack<Character> st = new Stack<Character>();
	    String res = "";

	    for (int i = 0; i < expression.length(); i++)
	    {
	        if((expression.charAt(i) >= 'a' && expression.charAt(i) <= 'z') || (expression.charAt(i) >= 'A' && expression.charAt(i) <= 'Z')) {
	            res += expression.charAt(i);
	        }
	        else if(expression.charAt(i) == '(') {
	            st.push(expression.charAt(i));
	        }
	        else if(expression.charAt(i) == ')') {
	            while (!st.empty() && st.peek() != '(')
	            {
	                res += st.peek();
	                st.pop();
	            }
	            if(!st.empty()) {
	                st.pop();
	            }
	        }
	        else {
	            while (!st.empty() && prec(st.peek()) >= prec(expression.charAt(i)))
	            {
	                res += st.peek();
	                st.pop();
	            }
	            st.push(expression.charAt(i));
	        }
	    }
	    
	    while (!st.empty())
	    {
	       res += st.peek();
	       st.pop();
	    }
	    
	    return res;
	}

	public static void main(String[] args) {

		String expressions[] = new String[2];
		expressions[0] = "(a+b)";
		expressions[1] = "{c+e)]";

		String infix0 = "5+6";
		System.out.println(infix0 + " => " + infixToPostfix(infix0));
		String infix1 = "(5+6)*(8-2)";
		System.out.println(infix1 + " => " + infixToPostfix(infix1));
		
		for (String expression : expressions) {
			System.out.println("Expression: " + expression);
			System.out.println(isBalanced(expression) ? "Valid Expression\n" : "Not Valid Expression\n");
		}

	}

}
