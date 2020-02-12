package campgemini;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExample {
public static void main(String[] args) {
	
    /*String s="...as";
	String as="mtkas";
	Pattern p=Pattern.compile(s);
	Matcher m=p.matcher(as);
	boolean k=m.matches();
	
	boolean b1=Pattern.compile(".s").matcher("as").matches();*/
	
	boolean b2=Pattern.matches(".a", "sa");
	System.out.println(b2);
	//System.out.println(k+" "+b1+" "+b2);
	
	
	
}
}
