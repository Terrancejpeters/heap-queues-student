package structures;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class MaxQueueTest {

  MaxQueue<String> queue;
	
  @Before
  public void setup() {
    queue = new MaxQueue<String>();
  }

  @Test (timeout = 100)
  public void testQueue() {
    queue.enqueue(100, "Highest priority");
    queue.enqueue(50, "High priority");
    queue.enqueue(25, "Medium priority");
    queue.enqueue(0, "Low priority");
    assertEquals("Highest priority", queue.dequeue());
    assertEquals("High priority", queue.dequeue());
    assertEquals("Medium priority", queue.dequeue());
    assertEquals("Low priority", queue.dequeue());
  }
  
  @Test (timeout = 100, expected = IllegalStateException.class)
  public void testIllegalState1(){
	  queue.dequeue();
  }
  
  @Test (timeout = 100, expected = IllegalStateException.class)
  public void testIllegalState2(){
	  queue.peek();
  }
  
 /* @Test (timeout = 100)
  public void testIterator(){
	  queue.enqueue(1, "small");
	  queue.enqueue(2, "medium");
	  queue.enqueue(3, "large");
	  System.out.println(queue.iterator().next().getValue());
	  assertEquals("large",queue.iterator().next().getValue());
  }*/

}
