package campgemini;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailidvalidationExample {
	
	static void EmailidvalidationExample()
	{
	List<String> emails = new ArrayList();
	emails.add("user@domain.com");
	emails.add("user@domain.co.in");
	emails.add("user1@domain.com");
	emails.add("user.name@domain.com");
	emails.add("user#@domain.co.in");
	emails.add("user@domaincom");
	 
	//Invalid emails
	emails.add("user#domain.com");
	emails.add("@yahoo.com");
	 
	String regex = "^(.+)@(.+)$";
	 
	Pattern pattern = Pattern.compile(regex);
	 
	for(String email : emails)
	{
	    Matcher matcher = pattern.matcher(email);
	    System.out.println(email +" : "+ matcher.matches());
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmailidvalidationExample();
		
	}

}
