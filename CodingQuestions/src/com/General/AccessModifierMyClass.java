package com.General;

public class AccessModifierMyClass {

	
	public static void main (String[]arg){
		
		AccessModifierStudent ams = new AccessModifierStudent();
		
		ams.setStuID(20);
		System.out.println(ams.StuID);
		
		ams.setStuname("Neil");
		ams.setAge(2);
		ams.setSSN(234523);
		
		System.out.println(ams.getStuname());
		
		System.out.println(ams.getAge());
		
		System.out.println(ams.getSSN());
		
	}
	
}
		
		
		
