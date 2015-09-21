package com.General;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

		public static Connection con;
		
		public static Connection getConnection() throws SQLException{
			
			if (con!=null)
			try {
				Class.forName("Oracle.JDBC.driver.OracleDriver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("driver is loaded");
			
			return con = DriverManager.getConnection("jdbc:oracle:thin:hr@//localhost:1521/xe", "hr", "hr");
		}
			
public void getEmpdata() throws SQLException{

	Statement stmt = con.createStatement();
	ResultSet rs = stmt.executeQuery("select * from Employee");
	int count = 0;

while (rs.next()){
count ++;
String fName= rs.getString("FIRST_NAME");
String lName = rs.getString("LAST_NAME");

System.out.println("First Name = " +fName + "Last Name " + lName);
}

rs.close();
stmt.close();
con.close();
}



public static void main (String [] arg) throws SQLException{
Connection con = getConnection();
JDBC jd = new JDBC();

jd.getEmpdata();

}
}

