package examples.oo.bad;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class ExtendsMayBeEvil {

	public static void main(String[] args) {
		InstrumentedHashSet<String> set = new InstrumentedHashSet<String>();
		set.addAll(Arrays.asList("andre", "ribeiro", "goncalves"));

		System.out.println("Foram inseridos " + set.getAddCount()
				+ " elementos");
	}
}

@SuppressWarnings("serial")
class InstrumentedHashSet<E> extends HashSet<E> {
	private int addCount = 0;

	public InstrumentedHashSet() {
	}

	public InstrumentedHashSet(int initCap, float loadFactor) {
		super(initCap, loadFactor);
	}

	@Override
	public boolean add(E e) {
		addCount++;
		return super.add(e);
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		addCount += c.size();
		return super.addAll(c);
	}

	public int getAddCount() {
		return addCount;
	}
}