package com.tyss.capgemini.controlflowstatements;
//switch like a cd player(can directly select a required song or can play from  start)
public class SwitchCaseExample {//switch case  go and checks for equality(works only for byte,short,int,string,char)
	public static void main(String[] args) {
         String day="Monday";
         switch(day) {
         case "Monday" :
        	 System.out.println("weekday");
        	 break;//if compiler encounters break it comes out of the block
         case "Tuesday" :
        	 System.out.println("weekday");
        	 break;
         case "Wednesday" :
        	 System.out.println("weekday");
        	 break;
         case "Thursday" :
        	 System.out.println("weekday");
        	 break;
         case "Friday" :
        	 System.out.println("weekday");
        	 break;
         case "Saturday" :
        	 System.out.println("weekEnd");
        	 break;
         case "Sunday" :
        	 System.out.println("weekEnd");
        	 break;
            default://default is not mandatory &  if default is btw cases then break is mandatory & it can be written anywhere in switch.
            	System.out.println("Invalid day");
            	
         	 
         }
	}
}
