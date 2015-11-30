package javaTests;

import java.util.Comparator;

public class NameComparator implements Comparator<Names> {

	@Override
	public int compare(Names o1, Names o2) {
		String name1 = o1.getName();
		String name2 = o2.getName();
		
		return name1.compareTo(name2);
	}
}
