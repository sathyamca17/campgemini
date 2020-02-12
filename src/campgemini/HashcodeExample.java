package campgemini;

import java.util.Scanner;

public class HashcodeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer hash=new Integer(10);
		System.out.println(hash.hashCode());
		Scanner si=new Scanner(System.in);
		Integer i=si.nextInt();
		System.out.println(i.hashCode());
		
		Integer hash1=new Integer("c");
		System.out.println(hash.hashCode());
		
	}

}
