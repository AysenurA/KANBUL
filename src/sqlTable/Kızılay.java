package sqlTable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Kýzýlay {
private String _hospitalName;
private String _hospitalPassword;
private String _hospitalTown;
private String _hospitalCity;
public static Connection con = null;
public static PreparedStatement pst = null;
static ResultSet rs = null;
public Kýzýlay(String hospitalN,String hospitalP,String hospitalT,String hospitalC) {
	this._hospitalName=hospitalN;
	this._hospitalPassword=hospitalP;
	this._hospitalTown=hospitalT;
	this._hospitalCity=hospitalC;
}
public String get_hospitalName() {
	return _hospitalName;
}
public String get_hospitalPassword() {
	return _hospitalPassword;
}
public String get_hospitalTown() {
	return _hospitalTown;
}
public String get_hospitalCity() {
	return _hospitalCity;
}
private static void Connection() {
	try {

		con = DriverManager.getConnection(
				"jdbc:postgresql://localhost/KANBUL", "postgres",
				"123456");
		


	} catch (SQLException e) {

		System.out.println("Connection Failed! Check output console");
		e.printStackTrace();
		return;

	}
	if (con == null) {
			System.out.println("Failed to make connection!");
	}
}
public static String Search(String hname) throws SQLException {
	Connection();
    String s=null;
        pst = con.prepareStatement("SELECT * FROM \"kizilay\" WHERE hospitalname='"+hname+"'");
        rs = pst.executeQuery();
        while (rs.next()) {
        	s=rs.getString(1);
        	System.out.println(s);
       	}
   return s;
}

public static void InsertHospital(String hname) throws SQLException {
	Connection();
    String s=Search(hname);
	if(s!=null) {
		System.out.println("The hospital is already exist");
	}
	else
	{		          
		Statement st = con.createStatement(); 
		st.executeUpdate("INSERT INTO kizilay " + 
	                "VALUES ('"+hname+"'"+", '12345', 'yenimahalle', 'Ankara')"); 
	  
	    }
}

public static void main(String[]args) throws SQLException {
//	InsertHospital("Istanbul hastanesi");
}
         
}

