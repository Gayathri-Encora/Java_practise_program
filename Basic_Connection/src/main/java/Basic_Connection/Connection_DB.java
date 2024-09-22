package Basic_Connection;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Connection_DB {

	public static void main(String[] args) {
		String url = "jdbc:mssql://localhost:3306/user_details";
        String user = "root";
        String password = "";
        try {
        	Connection gayu=DriverManager.getConnection(url,user,password);
        	System.out.println("Connection Successful!!!");
        	Statement s=gayu.createStatement();
        	
        	String query = "SELECT * FROM mytable";
            ResultSet rs = s.executeQuery(query);
            while (rs.next()) {
                // Process the result set
                int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println("ID: " + id + ", Name: " + name);
            }
        	
        }catch(SQLException e) {
        	e.printStackTrace();
        }


	}

}

