package co.edu.DAO.ciclo3bakend;
import java.sql.*;
public class Conexion {
	
static String  db="proyecto";
static String login="root";
static String password ="admin123456";
static String url ="jdbc:mysql://localhost"+ db;

Connection connection = null;
/** 
 * Constructor de Conexion
 */

public Conexion() {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		connection = DriverManager.getConnection(url,login,password);
		if (connection!=null) {
			System.out.println("Conectado a la Base de Datos "+db+ "OK\n");
		}
	}catch(SQLException e) {
		System.out.println(e);
	}catch(ClassNotFoundException e) {
		System.out.println(e);
	}catch(Exception e) {
		System.out.println(e);
	}
}

public Connection getConnection() {
	return connection;
}

public void desconectar() {
	connection =null;
}
}
