package reg;

import java.sql.DriverManager;

@SuppressWarnings("unused")
public interface Provider {
String DRIVER="com.mysql.jdbc.Driver";
String CONNECTION_URL="jdbc:mysql://localhost:3306/reg";
String USERNAME="root";
String PASSWORD="root";

}
