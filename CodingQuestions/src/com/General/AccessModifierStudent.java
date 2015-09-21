package com.General;

public class AccessModifierStudent {
	private String Stuname;
	private int age;
	protected int SSN;
	public int StuID;
	
	
	public void setStuID(int StuID) {
		this.StuID = StuID;
	}
		
		
	public String getStuname() {
		return Stuname;
	}
	public void setStuname(String stuname) {
		Stuname = stuname;
	}
	
	public int getAge()
	{
		return age;
	}
	public void setAge(int ageOfStu)
	{
		age = ageOfStu;
	}
	public int getSSN() {
		return SSN;
	}
	public void setSSN(int sSN) {
		SSN = sSN;
	}

	
				
	}

