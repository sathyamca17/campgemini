package campgemini;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;



public class CollectionArrayListExample {
public static void main(String[] args) {
	SortedSet <Integer> al=new TreeSet<>();
	al.add(45);
	al.add(56);
	al.add(35);
	al.add(45);
	al.add(12);
	al.add(45);
	System.out.println(al);
	
//	for (int i = 0; i < al.size(); i++) {
	//	Integer Ir = al.
	//	System.out.println(Ir);
		
		
	//}
System.out.println("Iterator");
	/*for (Integer integer : al) {
		
		System.out.println(al.get(integer));
	}*/
	
	Iterator<Integer> i=al.iterator();
	while (i.hasNext()) {
		Integer k=i.next();
		System.out.println(k);
	}
}
}
