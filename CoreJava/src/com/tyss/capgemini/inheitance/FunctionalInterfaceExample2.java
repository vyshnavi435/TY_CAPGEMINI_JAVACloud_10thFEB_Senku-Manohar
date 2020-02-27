package com.tyss.capgemini.inheitance;
@FunctionalInterface
public interface FunctionalInterfaceExample2 {
      public  int add(int i,int j);
	
      
    public static void Messageprint() {
 		System.out.println("public static printMessage() of FunctionalInterfaceExample");
  	}

  	default void Messagedisplay() {
 		System.out.println("default displayMessage of FunctionalInterfaceExample");
  	}
}
