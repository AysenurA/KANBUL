package sqlTable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 To do list :
 * Update / Delete methods
 *Change the '' for query. 
 */


				public class K�z�lay {
				private String _name;
				private String _password;
				private String _town;
				private String _city;
				private String _address;
				private String _email;
				private String _plate;
				private String _bloodType;
				private String _bloodTypeNum;
				public  Connection con = null;
				public  PreparedStatement pst = null;
				public ResultSet rs = null;	
				public K�z�lay() {
				   
				}
				public K�z�lay(String name,String password,String town,String city,String plate,String email,String address,String bloodType,String bloodTypeNum) throws SQLException {
						this._name=name;
						this._password=password;
						this._town=town;
						this._city=city;
						this._plate=plate;
						this._address=address;
						this._email=email;
						this._bloodType=bloodType;
						this._bloodTypeNum=bloodTypeNum;
						Insert(name,password,town,city,plate,address,email,bloodType,bloodTypeNum);
					}
				public String get_email() {
					return _email;
				}
				public String get_name() {
					return _name;
				}
				public String get_password() {
					return _password;
				}
				public String get_town() {
					return _town;
				}
				public String get_city() {
					return _city;
				}
				public String get_plate() {
					return _plate;
				}
				public String get_address() {
					return _address;
				}
				public String get_bloodType() {
					return _bloodType;
				}
				public String get_bloodTypeNum() {
					return _bloodTypeNum;
				}
				private void Connection() {
					try {
				
						con = DriverManager.getConnection(
								"jdbc:postgresql://localhost/Kanbul", "postgres",
								"1q2w3e4r");
				
					} catch (SQLException e) {
				
						System.out.println("Connection Failed! Check output console");
						e.printStackTrace();
						return;
				
					}
					if (con == null) {
							System.out.println("Failed to make connection!");
					}
				}
				
				public String Search(String email) throws SQLException {
					Connection();
				    String s=null;
				        pst = con.prepareStatement("SELECT * FROM \"kizilay\" WHERE email='"+email+"'");
				        rs = pst.executeQuery();
				        while (rs.next()) {
				        	s=rs.getString(7);
				        	System.out.println(s);
				       	}
				   return s;
				}
				
				public  void Insert(String name,String password,String town,String city,String plate,String address,String email,String bloodType,String bloodNum) throws SQLException {
					Connection();
				    String s=Search(email);
					if(s!=null) {
						System.out.println("The hospital is already exist");
					}
					else
					{		          
						Statement st = con.createStatement();
						st.executeUpdate("INSERT INTO kizilay" + " VALUES ('"
						+name+"' ,"+"'"+password+"' ,"+"'"+town+"',"+"'"+
				        			     city+"'," +"'"+plate+"',"+"'"+address+"',"+"'"+email+"', '"+bloodType+"', '"+bloodNum
				        			     +"')");			                
						//System.out.println(st.toString());
						System.out.println("S�STEME EKLEND� FRROM KIZILAY/HASTANE");
					    }
				}
				
				
				public static void main(String[]args) throws SQLException {
				K�z�lay a = new K�z�lay
						();
				a.Insert("a","b","c","d","e","f","j","h","�");
				}
				         
				}
				
