package stackImpl;

public class Stack {
	
	private Object stack = new Object();
	
	public boolean isEmpty() {
		if(stack == null) {
			return false;
		}		
		return true;
	}

	public void push(Object input) {
		
		stack = input;
		
	}

	public Object pop() throws Exception {
		if(stack == null) {
			throw new Exception();
		}
		Object result = stack;
		stack = null;		
		return result;
	}

	public Object peek() {
		return stack;
	}

}
