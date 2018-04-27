package reg;

import java.sql.*; 

public class RegisterDao {

	public static int register(User u){
		int status=0;
		try{
			Connection con=ConnectionProvider.getCon();
            PreparedStatement ps=con.prepareStatement("insert into user values(?,?,?,?,?)");
            ps.setString(1,u.getId());
            ps.setString(2,u.getName());
            ps.setString(3,u.getAddress());
            ps.setString(4,u.getEmail());
            ps.setString(5,u.getPassword());
            ps.setString(6,u.getGender());
			
			status=ps.executeUpdate();
		}catch(Exception e){}
		
		return status;
	}
}
