package reg;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	static Connection con=null;
	static{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/reg","root","root");  

			}catch(Exception e){}
	}
	public static Connection getCon(){
		return con;
	}
}
