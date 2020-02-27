package com.tyss.capgemini.strings;
//StringBuffer is mutable
public class StringBufferExample {
	public static void main(String[] args) {
		String string="Some String";
		StringBuffer stringBuffer =new StringBuffer(string);//converting a string to string buffer
		System.out.println(stringBuffer.getClass());
		System.out.println(stringBuffer.length());
	
		stringBuffer.append("Buffer");
		System.out.println(stringBuffer);
		System.out.println(stringBuffer.reverse());
		System.out.println(stringBuffer.reverse());
		
		System.out.println(stringBuffer.replace(0, 1, "s"));
		
		System.out.println(stringBuffer.insert(5, "kbc"));//inserts the given characters in specified index

		System.out.println(stringBuffer.indexOf("xyz"));//not present in original string
		System.out.println(stringBuffer.indexOf("kb"));
		System.out.println(stringBuffer.delete(5, 8));//delete characters from given index
		
	}

}
