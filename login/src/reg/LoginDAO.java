package reg;

import java.sql.Connection;
import java.sql.PreparedStatement;

public interface LoginDAO {

	public static int Login(User u){
		int status=0;
		try{
			Connection con=ConnectionProvider.getCon();
            PreparedStatement ps=con.prepareStatement("insert into user values(?,?)");
            ps.setString(1,u.getId());
            ps.setString(1,u.getName());
            ps.setString(1,u.getPassword());
            
            status=ps.executeUpdate();
		}catch(Exception e){}
		
		return status;
	}
}
