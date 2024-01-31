package com.Basics;

import java.sql.CallableStatement; 
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.sql.Statement;
public class JdConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		String url="jdbc:mysql://localhost:3306/ch13"; 
//        String username="root"; 
//        String password="root"; 
//       Class.forName("com.mysql.cj.jdbc.Driver"); 
//        Connection con=DriverManager.getConnection(url,username,password); 
//        Statement st=con.createStatement(); 
//        int rs=st.executeUpdate("INSERT INTO EMPLOYEE VALUES(1,'charan','A','MALE')"); 
//        if(rs>0) 
//            System.out.println("INSERT SUCCESSFULLY"); 
//        else 
//         System.out.println("please  try again"); 
//               con.close();	
		String url="jdbc:mysql://localhost:3306/ch13"; 
        String username="root"; 
        String password="root"; 
        //load and register the driver
       Class.forName("com.mysql.cj.jdbc.Driver"); 
       //establish the connection between java and DB
        Connection con=DriverManager.getConnection(url,username,password); 
        CallableStatement cst=con.prepareCall("call proc()");
       
        Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        ResultSet rs=st.executeQuery("select * from employee");
        while(rs.next())
        {
        	System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t");
        	System.out.println(rs.getString(3)+"\t"+rs.getInt(4)+"\t");
//        	System.out.println(rs.getString(5)+"\t"+rs.getInt(6)+"\t");
//        	System.out.println(rs.getString(7));
        	
        }
        System.out.println("IN BACKWARD DIRECTION");
        while(rs.previous())
        {
        	System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t");
        	System.out.println(rs.getString(3)+"\t"+rs.getInt(4)+"\t");
//        	System.out.println(rs.getString(5)+"\t"+rs.getInt(6)+"\t");
//        	System.out.println(rs.getString(7));
        }
        con.close();
	}

}
