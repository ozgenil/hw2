import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestUtil {
  Util c;

  @Before
  public void setUp() { c = new Util(); }

  @Test
  public void example() { assertTrue(true); }
  
  @Test
  public void testsizeone() { 
    assertEquals(false, c.compute(new int[1]));   
  }
  
  @Test
  public void testsizeeven() { 
  assertEquals(false, c.compute(new int[2]));   
  }
  
  @Test(expected = RuntimeException.class)
  public void testRuntimeException(){
    int[] array = {0, 1, 2};
    c.compute(array);
  }
  
  @Test
  public void testdivsum() { 
  int[] array = {3,3,3,3,3};
  assertEquals(true, c.compute(array));   
  }
}
