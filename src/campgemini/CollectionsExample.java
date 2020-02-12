/**
 * 
 */
package campgemini;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author abc
 *
 */
public class CollectionsExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []str= {"c","c++","java","c#","python","cobol","c","c"};
		List list=new ArrayList();
		Collections.addAll(list,str);
		//Collections.reverseOrder(list);
		System.out.println(list);
		//list.add(null);
		list.add(null);
		list.add("java Script");
		System.out.println(list);
		System.out.println("Min val: " + Collections.min(list,null));
		List<String> synlist = Collections.synchronizedList(list);  
        System.out.println("Synchronized list is :"+synlist);  
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
        list.removeAll(Collections.singleton("c"));
        System.out.println(list);
        Collections.shuffle(list);  
        System.out.println("List after shuffle : "+list);  
	}

}
