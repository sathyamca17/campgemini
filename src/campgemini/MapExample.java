package campgemini;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
public static void main(String[] args) {
	HashMap map= new HashMap();
	
	map.put(6,"Sathya");
	map.put(2, "Valli");
	map.put(9, "Natarajan");
	map.put(9, "Srinivasan");
	map.put(7, "Gopal");
	System.out.println(map);
	Map<Integer,String> maps=new HashMap<Integer,String>();
	maps.put(6,"Chennai");
	maps.put(2,"Delhi");
	maps.put(9,"Bangalore");
	maps.put(4,"Luknow");
	maps.put(5,"Goa");
	maps.put(9,"Vellore");
	System.out.println(maps);
	Set set=map.entrySet();
	Set set1=maps.entrySet();
	Iterator i=set.iterator();
	Iterator i1=set1.iterator();
	while(i.hasNext())
	{
		Map.Entry entry=(Map.Entry)i.next();
		Map.Entry entry1=(Map.Entry)i1.next();
		//System.out.println(entry.getKey()+" "+entry.getValue());
		if(entry.getKey().equals(entry1.getKey()))
		{
			System.out.println("hai I am "+entry.getValue()+" in "+entry1.getValue());
		}
		
		
	}
	
	System.out.println(maps.remove(9));
	System.out.println(maps.remove(2, "Delhi"));
	System.out.println(maps.remove(5));
	System.out.println(maps);
	
	
//	Set sk=maps.entrySet();
	//Iterator is=sk.iterator();
	
			
		
	
	
	
}
}
