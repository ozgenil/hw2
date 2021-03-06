import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.Before;

public class TestCompute {
  Compute c;
  MessageQueue mq;
  
  @Before
  public void setUp() {
   mq = mock(MessageQueue.class);
  }

  @Test
  public void example() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    assertTrue(true);
  }
  
  @Test
  public void zerosize(){
	 c = new Compute(mq);
	 when(c.mq.size()).thenReturn(0);
	 assertEquals(-1, c.countNumberOfOccurrences(""));
  } 
	
  @Test
  public void testsize(){
	 c = new Compute(mq);
	 when(c.mq.size()).thenReturn(5);
	 assertEquals(0, c.countNumberOfOccurrences(""));
  } 
	
  @Test
  public void testContains() {
	c = new Compute(mq);
   	when(mq.size()).thenReturn(5);
	when(mq.contains(anyString())).thenReturn(false);       
    	assertEquals(0, c.countNumberOfOccurrences("abc"));
  }
	
  @Test
  public void testCounter() {
	c = new Compute(mq);
    	when(mq.size()).thenReturn(2);
	when(mq.contains(anyString())).thenReturn(true);
    	when(c.mq.getAt(0)).thenReturn("abc");
	when(c.mq.getAt(1)).thenReturn("abcd");
    	assertEquals(1, c.countNumberOfOccurrences("abc"));
  }
     
}
