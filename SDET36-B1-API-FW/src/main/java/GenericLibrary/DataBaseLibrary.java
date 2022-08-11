package GenericLibrary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;

/**
 * 
 * @author iamsachin
 *
 */
public class DataBaseLibrary
{
	Driver driverRef;
	Connection conn;
	
	/**
	 * This method will establish the connection with mysql db
	 * @throws SQLException
	 */
	public void connectToDB() throws SQLException
	{
		driverRef=new Driver();
		DriverManager.registerDriver(driverRef);
		conn=DriverManager.getConnection(IConstants.dbURL,IConstants.dbUserName,IConstants.dbPassword);
	}
	
	/**
	 * This method will close the database connection
	 * @throws SQLException
	 */
	public void closeDB() throws SQLException 
	{
		conn.close();
	}
	
	boolean flag=false;
	public String readDataFromDBandValidate(String query,int columnIndex,String expData) throws SQLException
	{
		
		ResultSet result =conn.createStatement().executeQuery(query);
		while(result.next())
		{
			if(result.getString(columnIndex).equals(expData))
			{
				flag=true;
				continue;
			}
		}
		if(flag)
		{
			System.out.println("Data is verified");
			return expData;
		}
		else
		{
			System.out.println("Data not verified");
			return "";
		}
	}
}
