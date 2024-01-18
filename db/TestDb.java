package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDb {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//register driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		//getConnection(url,un,psw)
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","12345678");
		
		
		//----------------------------INSERT SQL------------------------------
		
//		//1.Write sql
//		String sql="insert into user(id,username,password)values(3,'amrit','556')";
//		
//		//2. Create statement
//		Statement stm =con.createStatement();
//		//2. execute sql
//		stm.execute(sql);
//		//4. close db
//		con.close();
//		System.out.println("Successful");
		
		//-----------------------Update sql-------------------
		String sql ="update user set password='test' where id=3";
		Statement stm = con.createStatement();
		stm.execute(sql);
		System.out.println("Success");
		
		
	}

}
