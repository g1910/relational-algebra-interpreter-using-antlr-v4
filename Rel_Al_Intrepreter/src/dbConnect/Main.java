package dbConnect;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.SQLException;

public class Main {

	/*
	 * Execution starts from here, first connection with the database
	 * is established, followed by inputting a relational algebra
	 * expression from the user, building an SQL query from the 
	 * expression and finally executing the query on the database
	 * and displaying the results
	 */
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		//Establishing connection with database
		DatabaseConnectionManager dbConn = new DatabaseConnectionManager();
		Connection conn = dbConn.getConnection();
		
		//Inputting relational algebra expression from the user
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			String relationalExp;
			while((relationalExp = in.readLine())!=null){
				//Building query from the expression and executing the query
				QueryExecutor.execute(QueryBuilder.buildQuery(relationalExp),conn);
			}
			//Closing the input buffer reader
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
