package com.tyss.capgemini.controlflowstatements;

public class ElseIfLadder {
	public static void main(String[] args) {
		int number=14;
		if(number < 13) {

			System.out.println("not a teen number");
		}

		else if(number >=13 && number <=19) {
			System.out.println("teen number");
		}
		else {
			System.out.println("not a teen number(above 19)");
		}

	}

}
