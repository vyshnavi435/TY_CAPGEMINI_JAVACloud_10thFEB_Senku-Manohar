package com.tyss.capgemini.inheitance;

public class SubClassL2 extends SubClassL1 {
	@Override
  public String print() {
		System.out.println("overriden print( ) of SuperClass in subClass2");
		return super.print();
	}
	@Override
	public void display() {
		// super.i ,it automatically checks for i(variable) in parent classes 
		super.i=12;//scope of super is only inside a method & it cannot be accessed within the scope of class
		super.display();
		System.out.println("overridden display() in subClass2 ");
	}
	
	
	public static void main(String[] args) {
		SubClassL2 subClassL2 =new SubClassL2();
		subClassL2.display();
		System.out.println(subClassL2.print());
		System.out.println("int i of SuperClass: "+subClassL2.i);//instance variable can be accessed using object reference
	}

}
