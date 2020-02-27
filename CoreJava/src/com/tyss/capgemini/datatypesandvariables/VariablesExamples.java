package com.tyss.capgemini.datatypesandvariables;
@SuppressWarnings("unused")
public class VariablesExamples {
	static byte sGByte;
	static short sGShort;
	static int sGInt;
	static long sGLong;
	static float sGFloat;
	static double sGDouble;
	static char sGChar;
	static boolean sGIsTrue;
	static String sGString;
	String name;
	public static void main(String[] args) {

		byte lByte;
		short lShort;
		int lInt;
		long lLong;
		float lFloat;
		double lDouble;
		char lChar;
		boolean lIsTrue;
		String lString;
		//System.out.println(name); shows an error bcz it is non-static variable & non-static variables cannot be accessed inside main bcz it is a static method & we can access them using object reference
		//System.out.println(lByte); shows error bcz its a local varible & we can access them by initializing
		System.out.println(sGByte);
		System.out.println(sGShort);
		System.out.println(sGInt);
		System.out.println(sGLong);
		System.out.println(sGFloat);
		System.out.println(sGDouble);
		System.out.println(sGChar);
		System.out.println(sGIsTrue);
		System.out.println(sGString);

	}
}
