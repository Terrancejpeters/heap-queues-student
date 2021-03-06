package comparators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class IntegerComparatorTest {

  IntegerComparator comparator;
	
  @Before
  public void setup() {
    comparator = new IntegerComparator();
  }

  @Test (timeout = 100)
  public void testOne() {
	  int compared = comparator.compare(0, 0);
	  assertEquals("Returns 0 if equal",0,compared);
  }
  
  @Test
  public void testCompare(){
	  int compared = comparator.compare(0, 1);
	  assertEquals(-1,compared);
	 
  }
  
  @Test
  public void testNegCompare(){
	  int compared = comparator.compare(1, -1);
	  assertEquals(1,compared);
  }

}
