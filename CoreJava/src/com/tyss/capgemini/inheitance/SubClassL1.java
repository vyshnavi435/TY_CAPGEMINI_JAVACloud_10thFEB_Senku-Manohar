package com.tyss.capgemini.inheitance;

public class SubClassL1  extends SuperClass{
	//casting(up&down)
	@Override
	public String print() {//method overriding
		
		return "Some Other String";
	}
	public void display() {
		System.out.println("display() of subclass L1");
	}
	
	public static void main(String[] args) {
		SuperClass superClass=new SuperClass();
		SubClassL1 subClassL1=new SubClassL1();
		SuperClass superClass2=new SubClassL1();//up-casting
		//SubClassL1 scl=new SuperClass();(error bcz )
		//SubClassL1 scl=(SubClassL1) new SuperClass();this is downcasting and it cannot be done with out upcasting
		SubClassL1 subClassL12 =( SubClassL1) superClass2;//down-casting
		
		System.out.println(superClass.print());
		System.out.println(subClassL1.print());
		System.out.println(subClassL12.print());
		subClassL1.display();
		
		
	}

}
