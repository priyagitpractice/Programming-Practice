package com.collections;

public enum MonthsOfYear {
	
		JANUARY(1), FEBRUARY(2), MARCH(3), APRIL(4),MAY(5),JUNE(6),JULY(7), AUGUST(8), SEPTEMBER(9), OCTOBER(10), NOVEMBER(11), DECEMBER(12);
	
	private int value;
	
	private MonthsOfYear(int value){
		this.value=value;
		
		}
	
	

	
		public static void main(String[] args) {
			
			for (MonthsOfYear My : MonthsOfYear.values())
		
				System.out.println(My.name());
			

		}

	
}
