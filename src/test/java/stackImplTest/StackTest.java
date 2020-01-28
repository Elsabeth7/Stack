package stackImplTest;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import stackImpl.Stack;

public class StackTest {
	Stack stack = new Stack();
	
	@Test
	public void testStack_isEmpty() {
		
		assertEquals(true, stack.isEmpty());
	}

	@Test
	public void testStack_Pop() throws Exception {
		
		stack.push(1);
		Object result = stack.pop();
		assertEquals(1, result);
	}
	
	@Test
	public void testStack_peek() {
		stack.push(7);
		Object result = stack.peek();
		assertEquals(7, result);
	}
	
	@Test(expected = Exception.class)
	public void testStackPop_EmptyWithValue() throws Exception {
		stack.pop();
	}
	
}
