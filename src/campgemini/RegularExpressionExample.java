package campgemini;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String regx="sathya";
String yen="sathya";
Pattern p=Pattern.compile(regx);
Matcher m=p.matcher(yen);
System.out.println("values are"+regx);
System.out.println("values are"+yen);
System.out.println("looking at = "+m.lookingAt());
System.out.println("matches method = "+m.matches());
	}

}
