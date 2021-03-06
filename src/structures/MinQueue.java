package structures;

import java.util.Comparator;
import java.util.Iterator;

import comparators.ReverseIntegerComparator;

public class MinQueue<V> implements PriorityQueue<Integer, V> {

	private StudentArrayHeap<Integer,V> heap;
	
	public MinQueue(){
		heap = new StudentArrayHeap<Integer,V>(getComparator());
	}
	
	@Override
	public PriorityQueue<Integer, V> enqueue(Integer priority, V value) {
		// TODO Auto-generated method stub
		heap.add(priority, value);
		return this;
	}

	@Override
	public V dequeue() {
		// TODO Auto-generated method stub
		return heap.remove();
	}

	@Override
	public V peek() {
		// TODO Auto-generated method stub
		return heap.peek();
	}

	@Override
	public Iterator<Entry<Integer, V>> iterator() {
		return new QueueIterator<Integer,V>(heap);
	}

	@Override
	public Comparator<Integer> getComparator() {
		// TODO Auto-generated method stub
		return new ReverseIntegerComparator();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return heap.size();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (size() == 0){
			return true;
		}
		return false;
	}
}

