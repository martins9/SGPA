package sgpa;

import java.sql.SQLException;

public class Principal 
{

	public static void main(String[] args) throws SQLException
	{
	
		JDBCExample jdbcexample = new JDBCExample();
		
		jdbcexample.informacao();
	}
}
