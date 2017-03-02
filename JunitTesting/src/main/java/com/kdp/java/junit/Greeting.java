package com.kdp.java.junit;
import java.util.regex.Pattern;



import java.util.regex.Matcher;
public class Greeting {
	
	public String greet(String str) {
		if (str == null || str.length() ==0){
			throw new IllegalArgumentException();
		}
		return "Hello " + str;
	
	}
	
	
	public void match()
	{
		//next line of code to test 
				String s="AAAAaaaaabbadadadpsdappPPeeasas";
				String S2="ABCPQR";
			    String aa=Greeting.class.getSimpleName()      ;
			    System.out.println("The Class name executing this is:"+aa);
			    System.out.println("The Class name executing this is:"+Greeting.class.getName());
				System.out.println("The String 1 : "+s+" \n The String to be replace by blank is : "+S2);
				
				String regex="["+S2.toLowerCase()+S2.toUpperCase()+"]";
				
				Pattern p=Pattern.compile(regex);
				Matcher m=p.matcher(s);
				String replace=m.replaceAll("");

				System.out.println("The String after replacement is : "+ replace);
				
			
	}
	
	
}
