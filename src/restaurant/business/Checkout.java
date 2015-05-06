package restaurant.business;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Checkout 
{
	private static String connectionString = "jdbc:sqlserver://localhost:1433; databaseName=RestaurantDB; user=sa; password=P@$$w0rd1;";
	
	private static void DataConnection() 
	{
		try {
			// 1. Connect to Database
			
			Connection myConn = DriverManager.getConnection(connectionString);

			Statement st = myConn.createStatement();
			String getAllEmployees = "SELECT * FROM Employees";						
			
			// Get Employees through hard code 
			ResultSet rs = st.executeQuery(getAllEmployees);


			while (rs.next()) 
			{
				System.out.print(rs.getString("empFirstName") + " ");
				System.out.println(rs.getString("empLastName"));
			}

			// 2. Create a statement			
			// myConn.getClientInfo();
			
			// 3. Execute SQL query

			// 4. Process result set

			System.out.println();
		} 
		catch (Exception ex) 
		{
			ex.printStackTrace();			
		}

	}
}
