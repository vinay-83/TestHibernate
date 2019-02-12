package com.spring.annotation.JDBCDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DAO {

	public void test(Student std) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3309/student_info", "root", "root");
			PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?)");
			ps.setInt(1, std.getAge());
			ps.setString(2, std.getName());
			ps.setString(3, std.getCity());
			ps.setString(4, std.getQual());
			
			ps.executeUpdate();
			ps.close();
			con.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		

	}
}
