package com.kdp.java;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!!!");
		// String replace code below
		
		String s="AAAAaaaaabbadadadpsdappPPeeasas";
				String S2="ABCPQR";
			    String aa=HelloWorld.class.getSimpleName()      ;
			    System.out.println("The Class name executing this is:"+aa);
			    System.out.println("The Class name executing this is:"+HelloWorld.class.getName());
				System.out.println("The String 1 : "+s+" \n The String to be replace by blank is : "+S2);
				
				String regex="["+S2.toLowerCase()+S2.toUpperCase()+"]";
				
				Pattern p=Pattern.compile(regex);
				Matcher m=p.matcher(s);
				String replace=m.replaceAll("");

				System.out.println("The String after replacement is : "+ replace);
		
	}

}
