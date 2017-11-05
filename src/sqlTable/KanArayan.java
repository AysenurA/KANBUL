package sqlTable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class KanArayan {
private String _TELEPHONE;
private String _fname;
private String _mname;
private String _lname;
private String _bloodType;
private String _hospitalCity;
private String _hospitalTown;
public static Connection con = null;
public static PreparedStatement pst = null;
static ResultSet rs = null;

public KanArayan(String tel,String fname,String mname,String lname,String bloodT,String hospitalC,String hospitalT) {
	this._TELEPHONE=tel;
	this._fname=fname;
	this._mname=mname;
	this._lname=lname;
	this._bloodType=bloodT;
	this._hospitalCity=hospitalC;
	this._hospitalTown=hospitalT;
}

public String get_TELEPHONE() {
	return _TELEPHONE;
}

public String get_fname() {
	return _fname;
}

public String get_mname() {
	return _mname;
}

public String get_lname() {
	return _lname;
}

public String get_bloodType() {
	return _bloodType;
}

public String get_hospitalCity() {
	return _hospitalCity;
}

public String get_hospitalTown() {
	return _hospitalTown;
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
public static String search(String tel) throws SQLException {
	Connection();
    String s=null;
        pst = con.prepareStatement("SELECT * FROM \"kan_arayan\" WHERE telephone='"+tel+"'");
        rs = pst.executeQuery();
        while (rs.next()) {
        	s=rs.getString(1);
        	System.out.println(s);
       	}
   return s;
}
public static void insert(String tel) throws SQLException {
	Connection();
    String s=search(tel);
	if(s!=null) {
		System.out.println("The person is already exist");
	}
	else
	{		          
		Statement st = con.createStatement(); 
		st.executeUpdate("INSERT INTO kan_arayan " + 
	                "VALUES ('"+tel+"'"+", 'Aysenur','Nur','Avcý','0Rh+','yenimahalle', 'Ankara')"); 
	  
	    }
}
public static void delete(String tel) throws SQLException {
	Connection();
	String s=search(tel);
	if(s==null) {
		System.out.println("The person is not exist");
	}
	else {
			Statement st = con.createStatement();
			st.executeUpdate("DELETE FROM kan_arayan WHERE telephone ='"+tel+"'");
			System.out.println("Kan Arayan Delete Successfully....");
		}
}
public static void main(String[]args) throws SQLException {
//	insert("451248513");
//	insert("289751321");
//	insert("215498727");
//	delete("451248513");
}

}
