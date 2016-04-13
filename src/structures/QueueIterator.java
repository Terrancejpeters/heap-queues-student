package structures;

import java.util.Iterator;
import java.util.Queue;

public class QueueIterator<P,V> implements Iterator{
	
	Queue<Entry<P,V>> toIter;
	
	public <Entry> QueueIterator (StudentArrayHeap<P,V> theHeap){
		for (int i = 0; i <theHeap.size(); i++){
			toIter.add(theHeap.getEntry(0));
		}
	}
	
	public boolean hasNext(){
		if (toIter.peek() != null){
			return true;
		}
		return false;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return toIter.remove();
	}
	

}
