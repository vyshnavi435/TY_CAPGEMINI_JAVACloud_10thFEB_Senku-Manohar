package com.tyss.capgemini.collections;
// variable arguments
public class VaragsInputExample {
	
	public int add(int ...input) {// ... to give an integer type array as input
		int sum = 0;
		for (int i = 0; i < input.length; i++) {
			sum += input[i];// same as sum = sum + input[i];`
		}
		return sum;
		
	}
	public static void main(String[] args) {
		System.out.println("Sum: " + new VaragsInputExample().add(1,2,77,87));

}
}