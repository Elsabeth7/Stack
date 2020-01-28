package stackImplTest;

import org.junit.Assert;
import org.junit.Test;

import stackImpl.Stack;

public class StackTest {
	@Test
	public void testStack_InitialSize() {
		Stack stack = new Stack();
		Assert.assertEquals(0, stack.size());
	}

	
	
}
