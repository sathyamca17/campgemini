package campgemini;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str= {"Jaipur","Cochin","Luknow"};
HashSet<String> s=new HashSet<String>();

	System.out.println("hi  I am here");
s.add("Delhi");
s.add("Chennai");
s.add(null);
s.add("Pune");
s.add(null);
s.add("Bombay");
s.add("Kanpur");
s.add("Delhi");

System.out.println("Using add method");
System.out.println(s);
Collections.addAll(s, str);
System.out.println("Using addAll method");
System.out.println(s);
s.remove("Delhi");
System.out.println("Delhi is removed ");
System.out.println(s);
s.remove("lucknow");
System.out.println("Lunknow is Not removed ");
System.out.println(s);
System.out.println(s.contains("Pune"));
//s.clear();
//Creating a new cloned set  
HashSet<String> clonedSet = new HashSet<String>();  
//Clone the HashSet  
clonedSet = (HashSet)s.clone();  
//Displaying the new Set after Cloning;  
System.out.println("The new clone set elements: " + clonedSet);
if(s.isEmpty())
{
	System.out.println("hi i have cleared all elements from Hashset");
	}


}}