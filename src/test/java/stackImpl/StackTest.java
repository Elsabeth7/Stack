package stackImpl;

import org.junit.Assert;
import org.junit.Test;

public class StackTest {
	@Test
	public void testStack_InitialSize() {
		LinkedList list = new LinkedList();
		Assert.assertEquals(0, list.size());
	}

	
}
