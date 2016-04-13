package structures;

import java.util.Comparator;

public class StudentArrayHeap<P, V> extends AbstractArrayHeap<P, V> {

	protected StudentArrayHeap(Comparator<P> comparator) {
		super(comparator);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected int getLeftChildOf(int index) throws IndexOutOfBoundsException {
		if (index < 0) {
			throw new IndexOutOfBoundsException();
		}
		return (index * 2) + 1;
	}

	@Override
	protected int getRightChildOf(int index) throws IndexOutOfBoundsException {
		if (index < 0) {
			throw new IndexOutOfBoundsException();
		}
		return getLeftChildOf(index) + 1;
	}

	@Override
	protected int getParentOf(int index) throws IndexOutOfBoundsException {
		if (index < 1) {
			throw new IndexOutOfBoundsException();
		}
		return (index - 1) / 2;
	}

	@Override
	protected void bubbleUp(int index) {
		while (index > 0
				&& comparator.compare(heap.get(index).getPriority(), heap.get(getParentOf(index)).getPriority()) > 0) {
			// What do if the Values are the same?? should be < 0 or less than??
			int parentInd = getParentOf(index);
			swap(index, parentInd);
			index = parentInd;

		}
	}

	@Override
	protected void bubbleDown(int index) {

		while (getLeftChildOf(index) < heap.size()) {
			int lChild = getLeftChildOf(index);
			int rChild = getRightChildOf(index);
			int bigBoy = lChild;
			if (rChild < heap.size()
					&& comparator.compare(heap.get(lChild).getPriority(), heap.get(rChild).getPriority()) < 0) {
				bigBoy = rChild;
			}
			if (comparator.compare(heap.get(bigBoy).getPriority(), heap.get(index).getPriority()) > 0) {
				swap(index, bigBoy);
				index = bigBoy;
			} else {
				index = heap.size();
			}
		}

	}
	
	protected Entry<P, V> getEntry(int index){
		return heap.get(index);
	}
	
}
