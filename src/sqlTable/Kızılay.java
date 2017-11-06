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


				public class Kýzýlay {
				private String _name;
				private String _password;
				private String _town;
				private String _city;
				private String _EMAIL;
				private String _address;
				public  Connection con = null;
				public  PreparedStatement pst = null;
				public ResultSet rs = null;
						
			   public Kýzýlay() {
				   
			   }
			   public Kýzýlay(String name,String password,String town,String city,String email,String address,String bloodType,String bloodTypeNum) throws SQLException {
						this._name=name;
						this._password=password;
						this._town=town;
						this._city=city;
						this._EMAIL=email;
						this._address=address;
						Insert(name,password,town,city,email,address,bloodType,bloodTypeNum);
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
				public String get_EMAIL() {
					return _EMAIL;
				}
				public String get_address() {
					return _address;
				}
				private void Connection() {
					try {
				
						con = DriverManager.getConnection(
								"jdbc:postgresql://localhost/KanBul", "postgres",
								"Aybike_95");
				
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
				        	s=rs.getString(1);
				        	System.out.println(s);
				       	}
				   return s;
				}
				
				public  void Insert(String name,String password,String town,String city,String email,String address,String bloodType,String bloodNum) throws SQLException {
					Connection();
				    String s=Search(email);
					if(s!=null) {
						System.out.println("The hospital is already exist");
					}
					else
					{		          
						Statement st = con.createStatement(); 
						String sql="INSERT INTO kizilay " + 
					                "VALUES ('"+name+"', '"+ password+"', '"+town+"', '"+city+"' , "+null+", '"+address+"'"+", '"+email+"' , '"+bloodType+"'"+", '"+bloodNum+"'"; 
						st.executeUpdate(sql);
						System.out.println(st.toString());
						System.out.println("SÝSTEME EKLENDÝ FRROM KIZILAY/HASTANE");
					    }
				}
				
				
				public static void main(String[]args) throws SQLException {
				Kýzýlay a = new Kýzýlay
						();
				System.out.println("kýzýlajasdhasjdh");
				a.Insert("","","","","","","","");
				}
				         
				}
				
