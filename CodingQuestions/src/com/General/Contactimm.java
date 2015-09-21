package com.General;

public final class Contactimm {
	
	public final String name;
	
	public final String mobile;
	
	public Contactimm(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }
  
    public String getName(){
        return name;
    }
  
    public String getMobile(){
        return mobile;
    }
   public static void main(String [] args){
	   Contactimm a = new Contactimm("AB", "1234");
	   System.out.println(a.getName() + " " + a.getMobile());
   }
}




